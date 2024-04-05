package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {
    @Test
    public void pruebaVectorDevuelve_654321() {
        int[] v = {1,2,3,4,5,6};
        int[] expected = {6,5,4,3,2,1};

        assertArrayEquals(expected, Vector.reverso(v));
    }

    @Test
    public void pruebaVectorDevuelve_7622151210() {
        int[] v = {10,12,5,221,6,7};
        int[] expected = {7,6,221,5,12,10};

        assertArrayEquals(expected, Vector.reverso(v));
    }

    @Test
    public void pruebaVectorDevuelve_5() {
        int[] v = {5};
        int[] expected = {5};

        assertArrayEquals(expected, Vector.reverso(v));
    }

    @Test
    public void pruebaVectorDevuelve_20105() {
        int[] v = {5,10,20};
        int[] expected = {20,10,5};

        assertArrayEquals(expected, Vector.reverso(v));
    }
}