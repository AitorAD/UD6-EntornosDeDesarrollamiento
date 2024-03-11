package es.iesmz.tests;

public class DiasLluvia {
    int[][] calendario = new int[12][31];

    boolean registroDia(int dia, int mes, boolean lluvia) {
        if (dia >= 1 && dia <= 31 && mes <= 1 && mes >= 12) {
            return true;
        }
        return false;
    }
}
