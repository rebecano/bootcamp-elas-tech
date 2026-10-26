package org.example.aula24.observer.estoque;

import java.util.ArrayList;

public class Estoque {

    private ArrayList<ObservadorEstoque> observarEstoque = new ArrayList<>();

    public void adicionarObservador(ObservadorEstoque observarEstoque) {
        this.observarEstoque.add(observarEstoque);
    }

    public void setQuantidade(int quantidade) {
        for (ObservadorEstoque observar : observarEstoque) {
            observar.atualizar(quantidade);
        }
    }

}
