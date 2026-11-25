package org.example.aula25.lambda_aula.lambda1;

public class Main {
    static void main() {

        Desconto vip = valor -> valor * 0.20;
        vip.calcularDesconto(100);


        Saudacao saudacao = () -> System.out.println("Oi!");
        saudacao.executar();


        Impressora impressoraMaiusculo = (texto) -> System.out.println(texto.toUpperCase());
        Impressora impressoraMinusculo = (texto) -> System.out.println(texto.toLowerCase());

        String texto = "Rebeca";

        impressoraMaiusculo.imprimir(texto);
        impressoraMinusculo.imprimir(texto);


        Calculo soma = (int a, int b) -> (a + b);
        Calculo multiplicacao = (int a, int b) -> (a * b);
        Calculo qualNumeroEhMaior = (int a, int b) -> Math.max(a, b);

        System.out.println(soma.calcular(3, 4));
        System.out.println(multiplicacao.calcular(3, 63));
        System.out.println(qualNumeroEhMaior.calcular(7, 9));
    }
}
