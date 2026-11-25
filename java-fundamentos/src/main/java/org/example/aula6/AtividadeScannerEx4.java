package org.example.aula6;

import java.util.Scanner;

// 4 - Peça um número e mostre a tabuada dele de 1 a 10.

public class AtividadeScannerEx4 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para ver sua tabuada:");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", numero, i, (numero * i));
        }
    }
}
