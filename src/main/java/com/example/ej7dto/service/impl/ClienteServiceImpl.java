package com.example.ej7dto.service.impl;

import com.example.ej7dto.dto.ClienteDTO;
import com.example.ej7dto.service.IClienteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Override
    public List<ClienteDTO> findAll() {
        return List.of();
    }

    @Override
    public ClienteDTO findById(Long id) {
        return null;
    }

    @Override
    public ClienteDTO save(ClienteDTO clienteDTO) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public void update(long id, ClienteDTO clienteDTO) {

    }
}
