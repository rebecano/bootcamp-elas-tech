package org.example.aula25.lambda_atividade.exercicio_6;

import org.example.aula25.lambda_atividade.exercicio_4.Acao;

public interface Condicao {

     boolean testar(int n);

     static void executarSe(Condicao cond, int valor, Acao acao) {
         if (cond.testar(valor)) {
             acao.executar();
         }
     }

}
