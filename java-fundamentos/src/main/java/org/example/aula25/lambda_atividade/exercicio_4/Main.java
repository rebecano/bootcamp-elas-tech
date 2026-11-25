package org.example.aula25.lambda_atividade.exercicio_4;

import static org.example.aula25.lambda_atividade.exercicio_4.Acao.repetir;

public class Main {
    static void main() {
        repetir(() -> System.out.println("oi"));
    }
}
