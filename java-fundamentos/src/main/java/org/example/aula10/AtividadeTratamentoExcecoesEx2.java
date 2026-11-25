package org.example.aula10;

import java.util.Scanner;

/*
2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição. Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.
 */

public class AtividadeTratamentoExcecoesEx2 {
    static void main() {
        double[] notas = {8.5, 7, 6.8, 10, 9};

        Scanner sc = new Scanner(System.in);

        int posicao = 5;

        while (posicao >= 5) {
            try {
                System.out.println("Digite o número de uma posição: ");
                posicao = sc.nextInt();

                System.out.println("Nota da posição escolhida: " + notas[posicao]);

            } catch (ArrayIndexOutOfBoundsException aiobe) {
                System.out.println("Você só pode escolher posições de 0 a 4\n");

            } finally {
                System.out.println(" ");

            }
        }

        System.out.println("Programa finalizado!");

    }
}
