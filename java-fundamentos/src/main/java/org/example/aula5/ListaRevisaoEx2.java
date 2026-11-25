package org.example.aula5;

public class ListaRevisaoEx2 {
    static void main() {
        /*
        2 - Faça um programa que use um laço for para contar de 1 até 15. Dentro do for, coloque um if para verificar se o número atual é par ou ímpar (dica: use o operador de resto da divisão % 2 == 0). Imprima na tela o número e a palavra correspondente.
        Exemplo de saída:
        "1 é Ímpar"
        "2 é Par"
         */

        for (int i = 1; i <= 15; i++) {
            if ((i % 2) == 0) {
                System.out.println(i + " é par");
            } else{
                System.out.println(i + " é ímpar");
            }
        }
    }
}
