package com.example.aulas.atividades.atividade2.controller;

import com.example.aulas.atividades.atividade2.model.Tarefa;
import com.example.aulas.atividades.atividade2.service.TarefaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService service;

    public TarefaController(TarefaService service) {this.service = service;}

    @GetMapping
    public List<Tarefa> listar() {return service.listar();}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tarefa cadastrar(@RequestBody Tarefa tarefa) {return service.cadastrar(tarefa);}

}
