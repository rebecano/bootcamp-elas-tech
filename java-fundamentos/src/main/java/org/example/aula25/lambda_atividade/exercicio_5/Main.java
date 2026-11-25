package org.example.aula25.lambda_atividade.exercicio_5;

import static org.example.aula25.lambda_atividade.exercicio_5.Operacao.mostrarResultado;

public class Main {
    static void main() {

        mostrarResultado(valor -> (valor * 2), 5);
        mostrarResultado(valor -> (valor * valor), 5);
        mostrarResultado(valor -> (valor * (-1)), 5);

    }
}
