package com.example.ej7dto.controller;

import com.example.ej7dto.dto.BoletoDTO;
import com.example.ej7dto.dto.ClienteDTO;
import com.example.ej7dto.service.IBoletoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boletos")
public class BoletoController {

    private IBoletoService boletoService;
    public BoletoController(IBoletoService boletoService) {
        this.boletoService = boletoService;
    }

    @PostMapping("/")
    public BoletoDTO save(@RequestBody BoletoDTO boletoDTO) {
        return boletoService.save(boletoDTO);
    }

    @GetMapping("/")
    public List<BoletoDTO> findAll() {
        return boletoService.findAll();
    }

}
