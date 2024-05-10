package com.fernandoschimidt.barbershop.barber;

import org.springframework.stereotype.Service;

@Service
public class BarberItenMapper {

    public BarberIten toItem(BarberItenRequest request) {
        return BarberIten.builder()
                .id(request.id())
                .service(request.service())
                .description(request.description())
                .price(request.price())
                .build();
    }

    public BarberItenResponse toItemResponse(BarberIten iten) {
        return BarberItenResponse.builder()
                .id(iten.getId())
                .service(iten.getService())
                .description(iten.getDescription())
                .price(iten.getPrice())
                .owner(iten.getOwner().fullName())
                .build();
    }
}
