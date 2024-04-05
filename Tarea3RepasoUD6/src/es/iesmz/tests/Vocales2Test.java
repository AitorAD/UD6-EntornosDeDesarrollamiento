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

    @Test
    public void pruebaVocales2devuelve_4h0r4s0nnm3r0s() {
        assertEquals("4h0r4 s0n nm3r0s", Vocales2.sinvocales("4h0r4 s0n num3r0s"));
    }

    @Test
    public void pruebaVocales2devuelve_CdnSnVcls() {
        assertEquals("Cdn Sn Vcls", Vocales2.sinvocales("Cadena Sin Vocales"));
    }
}