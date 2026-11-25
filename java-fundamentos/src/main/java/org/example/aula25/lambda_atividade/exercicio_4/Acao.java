package org.example.aula25.lambda_atividade.exercicio_4;

public interface Acao {

    void executar();

    static void repetir(Acao acao) {
        acao.executar();
        acao.executar();
    }

}
