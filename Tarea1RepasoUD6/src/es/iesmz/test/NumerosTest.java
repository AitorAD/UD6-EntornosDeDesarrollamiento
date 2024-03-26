package es.iesmz.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerosTest {
    @Test
    public void pruebaSonIgualesA4_B55_C7() {
        Numeros n = new Numeros();
        assertEquals(2, n.sonIguales(4,55,7));
    }

    @Test
    public void pruebaSonIgualesA14_B23_C27() {
        Numeros n = new Numeros();
        assertEquals(2, n.sonIguales(14,23,27));
    }

    @Test
    public void pruebaSonIgualesA14_B55_C14() {
        Numeros n = new Numeros();
        assertEquals(1, n.sonIguales(14,55,14));
    }
}