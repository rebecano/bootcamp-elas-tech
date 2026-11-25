package org.example.aula4;

public class EstruturasDecisaoDesafio {
    static void main() {
        /*
        Desafio: Crie variáveis para três notas de uma aluna. Calcule a média e mostre: "Aprovada" se for 7 ou mais, "Recuperação" entre 5 e 6.9, e "Reprovada" abaixo de 5. Mostre também a média na tela. Valores: nota1 = 5.3, nota2 = 7.8 , nota3 = 4.5.
         */

        double nota1 = 5.3, nota2 = 7.8, nota3 = 4.5;
        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.printf("Aprovada! Sua nota é %.2f\n", media);
        } else if (media >= 5 && media <= 6.9) {
            System.out.printf("Recuperação. Sua nota é %.2f\n", media);
        } else {
            System.out.printf("Reprovada. Sua nota é %.2f\n", media);
        }
    }
}
