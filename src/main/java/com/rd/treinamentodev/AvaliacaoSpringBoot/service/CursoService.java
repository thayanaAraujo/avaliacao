package com.rd.treinamentodev.AvaliacaoSpringBoot.service;

import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.CursoDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.CursoEntity;
import com.rd.treinamentodev.AvaliacaoSpringBoot.repository.AlunoRepository;
import com.rd.treinamentodev.AvaliacaoSpringBoot.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CursoService {

    @Autowired
    private CursoRepository repository;


    public String cadastrarCurso(CursoDTO cursoDTO){

        CursoEntity entity = new CursoEntity();

        entity.setNomeCurso(cursoDTO.getNomeCurso());
        entity.setNrCargaHoraria(cursoDTO.getCargaHoraria());

        repository.save(entity);

        return "Curso cadastrado com sucesso";
    }
}
