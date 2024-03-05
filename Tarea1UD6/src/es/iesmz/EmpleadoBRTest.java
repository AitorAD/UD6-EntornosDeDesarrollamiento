package es.iesmz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoBRTest {
    @Test
    public void calculaSalarioNetoEntrada2000Salida1640() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioNeto(2000);
        assertEquals(1640, e.calculaSalarioNeto(2000));
    }

    @Test
    public void calculaSalarioNetoEntrada1500Salida1230() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioNeto(1500);
        assertEquals(1230, e.calculaSalarioNeto(1500));
    }

    @Test
    public void calculaSalarioNetoEntrada1499Coma99Salida1259Coma9916() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioNeto(1499.99f);

        assertEquals(1259.9916f, e.calculaSalarioNeto(1499.99f), 0.01);
    }

    @Test
    public void calculaSalarioNetoEntrada1250Salida1050() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioNeto(1250f);

        assertEquals(1050f, e.calculaSalarioNeto(1250f));
    }

    @Test
    public void calculaSalarioNetoEntrada1000Salida840() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioNeto(1000f);

        assertEquals(840f, e.calculaSalarioNeto(1000f), 0.01);
    }
}