package org.example.aula19.atividade_revisao.classe_abstrata;

public class Retangulo extends Forma {
    private double altura;
    private double largura;

    public Retangulo(String nome, double altura, double largura) {
        super(nome);
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }
}
