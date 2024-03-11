package es.iesmz.tests;

public class DiasLluvia {
    boolean[][] calendario = new boolean[12][31];

    boolean registroDia(int dia, int mes, boolean lluvia) {
        if (dia >= 1 && dia <= 31 && mes <= 1 && mes >= 12) {
            calendario[mes][dia] = true;
        }
        return false;
    }

    boolean consultarDia(int dia, int mes) {
        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[i].length; j++) {
                if (calendario[i][j]) return true;
            }
        }
        return false;
    }
}
