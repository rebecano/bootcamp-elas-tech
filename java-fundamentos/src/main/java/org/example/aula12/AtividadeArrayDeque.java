package org.example.aula12;

import java.util.ArrayDeque;
import java.util.List;

public class AtividadeArrayDeque {
    static void main() {
        // 1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila e quantas pessoas tem.
        ArrayDeque<String> filaPessoas = new ArrayDeque<>();

        filaPessoas.addAll(List.of("João", "Maria", "Ana"));

        System.out.println("Fila: " + filaPessoas + "\nQuantidade de pessoas: " + filaPessoas.size());


        // 2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e imprima a fila logo depois. Repare que ela não mudou.
        ArrayDeque<String> fila = new ArrayDeque<>();

        fila.addAll(List.of("Fernando", "Fabrício", "Rafaela", "Bernado", "Carla"));

        System.out.println("\nPróximo da fila: " + fila.peek() + "\nFila: " + fila);


        // 3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila depois. Compare com o exercício 2.
        System.out.println("\nAtendo: " + fila.poll() + "\nFila: " + fila + "\n");


        // 4. Crie uma fila com três nomes e atenda todos usando while (!fila.isEmpty()). No final, imprima "Fila vazia!".
        ArrayDeque<String> fila2 = new ArrayDeque<>();

        fila2.addAll(List.of("João", "Maria", "Ana"));

        while (!fila2.isEmpty()) {
            System.out.println(fila2.poll());
        }

        System.out.println("Fila vazia!");


        // 5. Crie uma fila com três nomes e use contains para responder duas perguntas: se "Bia" está na fila e se "Zoe" está.
        ArrayDeque<String> fila3 = new ArrayDeque<>();

        fila3.addAll(List.of("Zoe", "Maria", "Ana"));

        System.out.println("\nBia está na fila? " + fila3.contains("Bia") + "\nZoe está na fila? " + fila3.contains("Zoe") + "\n");


        /*
        6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
        - se estiver vazia  -> "Não tem ninguém na fila."
        - se tiver gente    -> "Próximo: [nome]"
        Depois adicione uma pessoa e teste de novo.
         */
        ArrayDeque<String> fila4 = new ArrayDeque<>();

        if (fila4.isEmpty()) {
            System.out.println("Não tem ninguém na fila");
        } else {
            System.out.println("Próximo: " + fila4.peek());
        }

        fila4.add("Carla");

        if (fila4.isEmpty()) {
            System.out.println("Não tem ninguém na fila");
        } else {
            System.out.println("Próximo: " + fila4.peek());
        }
    }
}
