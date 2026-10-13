package org.example.aula15.petshop;

public class Banho implements Servico {

    @Override
    public void executar(String nome) {
        System.out.printf("Dando banho em %s...\n", nome);
    }
}
