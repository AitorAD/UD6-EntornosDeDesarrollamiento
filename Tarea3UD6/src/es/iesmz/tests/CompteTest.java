package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompteTest {
    @Test
    public void compruebaIBAN_ES6621000418401234567891_SalidaTrue() {
        Compte c = new Compte("Aitor", "1234567890");
        assertEquals(true, c.compruebaIBAN("ES6621000418401234567891"));
    }

    @Test
    public void compruebaIBAN_ES6000491500051234567892_SalidaTrue() {
        Compte c = new Compte("Aitor", "1234567890");
        assertEquals(true, c.compruebaIBAN("ES6000491500051234567892"));
    }

    @Test
    public void compruebaIBAN_ES9420805801101234567891_SalidaTrue() {
        Compte c = new Compte("Aitor", "1234567890");
        assertEquals(true, c.compruebaIBAN("ES9420805801101234567891"));
    }

    @Test
    public void compruebaIBAN_ES7600246912501234567891_SalidaFalse() {
        Compte c = new Compte("Aitor", "1234567890");
        assertEquals(false, c.compruebaIBAN("ES7600246912501234567891"));
    }

    @Test
    public void compruebaIBAN_ES4721000418401234567891_SalidaFalse() {
        Compte c = new Compte("Aitor", "1234567890");
        assertEquals(false, c.compruebaIBAN("ES4721000418401234567891"));
    }
}