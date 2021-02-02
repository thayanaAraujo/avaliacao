package com.rd.treinamentodev.AvaliacaoSpringBoot.controller;

import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.CursoDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class CursoController {

    @Autowired
    private CursoService service;

    @PostMapping("/curso") //CADASTRAR NOVO CURSO
    public ResponseEntity cadastrarCurso(@RequestBody CursoDTO cursoDTO) {
        return ResponseEntity.status(HttpStatus.OK).body(service.cadastrarCurso(cursoDTO));
    }
}
