package org.example.aula24.observer_voo;

public class Passageiro implements ObservadorVoo {

    @Override
    public void atualizar(String status) {
        System.out.println("Passageiro avisado: " + status);
    }

}
