package com.example.atividademapeamento.dtos;


import com.example.atividademapeamento.entity.Tecnico;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
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
public class TecnicoRequestDTO {

    @Size(min = 2, max = 100, message = "O nome deve ter entre 2 e 100 caracteres")
    private String nome;

    @Size(min = 2, max = 100, message = "A nacionalidade deve ter entre 2 e 100 caracteres")
    private String nacionalidade;

    @Min(value = 18, message = "A idade deve ser no mínimo 18 anos")
    @Max(value = 100, message = "A idade deve ser no máximo 100 anos")
    private Integer idade;

    @Positive(message = "O valor deve ser positivo")
    private Integer experiencia;

    private Long idTime;

    public static Tecnico dtoToEntity(TecnicoRequestDTO tecnicoRequestDTO) {
        return Tecnico.builder()
                .nome(tecnicoRequestDTO.getNome())
                .nacionalidade(tecnicoRequestDTO.getNacionalidade())
                .idade(tecnicoRequestDTO.getIdade())
                .experiencia(tecnicoRequestDTO.getExperiencia())
                .build();
    }
}

