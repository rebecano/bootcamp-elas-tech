package org.example.aula19.atividade_revisao.sistema_funcionarios;

public class FolhaPagamento {
    private Notificador notificador;

    public FolhaPagamento(Notificador notificador){
        this.notificador = notificador;
    }

    public void pagar(Funcionario f){
        System.out.println("Salário: " + f.calcularSalario());
        notificador.notificar("Pagamento realizado!");
    }
}
