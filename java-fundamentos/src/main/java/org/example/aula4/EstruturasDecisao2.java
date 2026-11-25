package org.example.aula4;

public class EstruturasDecisao2 {
    static void main() {
        /*
        2 - Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00). Se o saldo for suficiente, mostre "Compra aprovada!" e o saldo restante. Se não for, mostre "Saldo insuficiente" e quanto está faltando.
         */
        double saldoConta = 500;
        double valorCompra = 320;

        if (saldoConta > valorCompra){
            System.out.println("Compra Aprovada! Saldo Restante: R$ " + (saldoConta - valorCompra));
        } else {
            System.out.println("Salto insuficiente. Faltam: R$ " + (valorCompra - saldoConta));
        }
    }
}
