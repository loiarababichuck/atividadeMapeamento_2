package com.example.atividademapeamento.service;

import com.example.atividademapeamento.controller.JogadorController;
import com.example.atividademapeamento.dtos.JogadorRequestDTO;
import com.example.atividademapeamento.dtos.JogadorResponseDTO;
import com.example.atividademapeamento.dtos.TimeRequestDTO;
import com.example.atividademapeamento.dtos.TimeResponseDTO;
import com.example.atividademapeamento.entity.Jogador;
import com.example.atividademapeamento.entity.Time;
import com.example.atividademapeamento.repository.JogadorRepository;
import com.example.atividademapeamento.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeService {
    @Autowired
    private TimeRepository timeRepository;

    public TimeResponseDTO save(TimeRequestDTO dto) {
        return TimeResponseDTO.entityToDto(timeRepository.save(TimeRequestDTO.dtoToEntity(dto)));
    }
}
