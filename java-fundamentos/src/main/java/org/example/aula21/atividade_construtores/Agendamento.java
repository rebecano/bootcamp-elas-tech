package org.example.aula21.atividade_construtores;

class Agendamento {
    private String nomePet;
    private String servico;
    private String horario;
    private boolean perfume;
    private boolean laco;
    private boolean hidratacao;
    private String observacao;
    private double desconto;

    Agendamento(String nomePet,
                       String servico,
                       String horario,
                       boolean perfume,
                       boolean laco,
                       boolean hidratacao,
                       String observacao,
                       double desconto) {

        this.nomePet = nomePet;
        this.servico = servico;
        this.horario = horario;
        this.perfume = perfume;
        this.laco = laco;
        this.hidratacao = hidratacao;
        this.observacao = observacao;
        this.desconto = desconto;
    }

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
