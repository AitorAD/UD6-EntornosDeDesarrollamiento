package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiasLluviaTest {
    @Test
    public void compruebaRegistroDiaNoDejaValoresMayoresDe12EnMes1() {
        DiasLluvia d = new DiasLluvia();
        assertEquals(false, d.registroDia(1,13,true));
    }

    @Test
    public void compruebaRegistroDiaNoDejaValoresMayoresDe12EnMes2() {
        DiasLluvia d = new DiasLluvia();
        assertEquals(false, d.registroDia(1,13,true));
    }

    @Test
    public void compruebaRegistroDiaNoDejaValoresMayoresDe32EnDia1() {
        DiasLluvia d = new DiasLluvia();
        assertEquals(false, d.registroDia(32,12,true));
    }

    @Test
    public void compruebaRegistroDiaNoDejaValoresMayoresDe32EnDia2() {
        DiasLluvia d = new DiasLluvia();
        assertNotEquals(true, d.registroDia(32,12,true));
    }
}