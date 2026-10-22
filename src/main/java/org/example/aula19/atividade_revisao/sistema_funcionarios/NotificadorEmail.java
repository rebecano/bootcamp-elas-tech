package org.example.aula19.atividade_revisao.sistema_funcionarios;

public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(String mensagem) {
        System.out.println("Email: " + mensagem);
    }
}
