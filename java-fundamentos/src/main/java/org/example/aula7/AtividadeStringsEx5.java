package org.example.aula7;
/*
5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.

Digite seu nome: Ana
Digite de novo: ANA
Os nomes são iguais? true
 */

import java.util.Scanner;

public class AtividadeStringsEx5 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome1 = sc.nextLine();

        System.out.println("Digite o seu nome novamente: ");
        String nome2 = sc.nextLine();

        System.out.println("Os nomes são iguais? " + nome1.equalsIgnoreCase(nome2));

    }
}
