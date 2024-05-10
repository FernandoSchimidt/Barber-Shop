package com.fernandoschimidt.barbershop.barber;

import com.fernandoschimidt.barbershop.common.PageResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("barber")
@RequiredArgsConstructor
public class BarberItenController {

    private final BarberItensService service;

    @PostMapping
    public ResponseEntity<Integer> create(@RequestBody
                                          @Valid
                                          BarberItenRequest request,
                                          Authentication connectedUser) {
        return ResponseEntity.ok(service.save(request, connectedUser));
    }

    @GetMapping("{iten-id}")
    public ResponseEntity<BarberItenResponse> findItenById(
            @PathVariable("inten-id") Integer id
    ) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping
    public ResponseEntity<PageResponse<BarberItenResponse>> findAllServices(
            @RequestParam(name = "page", defaultValue = "0", required = false) int page,
            @RequestParam(name = "size", defaultValue = "10", required = false) int size,
            Authentication connectedUser
    ) {
        return ResponseEntity.ok(service.findAllService(page, size, connectedUser));
    }
}
