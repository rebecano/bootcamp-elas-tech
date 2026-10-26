package org.example.aula22.atividade_adapter;

public class Main {
    static void main() {
        /*
        Pagamento pagamento = new PayPalAPI();

        payPalAPI.pagar();
         */

        Pagamento pagamento = new PayPalAdapter();

        pagamento.pagar();
    }
}
