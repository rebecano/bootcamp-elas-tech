package org.example.aula10;
/*
1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo. Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando que não dá pra dividir por zero.
*/

import org.example.aula8.Utilidades;

import java.util.Scanner;

public class AtividadeTratamentoExcecoesEx1 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int n1, n2 = 0;

        while (n2 == 0)
            try {
                System.out.println("Digite um número: ");
                n1 = sc.nextInt();

                System.out.println("Digite outro número: ");
                n2 = sc.nextInt();

                int divisao = (n1 / n2);

                System.out.printf("Resultado da divisão do primeiro número pelo segundo: %d\n", divisao);

            } catch (ArithmeticException ae) {
                System.out.println("Não dá pra dividir por 0! Tente novamente.");

            } finally {
                System.out.println(" ");

        }

        System.out.println("Programa finalizado.");

    }
}

