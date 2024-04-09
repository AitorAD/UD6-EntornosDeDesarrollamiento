package es.iesmz.tests;

public class Vocales2 {
    public static String sinvocales(String cadena) {
        String output = "";

        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.toLowerCase().charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' -> output += "";
                default -> output += cadena.charAt(i);
            }
        }
        return output;
    }
}