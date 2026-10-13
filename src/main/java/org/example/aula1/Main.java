package org.example.aula1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        // Concatenação
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


        // Aritméticos
        System.out.println("2 + 2 = " + 2 + 2);
        System.out.println("2 + 2 = " + (2 + 2));
        /*
        Em um print que existem concatenação e operação de soma, é necessário colocar parênteses
        na operação para que o Java consiga distinguir objetivo do uso dos sinais.
        */

        int a = 10;
        int b = 3;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));

        double aDouble = 10.0;
        double bDouble = 3.0;

        System.out.println("Soma: " + (aDouble + bDouble));
        System.out.println("Subtração: " + (aDouble - bDouble));
        System.out.println("Multiplicação: " + (aDouble * bDouble));
        System.out.println("Divisão: " + (aDouble / bDouble));
        System.out.println("Resto: " + (aDouble % bDouble));

        double nota1 = 8.0;
        double nota2 = 6.0;
        double nota3 = 10.0;

        System.out.println("Soma das notas: " + (nota1 + nota2 + nota3)
                + ". Média: " + ((nota1 + nota2 + nota3)/3));

        System.out.println("3 + 4 * 5 = " + (3 + 4 * 5));
        System.out.println("(3 + 4) * 5 = " + (3 + 4) * 5);

        int segundos = 3785;

        System.out.println("Minutos: " + (segundos / 60));
        System.out.println("Segundos: " + (segundos % 60));
    }
}
