package org.example.aula14.heranca;

public class Professora extends Pessoa {
    public String disciplina;

    public void lancarNota(String aluna, double nota) {
        System.out.printf("%s lançou nota %.1f para %s.\n", nome, nota, aluna);
    }

    public void apresentar(String cargo){
        System.out.printf("Oi, sou %s e ensino %s. Meu cargo é %s.\n", nome, disciplina, cargo);
    }
}
