package org.example.aula22.atividade_decorator;

public abstract class AcaiDecorator implements Acai {

    protected Acai acaiEmbrulhado;

    public AcaiDecorator(Acai acai) {
        this.acaiEmbrulhado = acai;
    }

}
