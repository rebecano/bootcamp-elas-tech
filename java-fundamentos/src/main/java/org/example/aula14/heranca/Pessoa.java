package org.example.aula14.heranca;

public abstract class Pessoa {
    public String nome;
    public int idade;

    public void apresentar(){
        System.out.printf("Oi, sou %s e tenho %d anos.\n", nome, idade);
    }

}
