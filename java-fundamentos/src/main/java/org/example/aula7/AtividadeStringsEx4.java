package org.example.aula7;

import java.util.Scanner;

/*
4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.

Digite uma frase: Estou aprendendo Java
Digite uma palavra: Java
A palavra aparece na frase? true
 */

public class AtividadeStringsEx4 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();

        System.out.println("Digite uma palavra:");
        String palavra = sc.next();

        System.out.println("A palavra aparece na frase? " + frase.contains(palavra));

    }
}
