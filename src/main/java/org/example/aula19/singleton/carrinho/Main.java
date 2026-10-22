package org.example.aula19.singleton.carrinho;

public class Main {
    static void main() {
        /*
        7. Crie uma classe Singleton chamada Carrinho que:
        -tenha um atributo quantidadeItens, começando em 0;
        -tenha um método adicionarItem() que soma 1 à quantidade;
        -tenha um método getQuantidadeItens() que devolve a quantidade.

        No main, obtenha o carrinho em duas variáveis diferentes, telaProdutos e telaPromocoes, adicione itens usando as duas, e imprima a quantidade final. O resultado deve mostrar que as duas telas usam o mesmo carrinho.

        Exemplo de saída esperada:

        Itens no carrinho: 4
         */
        Carrinho telaProdutos = Carrinho.getInstancia();

        telaProdutos.adicionarItem();
        telaProdutos.adicionarItem();
        telaProdutos.adicionarItem();
        System.out.println(telaProdutos.getQuantidadeItens());


        Carrinho telaPromocoes = Carrinho.getInstancia();

        telaPromocoes.adicionarItem();
        telaPromocoes.adicionarItem();
        System.out.println(telaPromocoes.getQuantidadeItens());
    }
}
