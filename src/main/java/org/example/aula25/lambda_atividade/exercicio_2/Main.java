package org.example.aula25.lambda_atividade.exercicio_2;

public class Main {
    static void main() {

        Impressora imprimirMaiusculo = texto -> System.out.println(texto.toUpperCase());
        Impressora imprimirMinusculo = texto -> System.out.println(texto.toLowerCase());

        imprimirMaiusculo.imprimir("oi");
        imprimirMinusculo.imprimir("OI");

    }
}
