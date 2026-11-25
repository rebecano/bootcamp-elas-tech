package org.example.aula21.atividade_builder;

import lombok.Builder;

@Builder
class Agendamento {
    private String nomePet;
    private String servico;
    private String horario;
    private boolean perfume;
    private boolean laco;
    private boolean hidratacao;
    private String observacao;
    private double desconto;

    void mostrar() {
        System.out.println("Nome: " + nomePet + "\n" +
                "Serviço: " + servico + "\n" +
                "Horário: " + horario + "\n" +
                "Perfume: " + perfume + "\n" +
                "Laço: " + laco + "\n" +
                "Hidratação: " + hidratacao + "\n" +
                "Observação: " + observacao + "\n" +
                "Desconto: " + desconto + "\n");
    }
}
