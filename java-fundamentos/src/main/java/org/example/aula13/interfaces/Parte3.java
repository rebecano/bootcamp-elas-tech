package org.example.aula13.interfaces;

class Carro implements Veiculo {

    @Override
    public void ligar() {
        System.out.println("Ligando o carro...");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro");
    }
}

class Moto implements Veiculo {

    @Override
    public void ligar() {
        System.out.println("Ligando a moto...");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando a moto");
    }
}
