package org.example.aula21.atividade_factory;

public class AnimalFactory {

    public static Animal criar(String especie) {
        if (especie.equalsIgnoreCase("Cachorro")) {
            return new Cachorro();
        } else if (especie.equalsIgnoreCase("Gato")) {
            return new Gato();
        }

        throw new IllegalArgumentException("Espécie não cadastrada!");
    }

}
