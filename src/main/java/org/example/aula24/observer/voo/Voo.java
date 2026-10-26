package org.example.aula24.observer.voo;

import java.util.ArrayList;

public class Voo {

    private ArrayList<ObservadorVoo> observadorVoo = new ArrayList<>();

    public void adicionarObservador(ObservadorVoo observadorVoo) {
        this.observadorVoo.add(observadorVoo);
    }

    public void mudarStatus(String status) {
        for (ObservadorVoo observador : observadorVoo) {
            observador.atualizar(status);
        }
    }

}
