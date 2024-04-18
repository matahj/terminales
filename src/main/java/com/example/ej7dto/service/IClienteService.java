package com.example.ej7dto.service;

import com.example.ej7dto.dto.ClienteDTO;

import java.util.List;

public interface IClienteService {
    List<ClienteDTO> findAll();
    ClienteDTO findById(Long id);
    ClienteDTO save(ClienteDTO clienteDTO);
    void deleteById(long id);
    void update(long id, ClienteDTO clienteDTO);
}
