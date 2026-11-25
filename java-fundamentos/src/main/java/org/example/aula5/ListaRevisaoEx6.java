package org.example.aula5;

import java.util.Scanner;

public class ListaRevisaoEx6 {
    static void main() {
        /*
        6 - Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:

        Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).

        Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).

        Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]."
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento:");
        int anoNascimento = sc.nextInt();
        sc.nextLine();

        System.out.println("\nDigite seu nome completo:");
        String nomeCompleto = sc.nextLine();

        System.out.println("O usuário " + nomeCompleto + " nasceu em " + anoNascimento);
    }
}
