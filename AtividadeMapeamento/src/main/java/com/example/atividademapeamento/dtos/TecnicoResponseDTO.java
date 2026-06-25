package com.example.atividademapeamento.dtos;


import com.example.atividademapeamento.entity.Tecnico;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TecnicoResponseDTO {

    private Long id;
    private String nome;
    private String nacionalidade;
    private Integer idade;
    private Integer experiencia;
    private String nomeDoTime;

    public static TecnicoResponseDTO entityToDto(Tecnico tecnico){
        return TecnicoResponseDTO.builder()
                .id(tecnico.getId())
                .nome(tecnico.getNome())
                .nacionalidade(tecnico.getNacionalidade())
                .idade(tecnico.getIdade())
                .experiencia(tecnico.getExperiencia())
                .build();
    }
}
