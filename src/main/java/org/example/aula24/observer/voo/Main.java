package org.example.aula24.observer.voo;

public class Main {
    static void main() {

        Voo voo = new Voo();

        Passageiro joao = new Passageiro();
        PainelAeroporto painel = new PainelAeroporto();

        voo.adicionarObservador(joao);
        voo.adicionarObservador(painel);

        voo.mudarStatus("Atrasado");

        voo.mudarStatus("Embarque iniciado");

    }
}
