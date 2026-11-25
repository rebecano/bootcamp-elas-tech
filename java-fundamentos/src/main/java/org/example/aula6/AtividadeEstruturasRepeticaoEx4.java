package org.example.aula6;

// 4 - Crie uma variável com um número e mostre a tabuada dele de 1 a 10.

public class AtividadeEstruturasRepeticaoEx4 {
    static void main() {
        int numero = 2;

        for (int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", numero, i, (numero * i));
        }
    }
}
