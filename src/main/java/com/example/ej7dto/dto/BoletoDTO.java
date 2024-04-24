package com.example.ej7dto.dto;

import com.example.ej7dto.entity.Cliente;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BoletoDTO {
    private long id;
    private int numeroAsiento;
    private LocalDate fechaCompra;
    ClienteDTO cliente;
}
