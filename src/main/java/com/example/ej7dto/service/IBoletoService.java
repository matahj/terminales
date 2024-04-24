package com.example.ej7dto.service;

import com.example.ej7dto.dto.BoletoDTO;

import java.util.List;
import java.util.Optional;

public interface IBoletoService {
    BoletoDTO save(BoletoDTO boletoDTO);
    List<BoletoDTO> findAll();
    Optional<BoletoDTO> findById(long id);
    void update(long id, BoletoDTO boletoDTO);
    void delete(long id);
}

