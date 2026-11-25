package org.example.aula6;

import java.util.Scanner;

// 3 - Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais), ficou de recuperação (entre 5 e 6.9) ou foi reprovada.

public class AtividadeScannerEx3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota:");
        double nota = sc.nextDouble();

        if (nota >= 7){
            System.out.println("Aprovada");
        } else if (nota > 5 && nota < 7) {
            System.out.println("Recuperação");
        } else{
            System.out.println("Reprovada");
        }
    }
}
