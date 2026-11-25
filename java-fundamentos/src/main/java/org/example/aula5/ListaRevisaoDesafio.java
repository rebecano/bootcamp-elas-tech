package org.example.aula5;

import java.util.Scanner;

class Aluna {
    String nome;
    double nota1;
    double nota2;
    double media;
    boolean passou;
}

public class ListaRevisaoDesafio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String passou;
        int usuario;
        int a = 0;

        do {
            System.out.printf("\n\n--- SISTEMA DE CADASTRO ---\nQuantidade de alunas cadastradas: %d\n\nDeseja continuar?\n1- Continuar\n2- Sair\n", a);

            usuario = sc.nextInt();

            switch (usuario) {
                case 1:
                    Aluna aluna = new Aluna();

                    do {
                        System.out.println("\nDigite a primeira nota:");
                        aluna.nota1 = sc.nextDouble();

                        if (aluna.nota1 < 0 || aluna.nota1 > 10){
                            System.out.println("Valor inválido!");
                        }

                    } while (aluna.nota1 < 0 || aluna.nota1 > 10);

                    do {
                        System.out.println("Digite a segunda nota:");
                        aluna.nota2 = sc.nextDouble();

                        if (aluna.nota2 < 0 || aluna.nota2 > 10) {
                            System.out.println("Valor inválido!\n");
                        }

                    } while (aluna.nota2 < 0 || aluna.nota2 > 10);

                    sc.nextLine();

                    aluna.media = (aluna.nota1 + aluna.nota2) / 2;

                    System.out.println("Digite o nome da aluna:");
                    aluna.nome = sc.nextLine();

                    if (aluna.media >= 6){
                        aluna.passou = true;
                    } else {
                        aluna.passou = false;
                    }

                    if (aluna.passou == true){
                        passou = "Aprovada";
                    } else {
                        passou = "Reprovada";
                    }

                    System.out.printf("\nO nome da aluna é %s, sua primeira nota foi %.1f, sua segunda nota foi %.1f, e sua media final foi %.1f. Status da aprovação: %s", aluna.nome, aluna.nota1, aluna.nota2, aluna.media, passou);

                    a += 1;

                break;

                default:
                    if (usuario != 1 && usuario != 2) {
                        System.out.println("Opção Inválida!");
                    }
                break;
            }
        } while (usuario != 2);

        System.out.println("\nEncerrando o sistema. Até logo!");
    }
}
