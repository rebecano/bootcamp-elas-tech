package org.example.aula14.heranca;

public class Aluna extends Pessoa {
    public String curso;

    public void estudar() {
        System.out.printf("%s está estudando %s.\n", nome, curso);
    }

}
