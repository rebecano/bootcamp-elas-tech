package org.example.aula21;

public class Oracle implements BancoDeDados {
    @Override
    public void chamarBanco() {
        System.out.println("O Banco conectado é o Oracle.");
    }

    @Override
    public int getNumero() {
        return 0;
    }
}
