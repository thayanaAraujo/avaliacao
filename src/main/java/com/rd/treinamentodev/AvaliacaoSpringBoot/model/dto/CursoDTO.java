package com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto;

import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.AlunoEntity;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.CursoEntity;
import lombok.Data;

import java.util.List;

@Data
public class CursoDTO {

    private String nomeCurso;

    private Integer cargaHoraria;

    private List<CursoEntity> litsDTO;
}
