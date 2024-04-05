package es.iesmz.tests;

public class Vocales2 {
    public static String sinvocales(String cadena) {
        cadena += cadena.toLowerCase();
        String output = "";

        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' -> output += "";
                default -> output += cadena.charAt(i);
            }
        }
        return output;
    }
}