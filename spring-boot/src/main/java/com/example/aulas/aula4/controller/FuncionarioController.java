package com.example.aulas.aula4.controller;

import com.example.aulas.aula4.model.Funcionario;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/aula4/funcionarios")
public class FuncionarioController {

    private final List<Funcionario> funcionarios = new ArrayList<>();
    private int proximoId = 1;

    @GetMapping
    public List<Funcionario> listar() {
        return funcionarios;
    }

    @GetMapping("/{id}")
    public Funcionario buscar(@PathVariable int id) {
        for (Funcionario f : funcionarios) {
            if (f.getId() == id) {
                return f;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Funcionário não encontrado");
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Funcionario cadastrar(@RequestBody Funcionario funcionario) {
        funcionario.setId(proximoId);
        proximoId++;
        funcionarios.add(funcionario);
        return funcionario;
    }

    @PutMapping("/{id}")
    public Funcionario atualizar(@PathVariable int id, @RequestBody Funcionario dados) {
        Funcionario existente = buscar(id);
        existente.setNome(dados.getNome());
        existente.setCargo(dados.getCargo());
        existente.setSalario(dados.getSalario());
        return existente;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable int id) {
        Funcionario existente = buscar(id);
        funcionarios.remove(existente);
    }

}