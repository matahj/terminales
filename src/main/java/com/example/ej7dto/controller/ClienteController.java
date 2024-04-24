package com.example.ej7dto.controller;

import com.example.ej7dto.dto.ClienteDTO;
import com.example.ej7dto.service.IClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private IClienteService clienteService;

    public ClienteController(IClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping("/")
    public ClienteDTO save(@RequestBody ClienteDTO clienteDTO){
        return clienteService.save(clienteDTO);
    }

    @GetMapping("/")
    public List<ClienteDTO> findAll(){
        return clienteService.findAll();
    }
}

