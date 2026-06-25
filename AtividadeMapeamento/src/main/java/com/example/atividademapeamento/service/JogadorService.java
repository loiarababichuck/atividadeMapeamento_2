package com.example.atividademapeamento.service;

import com.example.atividademapeamento.controller.JogadorController;
import com.example.atividademapeamento.dtos.JogadorRequestDTO;
import com.example.atividademapeamento.dtos.JogadorResponseDTO;
import com.example.atividademapeamento.entity.Jogador;
import com.example.atividademapeamento.entity.Time;
import com.example.atividademapeamento.repository.JogadorRepository;
import com.example.atividademapeamento.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JogadorService {
    @Autowired
    private JogadorRepository jogadorRepository;

    @Autowired
    private TimeRepository timeRepository;


    public JogadorResponseDTO save(JogadorRequestDTO dto) {
        Jogador jogador = JogadorRequestDTO.dtoToEntity(dto);
        Time time = timeRepository.findById(dto.getIdTime()).orElseThrow(
                () -> new RuntimeException("Time não encontrado")
        );
        jogador.setTime(time);
        return JogadorResponseDTO.entityToDto(jogadorRepository.save(jogador));
    }
}
