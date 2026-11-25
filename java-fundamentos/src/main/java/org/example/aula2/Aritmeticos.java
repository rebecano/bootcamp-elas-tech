package org.example.aula2;

public class Aritmeticos {
    static void main() {
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
