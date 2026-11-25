package org.example.aula19.atividade_revisao.classe_abstrata;

public class Main {
    static void main() {
        /*
        Questão 5: Classe abstrata
        a) Crie uma classe abstrata Forma com:

        um atributo nome;
        um construtor que recebe o nome;
        um método normal exibirNome(), que imprime o nome da forma;
        um método abstrato calcularArea(), que retorna um double.

        b) Crie uma classe Retangulo que herda de Forma, tem os atributos largura e altura, e implementa calcularArea().

        c) No main, crie um Retangulo, chame exibirNome() e imprima a área.

        d) Agora tente escrever Forma f = new Forma("teste");. O que acontece? Por quê?
         */

        Retangulo retangulo = new Retangulo("Retângulo", 5, 3);

        retangulo.exibirNome();
        System.out.println(retangulo.calcularArea());


        // Erro: org.example.aula20.atividade_revisao.classe_abstrata.Forma is abstract; cannot be instantiated
        // Forma f = new Forma("teste");
    }

}
