package org.example.aula22.atividade_decorator;

public class Main {
    static void main() {

        Acai acaiGranola = new ComGranola(new AcaiSimples());

        System.out.printf("Pedido: %s\nPreço: %.2f\n\n", acaiGranola.getDescricao(), acaiGranola.getPreco());


        Acai acaiGranolaMorango = new ComMorango(new ComGranola(new AcaiSimples()));

        System.out.printf("Pedido: %s\nPreço: %.2f\n\n", acaiGranolaMorango.getDescricao(),
                acaiGranolaMorango.getPreco());

    }
}
