package org.example.aula21.atividade_factory;

public class Main {
    static void main() {

        AnimalFactory.criar("cachorro").emitirSom();

        AnimalFactory.criar("gato").emitirSom();

        AnimalFactory.criar("pássaro");

    }
}
