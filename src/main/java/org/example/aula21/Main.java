package org.example.aula21;

public class Main {
    static void main() {
        BancoDeDados mysql = new MySql();
        BancoDeDados oracle = new Oracle();

        conectarBanco(mysql);
        conectarBanco(oracle);
    }

    static void conectarBanco(BancoDeDados banco){
        banco.chamarBanco();
    }
}