package com.example.atividademapeamento.dtos;


import com.example.atividademapeamento.entity.Time;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class TimeRequestDTO {

    @Size(min = 2, max = 100, message = "O nome deve ter entre 2 e 100 caracteres")
    private String nome;

    @Size(min = 2, max = 100, message = "O nome deve ter entre 2 e 100 caracteres")
    private String cidade;

    @Size(min = 2, max = 100, message = "O nome deve ter entre 2 e 100 caracteres")
    private String estadio;

    @PositiveOrZero(message = "O numero de títulos deve ser zero ou positivo")
    private Integer titulos;

    public static Time dtoToEntity(TimeRequestDTO timeRequestDTO) {
        return Time.builder()
                .nome(timeRequestDTO.getNome())
                .cidade(timeRequestDTO.getCidade())
                .estadio(timeRequestDTO.getEstadio())
                .titulos(timeRequestDTO.getTitulos())
                .build();
    }
}
