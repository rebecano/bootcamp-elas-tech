package org.example.aula22.atividade_adapter;

public class PayPalAdapter implements Pagamento {

    PayPalAPI payPalAPI = new PayPalAPI();

    @Override
    public void pagar() {

        payPalAPI.sendPayment();

    }

}
