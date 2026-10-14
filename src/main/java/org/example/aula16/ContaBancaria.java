package org.example.aula16;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta = "001-X";

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            System.out.println("Inválido! Mantido " + this.titular);
        } else {
            this.titular = titular;
            System.out.println("Titular: " + titular);
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Depósito negado!");
        } else {
            registrarLog("deposito de ", valor);
            saldo += valor;
            System.out.println("Saldo: " + saldo);
        }
    }

    public void sacar(double valor) {
        if (temSaldo(valor)) {
            registrarLog("saque de ", valor);
            System.out.println("Saldo: " + (saldo - valor));
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    private boolean temSaldo(double valor) {
        if (saldo > 0) {
            return true;
        } else {
            return false;
        }
    }

    private void registrarLog(String acao, double valor) {
        System.out.printf("[LOG] %s: %s %.2f\n", titular, acao, valor);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

}
