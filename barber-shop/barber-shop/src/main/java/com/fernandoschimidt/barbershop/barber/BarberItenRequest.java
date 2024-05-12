package com.fernandoschimidt.barbershop.barber;

import jakarta.validation.constraints.NegativeOrZero;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record BarberItenRequest(
        Integer id,

        @NotNull(message = "100")
        @NotEmpty(message = "100")
        String service,
        @NotNull(message = "100")
        @NotEmpty(message = "100")
        String description,
                Double price
) {
}
