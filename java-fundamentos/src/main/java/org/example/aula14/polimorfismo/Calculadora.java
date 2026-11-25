package org.example.aula14.polimorfismo;

public class Calculadora {

    double calcularArea(double ladoQuadrado) {
        return (ladoQuadrado * ladoQuadrado);
    }

    double calcularArea(double base, double altura) {
        return (base * altura);
    }

    double calcularArea(int raio) {
        return (3.14159 * raio * raio);
    }
}
