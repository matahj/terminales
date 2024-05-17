package com.example.ej7dto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@Entity
@Table(name = "viajes")
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "asientos_disponibles", nullable = false)
    private int asientosDisponibles;
    @Column(name = "precio", nullable = false)
    private double precio;
    @Column(name = "fecha_salida", nullable = false)
    private LocalDate fechaSalida;
    @Column(name = "fecha_creacion", nullable = false)
    private LocalDate fechaCreacion;
    @Column(name = "fecha_modificacion", nullable = false)
    private LocalDate fechaModificacion;
}
