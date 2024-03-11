package es.iesmz.tests;

public class DiasLluvia {
    boolean[][] calendario = new boolean[12][31];

    boolean registroDia(int dia, int mes, boolean lluvia) {
        if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12) {
            calendario[mes-1][dia-1] = lluvia;
            return true;
        }
        return false;
    }

    boolean consultarDia(int dia, int mes) {
        if (calendario[mes-1][dia-1]) {
            return true;
        }
        return false;
    }

    int contarDiasLluviosos() {
        int totalDiasLlovidos = 0;
        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[i].length; j++) {
                if (calendario[i][j]) totalDiasLlovidos++;
            }
        }
        return totalDiasLlovidos;
    }

    int trimestreLluvioso() {
        int trimestreLluvioso = Integer.MIN_VALUE;

        int[] trimestres = {
                buscarDiasLluviososTrimestre(0, 2),
                buscarDiasLluviososTrimestre(3, 5),
                buscarDiasLluviososTrimestre(6, 8),
                buscarDiasLluviososTrimestre(9, 11),
        };
        for (int i = 0; i < trimestres.length; i++) {
            if (trimestres[i] > trimestreLluvioso) trimestreLluvioso = trimestres[i];
        }
        for (int i = 0; i < trimestres.length; i++) {
            if (trimestres[i] == trimestreLluvioso) return i+1;
        }
        return 0;
    }

    private int buscarDiasLluviososTrimestre(int principioDelTrimestre, int finalDelTrimestre) {
        int totalDiasLlovidos = 0;

        for (int i = principioDelTrimestre; i < finalDelTrimestre; i++) {
            for (int j = 0; j < calendario[0].length; j++) {
                if (calendario[i][j]) totalDiasLlovidos++;
            }
        }
        return totalDiasLlovidos;
    }

    int primerDiaLluvia() {
        int dia = 1;
        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[i].length; j++) {
                if (calendario[i][j]) return dia;
                dia++;
            }
        }
        return 0;
    }
}
