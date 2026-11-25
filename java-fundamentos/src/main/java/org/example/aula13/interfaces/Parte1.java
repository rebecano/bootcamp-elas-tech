package org.example.aula13.interfaces;

class Cachorro implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

}

class Gato implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}
