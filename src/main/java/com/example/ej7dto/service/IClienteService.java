package com.example.ej7dto.service;

import com.example.ej7dto.dto.ClienteDTO;

import java.util.List;
import java.util.Optional;

public interface IClienteService {
    ClienteDTO save(ClienteDTO clienteDTO);
    List<ClienteDTO> findAll();
    Optional<ClienteDTO> findById(Long id);
    void update(long id, ClienteDTO clienteDTO);
    void deleteById(long id);
}

//  /clientes           post      body      C
//  /clientes           get                 R
//  /clientes/{id}      get                 R
//  /lcientes/{id}      put       body      U
//  /clientes/{id}      delete              D

