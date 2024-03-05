package es.iesmz;

public class EmpleadoBR {
    public float calculaSalarioBruto(TipoEmpleado tipus, float ventasMes, float horasExtra) {
        float salarioBase = 0;
        if (tipus != null && ventasMes >= 0 && horasExtra >= 0) {
            if (tipus == TipoEmpleado.venedor) salarioBase += 1000;
            else if (tipus == TipoEmpleado.encarregat) salarioBase += 1500;

            if (ventasMes >= 1000 && ventasMes < 1500) salarioBase += 100;
            else if (ventasMes >= 1500) salarioBase += 200;

            if (horasExtra > 0) salarioBase += (20 * horasExtra);
        } else {
            return -1;
        }
        return salarioBase;
    }

    public float calculaSalarioNeto(float salarioBruto) {
        float retencion = 0;
        if (salarioBruto > 0) {
            if (salarioBruto >= 1000 && salarioBruto < 1500) retencion = 16f;
            else if (salarioBruto >= 1500) retencion = 18f;
        } else {
            return -1;
        }
        return salarioBruto * (1 - (retencion / 100));
    }
}
