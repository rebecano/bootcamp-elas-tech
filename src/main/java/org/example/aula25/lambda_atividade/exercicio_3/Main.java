package org.example.aula25.lambda_atividade.exercicio_3;

public class Main {
    static void main() {

        Calculo soma = (a, b) -> (a + b);
        Calculo multiplicacao = (a, b) -> (a * b);
        Calculo qualEhMaior = (a, b) -> {return Math.max(a, b);};

    }
}
