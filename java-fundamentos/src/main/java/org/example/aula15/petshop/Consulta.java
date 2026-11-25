package org.example.aula15.petshop;

public class Consulta implements Servico {

    @Override
    public void executar(String nome) {
        System.out.printf("Levando %s para a consulta...\n", nome);
    }
}
