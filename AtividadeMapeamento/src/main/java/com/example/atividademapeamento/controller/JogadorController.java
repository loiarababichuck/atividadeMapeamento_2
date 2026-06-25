package com.example.atividademapeamento.controller;

import com.example.atividademapeamento.dtos.JogadorRequestDTO;
import com.example.atividademapeamento.dtos.JogadorResponseDTO;
import com.example.atividademapeamento.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/jogador")
public class JogadorController {
    @Autowired
    private JogadorService jogadorService;


    @PostMapping
    public JogadorResponseDTO save(@RequestBody JogadorRequestDTO jogadorRequestDTO) {
        return jogadorService.save(jogadorRequestDTO);
    }
}
