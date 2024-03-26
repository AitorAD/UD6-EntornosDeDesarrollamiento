package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VocalesTest {
    @Test
    public void pruebaContarVocales_HolaMundo() {
        assertEquals(4, Vocales.contarVocales("Hola Mundo"));
    }

    @Test
    public void pruebaContarVocales_EstoEsunacadenA() {
        assertEquals(8, Vocales.contarVocales("Esto Es una cadenA"));
    }

    @Test
    public void pruebaContarVocales_JavamolaMogollOn() {
        assertEquals(7, Vocales.contarVocales("Java mola MogollOn"));
    }

    @Test
    public void pruebaContarVocales_4h0r4s0nnum3r0s() {
        assertEquals(1, Vocales.contarVocales("4h0r4 s0n num3r0s"));
    }

    @Test
    public void pruebaContarVocales_CadenaS1nVocales() {
        assertEquals(6, Vocales.contarVocales("Cadena S1n Vocales"));
    }
}