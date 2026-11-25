package org.example.aula10;

/*
6 — Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e trate a ArrayIndexOutOfBoundsException com a mensagem "Essa posição não existe." Depois do try/catch, imprima "O programa continua funcionando."
 */

public class AtividadeTratamentoExcecoesEx6 {
    static void main() {

        try {
            String[] lista = {"João", "Maria", "Lucas"};

            System.out.println(lista[5]);

        } catch (ArrayIndexOutOfBoundsException aioe) {
            System.out.println("Essa posição não existe.");

        }

        System.out.println("O programa continua funcionando.");

    }
}
