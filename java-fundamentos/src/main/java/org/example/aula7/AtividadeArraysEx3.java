package org.example.aula7;

// 3 — Com o mesmo array de notas, calcule e mostre a soma e a média.

public class AtividadeArraysEx3 {
    static void main() {
        int[] notas = {8, 6, 10, 7, 9};
        int soma = 0;

        for (int i = 0; i < notas.length; i++){
            soma += notas[i];
        }

        System.out.println("Soma das notas: " + soma + "\nMédia: " + (soma / notas.length));
    }
}
