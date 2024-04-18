package com.example.ej7dto.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BoletoDTO {
    private long id;
    private String numeroAsientos;
    private LocalDate fechaCompra;
}
