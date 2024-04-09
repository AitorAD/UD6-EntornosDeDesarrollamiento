package es.iesmz.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Vocales2Test {
    @ParameterizedTest
    @CsvSource({
            "Hl Mnd, Hola Mundo",
            "st s n cdn, Esto Es una cadenA",
            "Jv ml Mglln, Java mola MogollOn",
            "4h0r4 s0n nm3r0s, 4h0r4 s0n num3r0s",
            "Cdn Sn Vcls, Cadena Sin Vocales",
    })
    void testQuitaVocales(String output, String input) {
        assertEquals(output, Vocales2.sinvocales(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/tests.csv")
    void test2QuitaVocales(String output, String input) {
        assertEquals(output, Vocales2.sinvocales(input));
    }
}
