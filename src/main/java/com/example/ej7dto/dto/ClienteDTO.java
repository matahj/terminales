package com.example.ej7dto.dto;

import lombok.Data;

@Data
public class ClienteDTO {
    private long id;
    private String nombre;
    private String correo;
    private String password;
}
