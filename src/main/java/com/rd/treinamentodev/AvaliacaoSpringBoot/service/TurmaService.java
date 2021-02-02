package com.rd.treinamentodev.AvaliacaoSpringBoot.service;

import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.AlunoDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.CursoDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.InstrutorDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.TurmaDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.AlunoEntity;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.CursoEntity;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.InstrutorEntity;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.TurmaEntity;
import com.rd.treinamentodev.AvaliacaoSpringBoot.repository.CursoRepository;
import com.rd.treinamentodev.AvaliacaoSpringBoot.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TurmaService {

    @Autowired
    private TurmaRepository turmaRepository;

    @Autowired
    private CursoRepository cursoRepository;

    SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");

    public List<TurmaDTO> listar(){
        List<TurmaEntity> listEntity = turmaRepository.findAll();

        return converterEntityToDTO(listEntity);


    }

    private List<TurmaDTO> converterEntityToDTO(List<TurmaEntity> turmaEntities){

        List<TurmaDTO> litsDTO = new ArrayList<>();

        for(TurmaEntity turmaEntity : turmaEntities){

            TurmaDTO turmaDTO = new TurmaDTO();

            turmaDTO.setCurso(turmaDTO.getCurso());
            turmaDTO.setInstrutores(turmaDTO.getInstrutores());
            turmaDTO.setDtInicio(turmaDTO.getDtInicio());
            turmaDTO.setDtFim(turmaDTO.getDtFim());

           List<AlunoEntity> alunosEntity = turmaEntity.getAlunos();

            List<AlunoDTO> alunosDTO = new ArrayList<>();

            for(AlunoEntity alunoEntity : alunosEntity){
                AlunoDTO alunoDTO = new AlunoDTO();
                alunoDTO.setNome(alunoEntity.getNomeAluno());
                alunoDTO.setCpf(alunoEntity.getCpf());


                alunosDTO.add(alunoDTO);
            }

            turmaDTO.setAlunos(alunosDTO);
            litsDTO.add(turmaDTO);

            }


        return litsDTO;
    }

}

