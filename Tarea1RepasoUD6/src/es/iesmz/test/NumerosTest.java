package es.iesmz.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerosTest {
    @Test
    public void pruebaSonIgualesA4_B55_C7() {
        assertEquals(2, Numeros.sonIguales(4,55,7));
    }

    @Test
    public void pruebaSonIgualesA14_B23_C27() {
        assertEquals(2, Numeros.sonIguales(14,23,27));
    }

    @Test
    public void pruebaSonIgualesA14_B55_C14() {
        assertEquals(1, Numeros.sonIguales(14,55,14));
    }

    @Test
    public void pruebaSonIgualesA14_B14_C33() {
        assertEquals(1, Numeros.sonIguales(14,14,33));
    }

    @Test
    public void pruebaSonIgualesA32_B55_C55() {
        assertEquals(1, Numeros.sonIguales(32,55,55));
    }

    @Test
    public void pruebaSonIgualesA329_B329_C329() {
        assertEquals(0, Numeros.sonIguales(329,329,329));
    }
}