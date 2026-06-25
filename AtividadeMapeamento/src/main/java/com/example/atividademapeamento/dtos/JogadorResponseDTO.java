package com.example.atividademapeamento.dtos;


import com.example.atividademapeamento.entity.Jogador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JogadorResponseDTO {

    private Long id;
    private String nome;
    private String posicao;
    private Integer idade;
    private Integer numero;
    private String nomeDoTime;

    public static JogadorResponseDTO entityToDto(Jogador jogador){
        return JogadorResponseDTO.builder()
                .id(jogador.getId())
                .nome(jogador.getNome())
                .posicao(jogador.getPosicao())
                .idade(jogador.getIdade())
                .numero(jogador.getNumero())
                .build();
    }

}
