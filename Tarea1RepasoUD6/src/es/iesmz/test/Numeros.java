package es.iesmz.test;

public class Numeros {
    public int sonIguales(int a, int b, int c) {
        int valor;
        if (a == b && a == c) {
            valor = 0;
        } else if (a != b && b != c && c != a) {
            valor = 2;
        } else {
            valor = 1;
        }
        return valor;
    }
}