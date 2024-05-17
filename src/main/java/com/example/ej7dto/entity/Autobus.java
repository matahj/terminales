package com.example.ej7dto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@Entity
@Table(name = "autobuses")
public class Autobus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "matricula", nullable = false, unique = true)
    private String matricula;
    @Column(name = "clase", nullable = false)
    private String clase;
    @Column(name = "numero_asientos", nullable = false)
    private int numeroAsientos;
}
