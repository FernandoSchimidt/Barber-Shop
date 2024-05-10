package com.fernandoschimidt.barbershop.barber;

import com.fernandoschimidt.barbershop.common.PageResponse;
import com.fernandoschimidt.barbershop.user.User;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BarberItensService {

    private final BarberItensRepository repository;
    private final BarberItenMapper mapper;


    public Integer save(BarberItenRequest request, Authentication connectedUser) {
        User user = ((User) connectedUser.getPrincipal());
        BarberIten barberIten = mapper.toItem(request);
        return repository.save(barberIten).getId();
    }

    public BarberItenResponse findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toItemResponse)
                .orElseThrow(() -> new EntityNotFoundException("No service found with the ID::" + id));
    }

    public PageResponse<BarberItenResponse> findAllService(int page, int size, Authentication connectedUser) {
        User user = ((User) connectedUser.getPrincipal());
        Pageable pageable = PageRequest.of(page, size, Sort.by("createdDate").descending());
        Page<BarberIten> itens = repository.findAll(pageable);
        List<BarberItenResponse> itenResponses = itens.stream()
                .map(mapper::toItemResponse)
                .toList();
        return new PageResponse<>(
                itenResponses,
                itens.getNumber(),
                itens.getSize(),
                itens.getTotalElements(),
                itens.getTotalPages(),
                itens.isFirst(),
                itens.isLast()
        );
    }

}
