package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTestDAA {

    private Calculadora calc;

    @org.junit.jupiter.api.Test
    void suma() {
        calc = new Calculadora(3,5);
        int valorEsperado = 8;
        int valorDevuelto = calc.suma();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @ParameterizedTest
    @ValueSource(ints = {2,3,4})
    public void testSumaSource(int num) {
        calc = new Calculadora(num,5);
        int valorEsperado = num + 5;
        int valorDevuelto = calc.suma();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @ParameterizedTest
    @CsvSource({"2, 4, 6", "1, 3, 4" ,"8, 10, 18", "2, 9, 11"})
    void testSumaSource(int a, int b, int valorEsperado) {
        calc = new Calculadora(a, b);
        int valorDevuelto = calc.suma();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @org.junit.jupiter.api.Test
    void resta() {
        calc = new Calculadora(6,5);
        int valorEsperado = 1; //error corregido
        int valorDevuelto = calc.resta();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @org.junit.jupiter.api.Test
    void multiplica() {
        calc = new Calculadora(2,2);
        int valorEsperado = 4;
        int valorDevuelto = calc.multiplica();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        calc = new Calculadora(8,4);
        int valorEsperado = 2; //error corregido
        int valorDevuelto = calc.divide();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @Test
    void divideException(){
        calc = new Calculadora(8,0);
        String valorEsperado = "ERROR por 0"; //error corregido
        String valorDevuelto = "";

        try{
            calc.divide();
        }catch (ArithmeticException e){
            valorDevuelto = e.getMessage();
        }
        assertEquals(valorEsperado, valorDevuelto);
    }
}
