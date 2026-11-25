package org.example.aula6;

import java.util.Scanner;

// 1 - Peça o nome da pessoa e a idade dela. Exemplo: "Oi Ana, você tem 28 anos e vai fazer 29 no próximo aniversário."

public class AtividadeScannerEx1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.printf("Oi, %s! Você tem %d anos e vai fazer %d no próximo aniversário.", nome, idade, (idade + 1));

    }
}
