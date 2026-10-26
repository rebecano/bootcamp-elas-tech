package org.example.aula24.observer.estoque;

public class Main {
    static void main() {

        RegistroEstoque registroEstoque = new RegistroEstoque();

        registroEstoque.atualizar(100);
        registroEstoque.atualizar(75);

    }
}
