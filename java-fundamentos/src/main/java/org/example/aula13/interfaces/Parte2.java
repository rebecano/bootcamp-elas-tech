package org.example.aula13.interfaces;

class Email implements Notificacao {

    @Override
    public void enviar(String mensagem){
        System.out.println("E-mail enviado: " + mensagem);
    }
}

class SMS implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}
