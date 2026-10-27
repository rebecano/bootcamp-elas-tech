package org.example.aula23.tdd.atividade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDescontoTest {

    private CalculadoraDesconto calculadoraDesconto;

    @BeforeEach
    void criarObjeto() {
        calculadoraDesconto = new CalculadoraDesconto();
    }

    @Test
    void verificarCompraAbaixoDeCemEmUmClienteComum() {
        assertEquals(50, calculadoraDesconto.aplicarDesconto(50, false));
    }

    @Test
    void verificarCompraEmUmClienteVIP() {
        assertEquals(180, calculadoraDesconto.aplicarDesconto(200, true));
    }

    @Test
    void verificarErroAoLancarUmValorIgualOuAbaixoDeZero() {
        assertThrows(IllegalArgumentException.class, () -> calculadoraDesconto.aplicarDesconto(-10, true));
    }

}