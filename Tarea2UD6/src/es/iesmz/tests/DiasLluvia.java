package es.iesmz.tests;

public class DiasLluvia {
    boolean[][] calendario = new boolean[12][31];

    boolean registroDia(int dia, int mes, boolean lluvia) {
        if (dia >= 1 && dia <= 31 && mes <= 1 && mes >= 12) {
            calendario[mes][dia] = lluvia;
        }
        return false;
    }

    boolean consultarDia(int dia, int mes) {
        if (calendario[mes][dia]) {
            return true;
        }
        return false;
    }
}
