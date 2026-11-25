package com.example.aulas.aula2.controller;

import com.example.aulas.aula2.model.Lanche;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/aula02/lanches")
public class LancheController {

    private final List<Lanche> lanches = new ArrayList<>();
    private int proximoId = 1;

    @GetMapping
    public List<Lanche> listar() {return lanches;}

    @GetMapping("/{id}")
    public Lanche buscar(@PathVariable int id) {
        for (Lanche l : lanches) {
            if (l.getId() == id) {
                return l;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Lanche não encontrado");
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Lanche cadastrar(@RequestBody Lanche lanche) {
        lanche.setId(proximoId);
        if (lanche.getPreco() > 0) {
            proximoId++;
            lanches.add(lanche);
            return lanche;
        }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "O preço deve ser maior que zero!");
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable int id) {
        Lanche existente = buscar(id);
        lanches.remove(existente);
    }

}
