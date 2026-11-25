package org.example.aula7;

import java.util.Scanner;

// 1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).

public class AtividadeStrings {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");

        String nomeCompleto = sc.nextLine();

        System.out.println("\nSeu nome tem " + nomeCompleto.length() + " letras (contando os espaços)");
    }
}
