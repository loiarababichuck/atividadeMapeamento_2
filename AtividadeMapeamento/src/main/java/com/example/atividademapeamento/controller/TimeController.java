package com.example.atividademapeamento.controller;

import com.example.atividademapeamento.dtos.TimeRequestDTO;
import com.example.atividademapeamento.dtos.TimeResponseDTO;
import com.example.atividademapeamento.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/time")
public class TimeController {
    @Autowired
    private TimeService timeService;

    @PostMapping
    public TimeResponseDTO save(@RequestBody TimeRequestDTO timeRequestDTO) {
        return timeService.save(timeRequestDTO);
    }
}
