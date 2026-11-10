package org.example.aula25.lambda_atividade.exercicio_5;

public interface Operacao {

    int aplicar(int n);

    static void mostrarResultado(Operacao op, int valor) {
        System.out.println(op.aplicar(valor));
    }

}
