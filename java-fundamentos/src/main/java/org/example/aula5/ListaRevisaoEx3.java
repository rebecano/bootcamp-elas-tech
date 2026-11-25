package org.example.aula5;

import java.util.Scanner;

public class ListaRevisaoEx3 {
    static void main() {
        /*
        3 - Usando um do-while e um switch, crie um menu interativo. O menu deve oferecer três opções:
        1 - Ver camisas
        2 - Ver calças
        3 - Sair
        Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha. Se digitar uma opção inválida avise. O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.
         */

        System.out.println("Menu:\n1 - Ver camisa\n2 - Ver calças\n3 - Sair\n");

        Scanner sc = new Scanner(System.in);
        int numero;

        do{
            numero = sc.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("Confirmado. Escolha: Ver camisas\n");
                break;

                case 2:
                    System.out.println("Confirmado. Escolha: Ver calças\n");
                break;

                case 3:
                    System.out.println("Você saiu do menu");
                break;
            }
            if (numero >= 4){
                System.out.println("Opção Inválida\n");
            } else{
            }
        } while (numero != 3);
    }
}