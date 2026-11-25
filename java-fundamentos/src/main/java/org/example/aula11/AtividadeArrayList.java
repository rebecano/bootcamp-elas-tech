package org.example.aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtividadeArrayList {
    static void main() {

        // - Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.
        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.addAll(List.of("Maria", "João", "Lucas"));
        System.out.println(listaNomes);


        // - Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.
        ArrayList<String> listaFrutas = new ArrayList<>(List.of("Manga", "Morango", "Mamão", "Banana"));
        System.out.printf("Primeira fruta: %s\nÚltima fruta: %s\nQuantidade de frutas: %s\n\n",
                listaFrutas.getFirst(),listaFrutas.getLast(), listaFrutas.size());


        // - Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.
        ArrayList<String> listaNomes2 = new ArrayList<>(List.of("João", "Maria", "Lucas", "Júlia"));
        System.out.println(listaNomes2);
        listaNomes2.set(2, "Amanda");
        System.out.println(listaNomes2);


        // - Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.
        ArrayList<String> listaCidades = new ArrayList<>(List.of("Santos", "São Vicente", "Guarujá", "Praia Grande"));
        System.out.println(listaCidades);
        listaCidades.remove(1);
        System.out.println(listaCidades);


        // - Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`. (Dica: i + ": " + comando para pegar posição da lista)
        ArrayList<String> listaNomes3 = new ArrayList<>(List.of("João", "Maria", "Lucas", "Júlia", "Marcos"));

        for (int i = 0; i <= (listaNomes3.size() - 1); i++) {
            System.out.println(i + ": " + listaNomes3.get(i));
        }


        // - Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição. Se não estiver, avise.
        ArrayList<String> listaNomes4 = new ArrayList<>(List.of("João", "Maria", "Lucas", "Júlia"));

        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite um nome: ");
        String usuario = sc.nextLine();

        if (listaNomes4.contains(usuario)) {
            System.out.printf("O nome está na lista, possui a posição %d\n", listaNomes4.indexOf(usuario));
        } else {
            System.out.println("Nome não encontrado na lista.\n");
        }

    }
}
