package org.example.aula23.tdd.atividade;

public class CalculadoraDesconto {

    public double aplicarDesconto(double valorCompra, boolean clienteVIP) {

        if (valorCompra <= 0) {
            throw new IllegalArgumentException("Digite um valor maior que zero!");
        }

        else if (valorCompra < 100 && !clienteVIP) {
            return valorCompra;
        }

        else if (clienteVIP) {
            return valorCompra * 0.90;
        }

        else {
            return valorCompra;
        }

    }

}
