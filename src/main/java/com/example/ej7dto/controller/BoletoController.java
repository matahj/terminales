package com.example.ej7dto.controller;

import com.example.ej7dto.dto.BoletoDTO;
import com.example.ej7dto.dto.ClienteDTO;
import com.example.ej7dto.service.IBoletoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class BoletoController {

    private IBoletoService boletoService;
    public BoletoController(IBoletoService boletoService) {
        this.boletoService = boletoService;
    }

    @PostMapping("/boletos")
    public BoletoDTO save(@RequestBody BoletoDTO boletoDTO) {
        return boletoService.save(boletoDTO);
    }

    @GetMapping("/boletos")
    public List<BoletoDTO> findAll() {
        return boletoService.findAll();
    }

    @PutMapping("/boletos/{id}")
    public void update(@PathVariable("id") long id, @RequestBody BoletoDTO boletoDTO) {
        boletoService.update(id, boletoDTO);
    }

    @DeleteMapping("/boletos/{id}")
    public void delete(@PathVariable("id") long id) {
        boletoService.delete(id);
    }

}
