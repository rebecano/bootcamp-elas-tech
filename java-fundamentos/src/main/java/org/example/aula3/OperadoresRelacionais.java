package org.example.aula3;

public class OperadoresRelacionais {
    static void main() {
        /*
        1- Crie variáveis para as notas de duas alunas. Mostre na tela o resultado de: são iguais, são diferentes, a primeira é maior, a primeira é menor para quando:
        - a = 10, b = 3
        - a = 3, b = 10
        - a = 5, b = 5
        2- Exiba na tela  a == b, sendo a = 10 e b 3.
        3- Exiba na tela a != b, sendo a = 10 e b = 3.
         */
        int a = 10, b = 3;

        System.out.println("a == b: " + (a==b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b) + "\n");

        int c = 3, d = 3;

        System.out.println("c == d: " + (c==d));
        System.out.println("c != d: " + (c != d));
        System.out.println("c > d: " + (c > d));
        System.out.println("c < d: " + (c < d) + "\n");

        int e = 5, f = 5;

        System.out.println("e == f: " + (e==f));
        System.out.println("e != f: " + (e != f));
        System.out.println("e > f: " + (e > f));
        System.out.println("e < f: " + (e < f) + "\n");

        // 4- Dado boolean chovendo = true, retorne na tela o resultado de !chovendo
        boolean chovendo = true;

        System.out.println("Resultado de !chovendo: " + !chovendo);
    }
}
