package org.example.aula24.observer_voo;

public class PainelAeroporto implements ObservadorVoo {

    @Override
    public void atualizar(String status) {
        System.out.println("Painel: " + status);
    }

}
