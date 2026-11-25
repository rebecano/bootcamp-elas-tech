package org.example.aula16;

public class AtividadeEncapsulamento {
    static void main() {

        ContaBancaria conta = new ContaBancaria();

        System.out.println(conta.getTitular());
        System.out.println(conta.getSaldo());

        conta.setTitular("");
        conta.setTitular("Ana");

        System.out.println("\n");

        conta.depositar(500);
        conta.sacar(100);

        System.out.println("\n");

        Produto produto = new Produto();

        // System.out.println(produto.codigoInterno);
        System.out.println(produto.nome);
        System.out.println(produto.preco);

        System.out.println("\n");

        System.out.println("Número da conta: " + conta.getNumeroConta());

        // conta.setNumeroConta("999-Z");
    }
}
