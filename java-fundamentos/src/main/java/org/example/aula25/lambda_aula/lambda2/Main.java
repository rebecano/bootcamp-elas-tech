package org.example.aula25.lambda_aula.lambda2;

public class Main {

    static void repetirAcao(Acao acao){
        acao.executar();
    }

    static void mostrarResultado(Operacao op, int valor) {
        System.out.println(op.aplicar(valor));
    }

    static void main() {
        repetirAcao(() -> System.out.println("Oi"));

        mostrarResultado((valor) -> valor*2, 5);
    }
}
