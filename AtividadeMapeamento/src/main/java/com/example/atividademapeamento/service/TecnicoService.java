package com.example.atividademapeamento.service;

import com.example.atividademapeamento.dtos.JogadorRequestDTO;
import com.example.atividademapeamento.dtos.JogadorResponseDTO;
import com.example.atividademapeamento.dtos.TecnicoRequestDTO;
import com.example.atividademapeamento.dtos.TecnicoResponseDTO;
import com.example.atividademapeamento.entity.Jogador;
import com.example.atividademapeamento.entity.Tecnico;
import com.example.atividademapeamento.entity.Time;
import com.example.atividademapeamento.repository.JogadorRepository;
import com.example.atividademapeamento.repository.TecnicoRepository;
import com.example.atividademapeamento.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnicoService {
    @Autowired
    private TecnicoRepository tecnicoRepository;

    @Autowired
    private TimeRepository timeRepository;


    public TecnicoResponseDTO save(TecnicoRequestDTO dto) {
        Tecnico tecnico = TecnicoRequestDTO.dtoToEntity(dto);
        Time time = timeRepository.findById(dto.getIdTime()).orElseThrow(
                () -> new RuntimeException("Time não encontrado")
        );
        tecnico.setTime(time);
        return TecnicoResponseDTO.entityToDto(tecnicoRepository.save(tecnico));
    }
}
