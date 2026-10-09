package org.example.aula14.polimorfismo;

public class Boleto implements MeioDePagamento {

    public void pagar(double valor) {
        System.out.printf("Pagamento feito no boleto com o valor de R$ %.2f.", valor);
    }
}
