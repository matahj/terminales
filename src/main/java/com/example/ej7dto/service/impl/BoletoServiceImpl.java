package com.example.ej7dto.service.impl;

import com.example.ej7dto.dto.BoletoDTO;
import com.example.ej7dto.entity.Boleto;
import com.example.ej7dto.mapper.IBoletoMapper;
import com.example.ej7dto.repository.IBoletoRepository;
import com.example.ej7dto.service.IBoletoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BoletoServiceImpl implements IBoletoService {

    private IBoletoMapper boletoMapper;
    private IBoletoRepository boletoRepository;

    public BoletoServiceImpl(IBoletoMapper boletoMapper, IBoletoRepository boletoRepository) {
        this.boletoMapper = boletoMapper;
        this.boletoRepository = boletoRepository;
    }

    @Override
    public BoletoDTO save(BoletoDTO boletoDTO) {
        Boleto boleto = boletoMapper.toEntity(boletoDTO);
        return boletoMapper.toDTO(boletoRepository.save(boleto));
    }

    @Override
    public List<BoletoDTO> findAll() {
        List<Boleto> boletos = boletoRepository.findAll();
        List<BoletoDTO> boletoDTOS = new ArrayList<>();
        for (Boleto b : boletos) {
            boletoDTOS.add(boletoMapper.toDTO(b));
        }
        return boletoDTOS;
    }

    @Override
    public Optional<BoletoDTO> findById(long id) {
        return null;
    }

    @Override
    public void update(long id, BoletoDTO boletoDTO) throws Exception{
        Optional<Boleto> resultado = boletoRepository.findById(id);
        if (resultado.isEmpty()) {
            throw new Exception("El curso no existe");
        }
        Boleto boleto = resultado.get();
        boleto.setNumeroAsiento(boletoDTO.getNumeroAsiento());
        boletoRepository.save(boleto);
    }

    @Override
    public void delete(long id) {
        boletoRepository.deleteById(id);
    }
}
