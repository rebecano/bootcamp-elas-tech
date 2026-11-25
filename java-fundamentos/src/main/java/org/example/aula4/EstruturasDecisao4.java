package org.example.aula4;

public class EstruturasDecisao4 {
    static void main() {
        /*
        4 - Crie variáveis idade (17) e temAutorizacao (true). Mostre se a pessoa pode entrar na festa:
        precisa ter 18 anos ou ter autorização. Faça o mesmo para precisa ter 18 anos e ter autorização.
         */
        int idade = 17;
        boolean temAutorizacao = true;

        if (idade >= 18 || temAutorizacao) {
            System.out.println("Pode entrar!");
        } else {
            System.out.println("Não pode entrar.");
        }

        if (idade >= 18 && temAutorizacao) {
            System.out.println("Pode entrar!");
        } else {
            System.out.println("Não pode entrar.");
        }
    }
}
