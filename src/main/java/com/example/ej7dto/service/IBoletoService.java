package com.example.ej7dto.service;

import com.example.ej7dto.dto.BoletoDTO;

import java.util.List;

public interface IBoletoService {
    List<BoletoDTO> findAll();
    BoletoDTO findById(long id);
    BoletoDTO save(BoletoDTO boletoDTO);
    BoletoDTO update(long id, BoletoDTO boletoDTO);
    void delete(long id);
}
