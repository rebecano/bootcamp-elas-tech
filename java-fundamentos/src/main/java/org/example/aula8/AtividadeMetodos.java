package org.example.aula8;

import java.util.Scanner;

public class AtividadeMetodos {
    static void main() {
    /*
    1 — Na mesma classe do main, crie um método chamado mostrarBoasVindas() que imprime "Bem-vinda ao curso de Java!". Chame ele no main.
     */
        mostrarBoasVindas();


    /*
    2 — Crie um método saudar(String nome) que imprime "Olá, [nome]! Tudo bem?". Chame ele três vezes, passando nomes diferentes.
     */
        Scanner sc = new Scanner(System.in);

        String nome;
        int a = 1;

        while (a <= 3) {
            System.out.println("Digite seu nome:");
            nome = sc.nextLine();
            Utilidades.saudar(nome);

            a += 1;
        }


    /*
    3 — Crie um método dobro(int numero) que devolve o dobro do número recebido. No main, chame ele e mostre o resultado.
     */
        System.out.println("Digite um número para ver o seu dobro:");

        int numeroDobro = sc.nextInt();
        int resultadoDobro = Utilidades.dobro(numeroDobro);

        System.out.printf("%d\n\n",resultadoDobro);


    /*
    4 — Crie um método calcularMedia(double n1, double n2) que devolve a média das duas notas. No main, peça as duas notas com Scanner e mostre a média com duas casas decimais.
     */
        System.out.println("Digite a nota 1:");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a nota 2:");
        double nota2 = sc.nextDouble();

        double media = Utilidades.calcularMedia(nota1, nota2);

        System.out.printf("Média: %.2f\n\n", media);


    /*
    5 — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false. No main, peça a idade e use o retorno do método dentro de um if para imprimir se a pessoa é maior ou menor de idade.
     */
        System.out.println("Digite sua idade:");
         int idade = sc.nextInt();

         boolean ehMaior = Utilidades.ehMaiorDeIdade(idade);

         System.out.printf("Você é maior de idade? %b\n\n", ehMaior);


    /*
    6 — Crie três métodos com o mesmo nome somar:

    um que recebe dois inteiros
    um que recebe três inteiros
    um que recebe dois decimais

    No main, chame os três e veja o Java escolher sozinho qual usar.
     */
        int somaDoisInt = Utilidades.somar(2,3);
        int somaTresInt = Utilidades.somar(7, 10, 15);
        double somaDouble = Utilidades.somar(4.5, 8.2);

        System.out.printf("Soma com dois inteiros: %d\nSoma com três inteiros: %d\nSoma com dois decimais: %f\n\n", somaDoisInt, somaTresInt, somaDouble);


    /*
    7 — Crie dois métodos chamados saudacao:

    um sem parâmetro, que imprime "Olá!"
    um que recebe um nome, e imprime "Olá, [nome]!"
     */
        String nomeSaudacao = "Rebeca";

        Utilidades.saudacao();

        Utilidades.saudacao(nomeSaudacao);
    }

    static void mostrarBoasVindas(){
        System.out.println("Bem-vinda ao curso de Java!");
    }
}
