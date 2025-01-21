package org.example;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void suma() {
        Calculadora calc = new Calculadora(3,5);
        int valorEsperado = 8;
        int valorDevuelto = calc.suma();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @org.junit.jupiter.api.Test
    void resta() {
    }

    @org.junit.jupiter.api.Test
    void multiplica() {
    }

    @org.junit.jupiter.api.Test
    void divide() {
    }
}