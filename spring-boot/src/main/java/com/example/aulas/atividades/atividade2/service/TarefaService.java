package com.example.aulas.atividades.atividade2.service;

import com.example.aulas.atividades.atividade2.model.Tarefa;
import com.example.aulas.atividades.atividade2.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public List<Tarefa> listar() {
        return repository.findAll();
    }

    public Tarefa cadastrar(Tarefa tarefa) {
        return repository.save(tarefa);
    }

}
