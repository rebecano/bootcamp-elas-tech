package org.example.aula15.petshop;

public class Cachorro extends Pet{

    @Override
    void emitirSom() {
        System.out.printf("%s faz: Au au!", nome);
    }
}
