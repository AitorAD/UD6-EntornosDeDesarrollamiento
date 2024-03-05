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

    @Test
    public void calculaSalarioNetoEntrada999Coma99Salida999Coma99() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioNeto(999.99f);

        assertEquals(999.99f, e.calculaSalarioNeto(999.99f));
    }

    @Test
    public void calculaSalarioNetoEntrada500Salida500() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioNeto(500f);

        assertEquals(500f, e.calculaSalarioNeto(500f));
    }

    @Test
    public void calculaSalarioNetoEntrada0Salida0() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioNeto(0f);

        assertEquals(0f, e.calculaSalarioNeto(0f));
    }

    @Test
    public void calculaSalarioNetoEntradaMenos1SalidaMemos1() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioNeto(-1f);

        assertEquals(-1f, e.calculaSalarioNeto(-1f));
    }

    @Test
    public void calculaSalarioBrutoEntradaVendedor20008hSalidaMemos1360() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioBruto(TipoEmpleado.venedor, 2000,8);

        assertEquals(1360, e.calculaSalarioBruto(TipoEmpleado.venedor, 2000,8));
    }
}