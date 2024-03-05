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
    public void calculaSalarioNetoEntradaMenos1SalidaMenos1() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioNeto(-1f);

        assertEquals(-1f, e.calculaSalarioNeto(-1f));
    }

    @Test
    public void calculaSalarioBrutoEntradaVendedor20008hSalida1360() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioBruto(TipoEmpleado.venedor, 2000,8);

        assertEquals(1360, e.calculaSalarioBruto(TipoEmpleado.venedor, 2000,8));
    }

    @Test
    public void calculaSalarioBrutoEntradaVendedor15003hSalida1260() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioBruto(TipoEmpleado.venedor, 1500,3);

        assertEquals(1260, e.calculaSalarioBruto(TipoEmpleado.venedor, 1500,3));
    }

    @Test
    public void calculaSalarioBrutoEntradaVendedor1499Coma990hSalida1100() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioBruto(TipoEmpleado.venedor, 1499.99f,0);

        assertEquals(1100, e.calculaSalarioBruto(TipoEmpleado.venedor, 1499.99f,0));
    }

    @Test
    public void calculaSalarioBrutoEntradaEcarregat12508hSalida1760() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioBruto(TipoEmpleado.encarregat, 1250f,8);

        assertEquals(1760, e.calculaSalarioBruto(TipoEmpleado.encarregat, 1250f,8));
    }

    @Test
    public void calculaSalarioBrutoEntradaEcarregat10000hSalida1600() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioBruto(TipoEmpleado.encarregat, 1000f,0);

        assertEquals(1600, e.calculaSalarioBruto(TipoEmpleado.encarregat, 1000f,0));
    }

    @Test
    public void calculaSalarioBrutoEntradaEcarregat999Coma993hSalida1560() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioBruto(TipoEmpleado.encarregat, 999.99f,3);

        assertEquals(1560, e.calculaSalarioBruto(TipoEmpleado.encarregat, 999.99f,3));
    }

    @Test
    public void calculaSalarioBrutoEntradaEcarregat5000hSalida1500() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioBruto(TipoEmpleado.encarregat, 500f,0);

        assertEquals(1500, e.calculaSalarioBruto(TipoEmpleado.encarregat, 500f,0));
    }

    @Test
    public void calculaSalarioBrutoEntradaEcarregat08hSalida1660() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioBruto(TipoEmpleado.encarregat, 0f,8);

        assertEquals(1660, e.calculaSalarioBruto(TipoEmpleado.encarregat, 0f,8));
    }

    @Test
    public void calculaSalarioBrutoEntradaVenedorMenos18hSalidaMenos1() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioBruto(TipoEmpleado.encarregat, -1,8);

        assertEquals(-1, e.calculaSalarioBruto(TipoEmpleado.encarregat, -1,8));
    }

    @Test
    public void calculaSalarioBrutoEntradaVenedor1500Menos1hSalidaMenos1() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioBruto(TipoEmpleado.encarregat, 1500,-1);

        assertEquals(-1, e.calculaSalarioBruto(TipoEmpleado.encarregat, 1500,-1));
    }

    @Test
    public void calculaSalarioBrutoEntradaNulo1500Menos8hSalidaMenos1() {
        EmpleadoBR e = new EmpleadoBR();
        e.calculaSalarioBruto(null, 1500,8);

        assertEquals(-1, e.calculaSalarioBruto(null, 1500,8));
    }
}