package es.buildverde;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    void sumaDosNumeros() {
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    void restaDosNumeros() {
        assertEquals(1, calc.restar(3, 2));
    }

    @Test
    void multiplicaDosNumeros() {
        assertEquals(6, calc.multiplicar(2, 3));
    }

    @Test
    void divideDosNumeros() {
        assertEquals(2, calc.dividir(6, 3));
    }

    @Test
    void dividirEntreCeroLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(1, 0));
    }
}
