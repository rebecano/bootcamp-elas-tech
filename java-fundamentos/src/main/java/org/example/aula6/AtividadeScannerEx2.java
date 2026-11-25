package org.example.aula6;

import java.util.Scanner;

// 2 - Peça dois números inteiros e mostre a soma, a subtração, a multiplicação, a divisão e o resto.

public class AtividadeScannerEx2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero1 = sc.nextInt();

        System.out.println("Digite outro número:");
        int numero2 = sc.nextInt();

        System.out.printf("\nSoma: %d\nSubtração: %d\nMultiplicação: %d\nDivisão: %d\nResto: %d\n", (numero1 + numero2), (numero1 - numero2), (numero1 * numero2), (numero1 / numero2), (numero1 % numero2));
    }
}
