package es.iesmz;

import java.util.Scanner;

public class Cuenta {
    private double saldo;

    public Cuenta() {
        saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double i) {
        if (i <= -100 || i > 6000) {
            saldo = 0;
        } else {
            saldo += i;
        }
    }

    public void retirar(double i) {
        if (i < 0 || i > 6000) {
            System.out.println("No puedes retirar cantidades negativas O mayores a 6000");
        } else {
            if (saldo - i < 0) {
                System.out.println("No puedes retirar más cantidad de la que tienes");
            } else {
                saldo -= i;
            }
        }
    }

    public void tranferencia(Cuenta c2, double i) {
        if (i < 0 || i > 3000) {
            System.out.println("No puedes realizar una trasferencia de una cantidad menor a 0 o mayor que 3000");
        } else {
            retirar(i);
            c2.ingresar(i);
        }
    }
}
