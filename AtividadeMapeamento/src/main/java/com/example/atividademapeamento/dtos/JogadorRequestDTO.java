package com.example.atividademapeamento.dtos;


import com.example.atividademapeamento.entity.Jogador;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
public class JogadorRequestDTO {

    @Size(min = 2, max = 100, message = "O nome deve ter entre 2 e 100 caracteres")
    private String nome;

    @Size(min = 2, max = 50, message = "O nome deve ter entre 2 e 50 caracteres")
    private String posicao;

    @Min(value = 16, message = "A idade deve ser no mínimo 16 anos")
    @Max(value = 50, message = "A idade deve ser no máximo 50 anos")
    private Integer idade;

    @Min(value = 1, message = "O número deve estar entre 1 e 99")
    @Max(value = 99, message = "O numero deve estar entre 1 e 99")
    private Integer numero;

    private Long idTime;

    public static Jogador dtoToEntity(JogadorRequestDTO jogadorRequestDTO) {
        return Jogador.builder()
                .nome(jogadorRequestDTO.getNome())
                .posicao(jogadorRequestDTO.getPosicao())
                .idade(jogadorRequestDTO.getIdade())
                .numero(jogadorRequestDTO.getNumero())
                .build();
    }


}
