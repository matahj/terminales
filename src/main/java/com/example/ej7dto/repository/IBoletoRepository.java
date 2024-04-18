package com.example.ej7dto.repository;

import com.example.ej7dto.entity.Boleto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBoletoRepository extends JpaRepository<Boleto, Long> {
}
