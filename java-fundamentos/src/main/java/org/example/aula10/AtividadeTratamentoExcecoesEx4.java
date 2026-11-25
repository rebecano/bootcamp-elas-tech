package org.example.aula10;

/*
4 — Crie uma variável String nome = null; e tente imprimir nome.length(). Trate a NullPointerException e mostre "O nome não foi preenchido."
 */

public class AtividadeTratamentoExcecoesEx4 {
    static void main() {
        try {
            String nome = null;

            System.out.println(nome.length());

        } catch (NullPointerException npe) {
            System.out.println("O nome não foi preenchido.");

        }
    }
}
