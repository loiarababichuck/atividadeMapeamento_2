package com.example.atividademapeamento.controller;

import com.example.atividademapeamento.dtos.TecnicoRequestDTO;
import com.example.atividademapeamento.dtos.TecnicoResponseDTO;
import com.example.atividademapeamento.service.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/tecnico")
public class TecnicoController {
    @Autowired
    private TecnicoService tecnicoService;

    @PostMapping
    public TecnicoResponseDTO save(@RequestBody TecnicoRequestDTO tecnicoRequestDTO) {
        return tecnicoService.save(tecnicoRequestDTO);
    }
}
