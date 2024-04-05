package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    @Test
    public void pruebaTimeDevuelve_12_14_16() {
        assertEquals(new Time(12,14,16), new Time(12,14,15).nextSecond());
    }

    @Test
    public void pruebaTimeDevuelve_12_59_45() {
        assertEquals(new Time(12,59,45), new Time(12,59,44).nextSecond());
    }

    @Test
    public void pruebaTimeDevuelve_1_10_0() {
        assertEquals(new Time(1,10,0), new Time(1,9,59).nextSecond());
    }
}