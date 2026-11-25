package org.example.aula12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AtividadeHashSet {
    static void main() {
        // 1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu com o repetido.
        HashSet<String> nomes = new HashSet<>(List.of("Ana", "Lucas", "João", "Ana"));

        System.out.println("Conjunto: " + nomes + "\nTamanho do conjunto: " + nomes.size() + "\n");


        // 2. Crie um HashSet de cores usando addAll. Depois use contains dentro de um if para avisar se a cor "verde" já está no conjunto ou não.
        HashSet<String> cores = new HashSet<>();

        cores.addAll(List.of("Azul", "Branco", "Verde", "Vermelho", "Amarelo", "Laranja", "Rosa"));

        if (cores.contains("Verde")) {
            System.out.println("O conjunto possui a cor verde");
        } else {
            System.out.println("O conjunto não possui a cor verde");
        }


        // 3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para tirar os repetidos. Imprima os dois e compare.
        ArrayList<String> listaNomes = new ArrayList<>(List.of("Helena", "Maria", "Fernando", "Ana", "Marcos", "Henrique", "Fernando", "Ana", "Helena"));

        HashSet<String> conjuntoNomes = new HashSet<>(listaNomes);

        System.out.println("\nLista: " + listaNomes + "\nConjunto: " + conjuntoNomes);


        // 4. Crie um HashSet com três CPFs e imprima. Depois remova um deles e imprima de novo, junto com o tamanho.
        HashSet<String> cpf = new HashSet<>(List.of("12345678910", "22345678910", "32345678910"));

        System.out.println("\nConjunto: " + cpf);

        cpf.remove("22345678910");

        System.out.println("Conjunto: " + cpf + "\nTamanho conjunto: " + cpf.size() + "\n");


        // 5. Crie um HashSet com três frutas e percorra ele com for, imprimindo uma por linha.
        HashSet<String> frutas = new HashSet<>(List.of("Morango", "Melancia", "Banana"));

        for (String fruta : frutas) {
            System.out.println(fruta);
        }


        // 6. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e imprima o isEmpty() de novo.
        HashSet<Integer> numeros = new HashSet<>();

        System.out.println("\nO conjunto é vazio? " + numeros.isEmpty());

        numeros.add(5);

        System.out.println("O conjunto é vazio? " + numeros.isEmpty());

    }
}
