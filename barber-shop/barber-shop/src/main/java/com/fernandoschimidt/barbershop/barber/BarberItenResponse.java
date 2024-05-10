package com.fernandoschimidt.barbershop.barber;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BarberItenResponse {
    private Integer id;
    private String service;
    private String description;
    private Double price;
    private String owner;
}
