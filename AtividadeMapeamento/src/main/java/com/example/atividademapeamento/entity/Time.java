package com.example.atividademapeamento.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cidade;
    private String estadio;
    private Integer titulos;

    @OneToOne(mappedBy = "time")
    private Tecnico tecnico;

    @OneToMany(mappedBy = "time")
    private List<Jogador> jogadores;

}
