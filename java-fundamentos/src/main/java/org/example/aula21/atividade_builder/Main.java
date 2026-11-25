package org.example.aula21.atividade_builder;

class Main {
    static void main() {
        Agendamento agendamento1 = Agendamento.builder()
                .nomePet("Thor")
                .servico("Banho")
                .horario("14h")
                .perfume(true)
                .laco(true)
                .hidratacao(false)
                .observacao("Alérgico a shampoo")
                .desconto(0.1)
                .build();

        Agendamento agendamento2 = Agendamento.builder()
                .nomePet("Luna")
                .servico("Tosa")
                .horario("10h")
                .build();

        Agendamento agendamento3 = Agendamento.builder()
                .nomePet("Mel")
                .servico("Banho")
                .horario("16h")
                .hidratacao(true)
                .build();

        agendamento1.mostrar();
        agendamento2.mostrar();
        agendamento3.mostrar();
    }
}