package org.example.aula25.lambda_atividade.exercicio_1;

public class Main {
    static void main() {

        Saudacao saudacao = () -> System.out.println("oi");
        saudacao.executar();

    }

}
