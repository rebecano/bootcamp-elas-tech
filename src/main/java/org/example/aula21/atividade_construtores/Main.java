package org.example.aula21.atividade_construtores;

class Main {
    static void main() {
        Agendamento agendamento1 = new Agendamento("Thor", "banho", "14h",
                true, true, false, "alérgico a shampoo", 0.10);

        Agendamento agendamento2 = new Agendamento("Luna", "tosa", "10h",
                false, false, false, "", 0);

        Agendamento agendamento3 = new Agendamento("Mel", "banho", "16h",
                false, false, true, "", 0);

        agendamento1.mostrar();
        agendamento2.mostrar();
        agendamento3.mostrar();
    }
}