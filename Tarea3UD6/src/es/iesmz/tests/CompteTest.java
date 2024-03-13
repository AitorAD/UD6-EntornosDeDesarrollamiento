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

    @Test
    public void compruebaIBAN_ES8200491500051234567892_SalidaFalse() {
        Compte c = new Compte("Aitor", "1234567890");
        assertEquals(false, c.compruebaIBAN("ES8200491500051234567892"));
    }

    @Test
    public void compruebaGeneraIBAN_0030_2053_09_1234567895_SalidaEsperada_ES7100302053091234567895() {
        Compte c = new Compte("Aitor", "1234567890");
        assertEquals("ES7100302053091234567895", c.generaIBAN("0030","2053","09","1234567895"));
    }

    @Test
    public void compruebaGeneraIBAN_0049_2352_08_2414205416_SalidaEsperada_ES1000492352082414205416() {
        Compte c = new Compte("Aitor", "1234567890");
        assertEquals("ES1000492352082414205416", c.generaIBAN("0049" ,"2352", "08", "2414205416"));
    }

    @Test
    public void compruebaGeneraIBAN_2085_2066_62_3456789011_SalidaEsperada_ES1720852066623456789011() {
        Compte c = new Compte("Aitor", "1234567890");
        assertEquals("ES1720852066623456789011", c.generaIBAN("2085" ,"2066", "62", "3456789011"));
    }

    @Test
    public void compruebaGeneraIBAN_2085_2066_62_3456AE9011_SalidaEsperada_null() {
        Compte c = new Compte("Aitor", "1234567890");
        assertEquals(null, c.generaIBAN("2085" ,"2066", "62", "3456AE9011"));
    }

    //

    @Test
    public void compruebaGeneraIBAN_208_2066_62_3456789011_SalidaEsperada_null() {
        Compte c = new Compte("Aitor", "1234567890");
        assertEquals(null, c.generaIBAN("208" ,"2066", "62", "3456789011"));
    }

    @Test
    public void compruebaGeneraIBAN_2080_20A6_62_3456789011_SalidaEsperada_null() {
        Compte c = new Compte("Aitor", "1234567890");
        assertEquals(null, c.generaIBAN("2080" ,"20A6", "62", "3456789011"));
    }

    @Test
    public void compruebaGeneraIBAN_2080_2086_6_3456789011_SalidaEsperada_null() {
        Compte c = new Compte("Aitor", "1234567890");
        assertEquals(null, c.generaIBAN("2080" ,"2086", "6", "3456789011"));
    }

    @Test
    public void compruebaGeneraIBAN_2080_2086_63_345678911_SalidaEsperada_null() {
        Compte c = new Compte("Aitor", "1234567890");
        assertEquals(null, c.generaIBAN("2080" ,"2086", "63", "345678911"));
    }
}