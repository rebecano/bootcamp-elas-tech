package org.example.aula22.atividade_decorator;

public class AcaiSimples implements Acai {

    @Override
    public String getDescricao() {
        return "Açaí Simples";
    }

    @Override
    public double getPreco() {
        return 12.00;
    }

}
