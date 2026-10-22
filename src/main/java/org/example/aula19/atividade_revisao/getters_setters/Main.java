package org.example.aula19.atividade_revisao.getters_setters;

public class Main {
    static void main() {
        /*
        Questão 3: Getters e Setters
        Crie uma classe Produto com os atributos privados nome (String), preco (double) e quantidade (int).

        Crie getters e setters para todos os atributos.
        O setter de preco não deve aceitar valores menores ou iguais a zero.
        O setter de quantidade não deve aceitar valores negativos.
        No main, crie um produto, preencha os atributos pelos setters, tente colocar um preço negativo, e imprima os dados usando os getters.
         */

        Produto produto =  new Produto();

        produto.setNome("Camisa");
        produto.setPreco(39.99);
        produto.setQuantidade(30);

        produto.setPreco(-4);

        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        System.out.println(produto.getQuantidade());

    }
}
