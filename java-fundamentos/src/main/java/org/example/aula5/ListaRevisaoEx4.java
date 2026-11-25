package org.example.aula5;

/*
4 - Crie uma classe chamada Pet.
Dê a ela três atributos: nome (String), raca (String) e peso (double).

Em outra classe, instancie (crie) dois objetos diferentes dessa classe (por exemplo, um cachorro e um gato).

Atribua valores para os atributos de cada um deles.

Imprima os dados dos dois pets concatenando textos e variáveis.
 */

class Pet {
    String nome;
    String raca;
    double peso;
}

public class ListaRevisaoEx4 {
    static void main() {
        Pet cachorro = new Pet();
        Pet gato = new Pet();

        cachorro.nome = "Bob";
        cachorro.raca = "Golden Retriever";
        cachorro.peso = 40;

        gato.nome = "Lua";
        gato.raca = "Siamês";
        gato.peso = 6;

        System.out.println(cachorro.nome + " é um cachorro da raça " + cachorro.raca +
                " e pesa " + cachorro.peso + "kg.");

        System.out.println(gato.nome + " é um gato da raça " + gato.raca +
                " e pesa " + gato.peso + "kg.");

    }
}

