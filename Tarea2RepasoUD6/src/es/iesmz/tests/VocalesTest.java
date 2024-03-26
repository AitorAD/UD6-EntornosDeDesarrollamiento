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
}