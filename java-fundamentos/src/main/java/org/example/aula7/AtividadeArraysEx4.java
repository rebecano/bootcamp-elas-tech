package org.example.aula7;

// 4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.

import java.util.Scanner;

public class AtividadeArraysEx4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[5];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("\nDigite um número: ");
            int numero = sc.nextInt();
            lista[i] = numero;
        }

        System.out.println("\nLista original:");
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }

        System.out.println("\nLista de trás para frente:");
        for (int i = lista.length-1; i >= 0; i--){
            System.out.println(lista[i]);
        }
    }
}
