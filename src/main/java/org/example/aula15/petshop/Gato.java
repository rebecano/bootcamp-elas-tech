package org.example.aula15.petshop;

public class Gato extends Pet{

    @Override
    void emitirSom() {
        System.out.printf("%s faz: Miau!", nome);
    }
}
