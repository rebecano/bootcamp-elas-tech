package org.example.aula25.lambda_atividade.exercicio_6;

import static org.example.aula25.lambda_atividade.exercicio_6.Condicao.executarSe;

public class Main {
    static void main() {

        executarSe(valor -> valor % 2 == 0, 4, () -> System.out.println("É par!"));
        executarSe(valor -> valor % 2 == 0, 7, () -> System.out.println("É par!"));

    }
}
