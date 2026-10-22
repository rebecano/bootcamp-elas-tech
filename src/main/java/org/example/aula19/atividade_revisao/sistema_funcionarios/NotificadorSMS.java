package org.example.aula19.atividade_revisao.sistema_funcionarios;

public class NotificadorSMS implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("SMS: " + mensagem);
    }
}
