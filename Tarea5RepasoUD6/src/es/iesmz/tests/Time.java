package es.iesmz.tests;

import java.util.Objects;

public class Time {
    private int hora;
    private int minuto;
    private int segundo;

    public Time(int hora, int minuto, int segundo) {
        if (validaTime(hora, minuto, segundo)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    private boolean validaTime(int hora, int minuto, int segundo) {
        boolean time = true;
        if (hora < 0 || hora > 23) time = false;
        if (minuto < 0 || minuto > 59) time = false;
        if (segundo < 0 || segundo > 59) time = false;

        return time;
    }

    Time nextSecond() {
        segundo++;

        if (segundo == 60) {
            minuto++;
            segundo = 0;
        }
        if (minuto == 60) {
            hora++;
            minuto = 0;
        }
        if (hora == 24) {
            hora = 0;
        }

        return new Time(hora,minuto,segundo);
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hora == time.hora && minuto == time.minuto && segundo == time.segundo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hora, minuto, segundo);
    }

    @Override
    public String toString() {
        return "h: " + hora + ", m: " + minuto + ", s: " + segundo;
    }
}