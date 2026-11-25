package org.example.aula19.singleton.carrinho;

public class Carrinho {
    private static Carrinho instancia;
    private int quantidadeItens = 0;

    private Carrinho(){}

    public static Carrinho getInstancia() {
        if (instancia == null) {
            instancia = new Carrinho();
        }
        return instancia;
    }

    public void adicionarItem(){
        quantidadeItens += 1;
    }

    public int getQuantidadeItens(){
        return quantidadeItens;
    }
}
