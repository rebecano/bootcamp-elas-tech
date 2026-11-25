package org.example.aula13.for_each;

import java.util.ArrayList;
import java.util.List;

public class AtividadeForEach {
    static void main() {
        // 1. Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each, um por linha.
        String[] nomes = {"Ana", "João", "Helena", "Lucas"};

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("\n");


        // 2. Crie um ArrayList com 5 notas e imprima todas usando for-each.
        ArrayList<Double> notasLista = new ArrayList<>(List.of(5.0, 7.5, 10.0, 6.0, 8.0));

        for (double nota : notasLista) {
            System.out.println(nota);
        }

        System.out.println("\n");


        // 3. Com o array de notas {8, 6, 10, 7}, use for-each para somar todas e mostrar a soma e a média.
        int[] notas = {8, 6, 10, 7};
        int soma = 0;

        for (int nota : notas) {
            soma += nota;
        }

        System.out.println("Soma: " + soma + "\nMédia: " + soma/notas.length);


        // 4. Com um array de nomes, use for-each e um if para contar quantos têm mais de 5 letras. Mostre o total. Dica: usem o método length.
        String[] nomes2 = {"Ana", "João", "Helena", "Lucas", "Pedro", "Fernanda"};
        int contador = 0;

        for (String nome : nomes2) {
            if (nome.length() > 5) {
                contador += 1;
            }
        }

        System.out.println("\n" + contador + " nomes têm mais de 5 letras\n");


        // 5. Pegue o exercício 1 e escreva ele DE NOVO com o for normal, usando o índice. Deixe os dois na mesma classe e compare.
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }


    }
}
