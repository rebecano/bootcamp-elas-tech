package org.example.aula10;

import java.util.Scanner;

/*
5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número. Trate a ArithmeticException para o caso de ela digitar 0.
 */

public class AtividadeTratamentoExcecoesEx5 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int numero = 0;

        while (numero == 0) {
            try {
                System.out.println("Digite um número para fazer a divisão de 100:");
                numero = sc.nextInt();

                System.out.println("Resultado: " + (100 / numero));

            } catch (ArithmeticException ae) {
                System.out.println("Não se divide por 0!\n");

            } finally {
                System.out.println(" ");

            }
    }

        System.out.println("Programa finalizado.");

    }
}
