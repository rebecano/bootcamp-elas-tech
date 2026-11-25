package org.example.aula7;

// 2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.

import java.util.Locale;
import java.util.Scanner;

public class AtividadeStringsEx2 {
    static void main() {
        System.out.println("Digite seu nome:");

        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();

        System.out.println(nome.toUpperCase() + "\n" + nome.toLowerCase());
    }
}
