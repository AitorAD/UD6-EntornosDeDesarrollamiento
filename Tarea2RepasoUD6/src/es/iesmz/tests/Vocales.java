package es.iesmz.tests;

public class Vocales {
    public static int contarVocales(String cadena) {
        int cantVocales = 0;

        cadena = cadena.toLowerCase();
        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' -> cantVocales++;
            }
        }
        return cantVocales;
    }
}