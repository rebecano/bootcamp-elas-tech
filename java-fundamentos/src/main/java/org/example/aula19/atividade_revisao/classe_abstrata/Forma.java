package org.example.aula19.atividade_revisao.classe_abstrata;

public abstract class Forma {
    private String nome;

    public Forma(String nome){
        this.nome = nome;
    }

    public void exibirNome() {
       System.out.println("Forma: " + nome);
    }

    public abstract double calcularArea();

}
