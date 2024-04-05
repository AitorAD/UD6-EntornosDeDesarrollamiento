package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vocales2Test {
    @Test
    public void pruebaVocales2devuelve_HlMnd() {
        assertEquals("Hl Mnd", Vocales2.sinvocales("Hola Mundo"));
    }

    @Test
    public void pruebaVocales2devuelve_stsncdn() {
        assertEquals("st s n cdn", Vocales2.sinvocales("Esto Es una cadenA"));
    }

    @Test
    public void pruebaVocales2devuelve_JvmlMglln() {
        assertEquals("Jv ml Mglln", Vocales2.sinvocales("Java mola MogollOn"));
    }
}