package com.example.ej7dto.service.impl;

import com.example.ej7dto.dto.ClienteDTO;
import com.example.ej7dto.entity.Cliente;
import com.example.ej7dto.mapper.IClienteMapper;
import com.example.ej7dto.repository.IClienteRepository;
import com.example.ej7dto.service.IClienteService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements IClienteService {

    private IClienteMapper clienteMapper;
    private IClienteRepository clienteRepository;

    public ClienteServiceImpl(IClienteMapper clienteMapper, IClienteRepository clienteRepository) {
        this.clienteMapper = clienteMapper;
        this.clienteRepository = clienteRepository;
    }

    @Override
    public ClienteDTO save(ClienteDTO clienteDTO) {
        Cliente cliente = clienteMapper.toEntity(clienteDTO);
        Cliente clienteRegresado = clienteRepository.save(cliente);
        ClienteDTO clienteDTORegresado = clienteMapper.toDTO(clienteRegresado);

        return clienteDTORegresado;
    }

    @Override
    public List<ClienteDTO> findAll() {
        List<Cliente> clientes = clienteRepository.findAll();
        List<ClienteDTO> clienteDTOs = new ArrayList<>();
        for (Cliente c : clientes) {
            clienteDTOs.add(clienteMapper.toDTO(c));
        }
        return clienteDTOs;
    }

    @Override
    public Optional<ClienteDTO> findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public void update(long id, ClienteDTO clienteDTO) {

    }
}
