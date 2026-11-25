package org.example.aula5;

import java.util.Scanner;

/*
5 - Crie uma classe chamada Produto com os atributos nome (String) e preco (double).

Na classe principal, faça um laço for que repita 3 vezes.

A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um produto.

Instancie um novo Produto e guarde nele os valores digitados.

Logo em seguida, faça um if: se o preço do produto for maior que 100, imprima "Produto caro!". Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.
 */

class Produto {
    String nome;
    double preco;
}

public class ListaRevisaoEx5 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++){
            System.out.println("\nDigite o nome do produto:");
            String nomeProduto = sc.nextLine();

            System.out.println("\nDigite o valor do produto:");
            double precoProduto = sc.nextDouble();
            sc.nextLine();

            Produto nProduto = new Produto();
            nProduto.nome = nomeProduto;

            Produto pProduto = new Produto();
            pProduto.preco = precoProduto;

            if (pProduto.preco > 100){
                System.out.printf("Produto caro! R$ %.2f\n", pProduto.preco);
            } else{
                System.out.printf("Produto com preço acessível! R$ %.2f\n", pProduto.preco);
            }
        }
    }
}


