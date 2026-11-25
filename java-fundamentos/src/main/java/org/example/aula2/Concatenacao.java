package org.example.aula2;

public class Concatenacao {
    static void main() {
        String nome = "Lorenzo";
        String cidade = "Roma";

        int idade = 23;

        System.out.println("Meu nome é " + nome + ", moro em " + cidade + " e tenho " + idade + " anos.");


        String produto = "Caneca";
        double preco = 12.50;
        int quantidade = 4;

        System.out.println("Comprei " + quantidade + " unidades de " + produto
                + " por R$ " + preco + " cada. Total: R$ " + (preco * quantidade) + ".");


        int n1 = 15;
        int n2 = 4;

        System.out.println("A soma de " + n1 + " e " + n2 + " é igual a " + (n1+n2));
    }
}
