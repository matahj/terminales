package com.example.ej7dto.mapper;

import com.example.ej7dto.dto.BoletoDTO;
import com.example.ej7dto.entity.Boleto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface IBoletoMapper {
    BoletoDTO toDTO(Boleto boleto);
    Boleto toEntity(BoletoDTO boletoDTO);
}
