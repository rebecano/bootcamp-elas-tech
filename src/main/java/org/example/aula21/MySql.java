package org.example.aula21;

public class MySql implements BancoDeDados {

    @Override
    public void chamarBanco() {
        System.out.println("O Banco conectado é o MySql.");
    }

    @Override
    public int getNumero() {
        return 0;
    }

}
