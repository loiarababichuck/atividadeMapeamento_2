package com.example.atividademapeamento.dtos;


import com.example.atividademapeamento.entity.Jogador;
import com.example.atividademapeamento.entity.Tecnico;
import com.example.atividademapeamento.entity.Time;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TimeResponseDTO {

    private Long id;
    private String nome;
    private String cidade;
    private String estadio;
    private Integer titulos;
    private Tecnico tecnico;
    private List<Jogador> jogadores;

    public static TimeResponseDTO entityToDto(Time time){
        return TimeResponseDTO.builder()
                .id(time.getId())
                .nome(time.getNome())
                .cidade(time.getCidade())
                .estadio(time.getEstadio())
                .titulos(time.getTitulos())
                .tecnico(time.getTecnico())
                .titulos(time.getTitulos())
                .build();
    }
}
