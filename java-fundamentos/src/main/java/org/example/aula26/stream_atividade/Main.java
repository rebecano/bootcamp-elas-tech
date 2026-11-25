package org.example.aula26.stream_atividade;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {
    static void main() {

       // 1 - Dada uma lista de números inteiros de 1 a 6, use Streams para filtrar apenas os números pares e salve o resultado em uma nova lista.
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> resultadoNumeros = numeros.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(resultadoNumeros);


       // 2 - Dada uma lista com nomes de frutas em letras minúsculas, use o map para transformar todas as palavras em letras maiúsculas e imprima cada uma na tela.
        List<String> frutas = List.of("morango", "kiwi", "banana", "laranja", "limão", "melão");
        List<String> resultadoFrutas = frutas.stream().map(n -> n.toUpperCase()).toList();

        for (String fruta : resultadoFrutas) {
            System.out.println(fruta);
        }


       // 3 - Dada uma lista de nomes de cidades, filtre apenas as cidades que começam com a letra "S" e conte quantas cidades passaram pelo filtro.
        List<String> cidades = List.of("Rio de Janeiro", "Santos", "São Paulo", "Maragogi", "Ubatuba");
        long resultadoCidades = cidades.stream().filter(n -> n.charAt(0) == 'S').count();
        System.out.println(resultadoCidades);

    }
}
