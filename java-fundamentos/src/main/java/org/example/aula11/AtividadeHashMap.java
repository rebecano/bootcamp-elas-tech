package org.example.aula11;

import java.util.HashMap;
import java.util.Map;

public class AtividadeHashMap {
    static void main() {
        // 1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa inteiro e depois use get para mostrar a idade de uma delas.
        HashMap<String, Integer> nomeIdade = new HashMap<>(Map.of("Mariana", 27, "Lucas", 18, "Zoe", 30));

        System.out.println("Mapa: " + nomeIdade + "\nIdade de Lucas: " + nomeIdade.get("Lucas") + "\n");


        // 2. Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00, imprima, e depois faça put de "café" DE NOVO com valor 7.50. Imprima outra vez e veja o que aconteceu com o tamanho.
        HashMap<String, Double> produtoPrecos = new HashMap<>(Map.of("Café", 5.00));

        System.out.println(produtoPrecos);

        produtoPrecos.put("Café", 7.50);

        System.out.println(produtoPrecos);


        // 3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey dentro de um if para mostrar o telefone de alguém que está na agenda e de alguém que não está.
        HashMap<String, String> agenda = new HashMap<>(Map.of("Marcos", "13 123456789", "Bia", "13 123400000"));

        System.out.println("\nNome: Marcos");
        if (agenda.containsKey("Marcos")) {
            System.out.println("Telefone: " + agenda.get("Marcos"));
        } else {
            System.out.println("O nome não está na agenda");
        }

        System.out.println("\nNome: Zoe");
        if (agenda.containsKey("Zoe")) {
            System.out.println("Telefone: " + agenda.get("Zoe"));
        } else {
            System.out.println("O nome não está na agenda\n");
        }


        // 4. Crie um HashMap de estoque (produto -> quantidade) com dois itens. Use getOrDefault para mostrar a quantidade de um produto que existe e de um que não existe (devolvendo 0). Depois tente com get normal no que não existe e compare.
        HashMap<String, Integer> produtoQuantidade = new HashMap<>(Map.of("Camisa", 30, "Calça", 20));

        System.out.println("Camisa: " + produtoQuantidade.getOrDefault("Camisa", 0));
        System.out.println("Sapato: " + produtoQuantidade.getOrDefault("Sapato", 0));


        // 5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho. Remova uma delas e imprima de novo.
        HashMap<String, Double> alunasNotas = new HashMap<>(Map.of("Ana", 9.5, "Laura", 4.0, "Maria", 10.0));

        System.out.println(alunasNotas);
        System.out.println(alunasNotas.size());

        alunasNotas.remove("Laura");

        System.out.println(alunasNotas);
    }
}
