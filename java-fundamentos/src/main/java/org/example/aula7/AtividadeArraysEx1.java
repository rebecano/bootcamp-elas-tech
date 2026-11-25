package org.example.aula7;

// 1 — Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.

public class AtividadeArraysEx1 {
    static void main() {
        String[] nomes = {"Lucas", "Fernanda", "Antônio", "Carla", "Roberta"};

        System.out.println("Primeiro nome da lista: " + nomes[0] +
                "\nTerceiro nome da lista: " + nomes[2] +
                "\nÚltimo nome da lista: " + nomes[4]);
    }
}
