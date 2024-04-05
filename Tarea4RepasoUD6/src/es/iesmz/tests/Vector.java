package es.iesmz.tests;

public class Vector {
    public static int[] reverso(int [] v) {
        int[] reverse = new int[v.length];

        int cont = 0;
        for (int i = v.length-1; i >= 0; i--) {
            reverse[cont] = v[i];
            cont++;
        }
        return reverse;
    }
}