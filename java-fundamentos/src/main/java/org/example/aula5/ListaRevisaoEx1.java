package org.example.aula5;

import java.util.Scanner;

/*
1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele. Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais. Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"
 */

public class ListaRevisaoEx1 {
    static void main() {


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do lanche:");
        String lanche = sc.next();

        System.out.println("Digite o valor do lanche:");
        double valor = sc.nextDouble();

        if (valor >  30) {
            System.out.print("\nO lanche " + lanche);
            System.out.printf(" custa R$ %.2f\n", (valor-5));
        } else {
            System.out.print("\nO lanche " + lanche);
            System.out.printf(" custa R$ %.2f\n", valor);
        }
    }
}
