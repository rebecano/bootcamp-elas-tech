package org.example.aula26.lambda2_atividade;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    static void main() {
        /*
        1 - Runnable
        Runnable não recebe nada, não devolve nada.
        Crie uma Runnable que imprima "executando tarefa". Declare numa variável, execute com .run().
        Depois crie uma segunda Runnable e execute as duas em sequência no main.
         */
        Runnable acao = () -> System.out.println("executando tarefa");
        acao.run();

        Runnable tarefa = () -> System.out.println("limpar dados");
        tarefa.run();


        /*
        2 - Consumer
        Consumer algo entra, nada sai.
        Crie um Consumer<String> que receba um nome e imprima "Olá, " + nome.
        Use com .accept("Flora").
        Depois crie um segundo Consumer<String> que imprima o nome em maiúsculo.
         */
        Consumer<String> saudacao = (nome) -> System.out.println("Olá, " + nome);
        saudacao.accept("Flora");

        Consumer<String> nomeMaiusculo = (nome) -> System.out.println(nome.toUpperCase());
        nomeMaiusculo.accept("Flora");


        /*
        3 - Supplier
        Supplier nada entra, algo sai
        Crie um Supplier<String> que devolva o texto "Aviso: O sistema está online!". Chame o metodo .get() e imprima o resultado.
        Crie um Supplier<Integer> que gere e devolva um número aleatório (use new Random().nextInt(100)). Chame o .get() duas vezes seguidas e imprima os resultados para ver que ele gera números diferentes a cada chamada.
        */
        Supplier<String> aviso = () -> "Aviso: O sistema está online!";
        System.out.println(aviso.get());

        Supplier<Integer> numeroAleatorio = () -> new Random().nextInt(100);
        System.out.println(numeroAleatorio.get());
        System.out.println(numeroAleatorio.get());


        /*
        4 - Predicate
        Predicate entra algo, sai boolean
        Crie um Predicate<Integer> que teste se um número é maior que 10. Teste passando o número 5 e depois o número 15 usando o metodo .test(). Imprima ambos os resultados na tela (true ou false).
        Crie um Predicate<String> que valide se um texto está vazio usando texto.isEmpty(). Teste com uma String vazia "" e com uma String preenchida "Java".
        */
        Predicate<Integer> ehMaiorQueDez = (valor) -> valor > 10;
        System.out.println(ehMaiorQueDez.test(5));
        System.out.println(ehMaiorQueDez.test(15));

        Predicate<String> ehVazio = (texto) -> texto.isEmpty();
        System.out.println(ehVazio.test(""));
        System.out.println(ehVazio.test("Java"));


        /*
        5 - Function
        Function entra um tipo, sai outro
        Crie uma Function<Integer, String> que receba um número e devolva o texto "Nota fiscal nº: " + numero. Use o metodo .apply(1542) e imprima o resultado.
        Crie uma Function<String, Integer> que receba uma palavra e devolva a quantidade de letras que ela tem usando .length(). Teste com .apply("Professor") e imprima o número gerado.
        */
        Function<Integer, String> geradorNotaFiscal = (numero) -> "Nota fiscal nº: " + numero;
        System.out.println(geradorNotaFiscal.apply(1542));

        Function<String, Integer> tamanhoPalavra = (palavra) -> palavra.length();
        System.out.println(tamanhoPalavra.apply("Professor"));

    }
}
