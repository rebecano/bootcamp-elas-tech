package org.example.aula19.atividade_revisao.sistema_funcionarios;

public class SistemaFuncionarios {
    static void main() {
        /*
        Questão 6: Exercício integrado (Sistema de Funcionários)

        Faça em etapas.

        Etapa 1. Crie uma classe abstrata Funcionario com atributos privados nome e salarioBase, um construtor que recebe os dois, getters, e um setter de salarioBase que não aceite valores negativos.

        Etapa 2. Adicione à classe Funcionario um método abstrato calcularSalario().

        Etapa 3. Crie duas classes que herdam de Funcionario:

            - Desenvolvedor: o salário é o salário base mais 20%. ( salario = salarioBase + (salarioBase * 0.20) ou salario = salarioBase * 1.20)

            - Gerente: o salário é o salário base mais 50%. (salario = salarioBase + (salarioBase * 0.50) ou salario = salarioBase * 1.50)

        Etapa 4. Crie uma interface Notificador com o método notificar(String mensagem). Crie duas implementações: NotificadorEmail e NotificadorSms, cada uma imprimindo a mensagem de um jeito diferente.

        Etapa 5. Crie uma classe FolhaPagamento que recebe um Notificador pelo construtor e tem um método pagar(Funcionario f), que calcula o salário e usa o notificador para avisar o funcionário.

        Etapa 6. No main, crie um desenvolvedor e um gerente, pague os dois usando uma folha com notificação por email, e depois crie outra folha com notificação por SMS.

        Pergunta final: quais princípios e conceitos de POO você usou em cada etapa?
         */

        Funcionario fabio = new Gerente("Fábio", 5000);
        Funcionario laura = new Desenvolvedor("Laura", 5000);

        NotificadorEmail notificadorEmail = new NotificadorEmail();
        FolhaPagamento folhaEmail = new FolhaPagamento(notificadorEmail);

        folhaEmail.pagar(fabio);
        folhaEmail.pagar(laura);

        System.out.println("\n");

        NotificadorSMS notificadorSMS = new NotificadorSMS();
        FolhaPagamento folhaSMS = new FolhaPagamento(notificadorSMS);

        folhaSMS.pagar(fabio);
        folhaSMS.pagar(laura);
    }
}
