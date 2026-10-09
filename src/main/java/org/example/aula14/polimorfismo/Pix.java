package org.example.aula14.polimorfismo;

public class Pix implements MeioDePagamento {

    public void pagar(double valor) {
        System.out.printf("Pagamento feito no pix com o valor de R$ %.2f.", valor);
    }
}
