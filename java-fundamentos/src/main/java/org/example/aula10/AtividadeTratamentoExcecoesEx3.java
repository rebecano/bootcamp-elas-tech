package org.example.aula10;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
3 — Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número, trate a InputMismatchException e mostre uma mensagem pedindo um número.
*/

public class AtividadeTratamentoExcecoesEx3 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite a sua idade: ");
            int idade = sc.nextInt();

        } catch (InputMismatchException ime) {
            System.out.println("Digite um número!");

        } finally {
            System.out.println(" ");

        }

        System.out.println("\nPrograma finalizado.");

    }
}