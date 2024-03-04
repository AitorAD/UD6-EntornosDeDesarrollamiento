package es.iesmz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarteraTest {
    @Test
    public void testAlCrearCuentaElSaldoEsCero() {
        Cuenta c = new Cuenta();
        assertEquals(0, c.getSaldo());
    }

    @Test
    public void testAlIngresar100EnCuentaVaciaElSaldoEs100() {
        Cuenta c = new Cuenta();
        c.ingresar(100);
        assertEquals(100, c.getSaldo());
    }

    @Test
    public void testAlIngresar3000EnCuentaVaciaElSaldoEs3000() {
        Cuenta c = new Cuenta();
        c.ingresar(3000);
        assertEquals(3000, c.getSaldo());
    }

    @Test
    public void testAlIngresar100EnCuentaCon300ElSaldoEs3100() {
        Cuenta c = new Cuenta();
        c.ingresar(100);
        c.ingresar(3000);
        assertEquals(3100, c.getSaldo());
    }

    @Test
    public void testAlIngresarMenos100EnCuentaVaciaElSaldoSigueSiendo0() {
        Cuenta c = new Cuenta();
        c.ingresar(-100);
        assertEquals(0, c.getSaldo());
    }

    @Test
    public void testSiIngreso100Coma45EnUnaCuentaVaciaElSaldoEs100Coma45() {
        Cuenta c = new Cuenta();
        c.ingresar(100.45);
        assertEquals(100.45, c.getSaldo());
    }

    @Test
    public void testSiIngreso6000Coma00EnUnaCuentaVaciaElSaldoEsDe6000Coma00() {
        Cuenta c = new Cuenta();
        c.ingresar(6000.00);
        assertEquals(6000.00, c.getSaldo());
    }

    @Test
    public void testSiIngreso6000Coma01EnUnaCuentaVaciaElSaldoEsDe0() {
        Cuenta c = new Cuenta();
        c.ingresar(6000.01);
        assertEquals(0, c.getSaldo());
    }

    @Test
    public void AlRetirar100EnCuentaCon500ElSaldoEs400() {
        Cuenta c = new Cuenta();
        c.ingresar(500);
        c.retirar(100);
        assertEquals(400,c.getSaldo());
    }

    @Test
    public void SiRetiro500EnCuentaCon200NoOcurreNadaYElSaldoSigueSiendo200() {
        Cuenta c = new Cuenta();
        c.ingresar(200);
        c.retirar(500);
        assertEquals(200,c.getSaldo());
    }

    @Test
    public void SiRetiroMenos100EnCuentaCon500NoOcurreNadaYElSaldoSigueSiendo500() {
        Cuenta c = new Cuenta();
        c.ingresar(500);
        c.retirar(-100);
        assertEquals(500,c.getSaldo());
    }

    @Test
    public void AlRetirar100Coma45EnCuentaCon500ElSaldoEs399Coma55() {
        Cuenta c = new Cuenta();
        c.ingresar(500);
        c.retirar(100.45);
        assertEquals(399.55, c.getSaldo());
    }

    @Test
    public void SiRetiro6000Coma00EnUnaCuentaCon7000ElSaldoEsDe1000() {
        Cuenta c = new Cuenta();
        c.ingresar(6000);
        c.ingresar(1000);
        c.retirar(6000.00);
        assertEquals(1000, c.getSaldo());
    }

    @Test
    public void SiRetiro6000Coma01EnUnaCuentaCon7000NoOcurreNadaYElSaldoSigueSiendo7000() {
        Cuenta c = new Cuenta();
        c.ingresar(6000);
        c.ingresar(1000);
        c.retirar(6000.01);
        assertEquals(7000, c.getSaldo());
    }

    @Test
    public void AlHacerUnaTransferenciaDe100DesdeUnaCuentaCon500AUnaCon50EnLaPrimeraCuentaElSaldoSeQuedaráEn400YEnLaSegundaSeQuedaráEn150() {
        Cuenta c1 = new Cuenta();
        c1.ingresar(500);
        Cuenta c2 = new Cuenta();
        c2.ingresar(50);
        c1.tranferencia(c2, 100);
        assertEquals(400, c1.getSaldo());
        assertEquals(150, c2.getSaldo());
    }

    @Test
    public void  AlHacerUnaTransferenciaDeMenos100DesdeUnaCuentaCon500AUnaCon50LosSaldosSeQuedanEn500Y50Respectivamente() {
        Cuenta c1 = new Cuenta();
        c1.ingresar(500);
        Cuenta c2 = new Cuenta();
        c2.ingresar(50);
        c1.tranferencia(c2, -100);
        assertEquals(500, c1.getSaldo());
        assertEquals(50, c2.getSaldo());
    }

    @Test
    public void AlHacerUnaTransferenciaDe3000DesdeUnaCuentaCon3500AUnaCon50EnLaPrimeraCuentaElSaldoSeQuedaráEn500YEnLaSegundaSeQuedaráEn3050() {
        Cuenta c1 = new Cuenta();
        c1.ingresar(3500);
        Cuenta c2 = new Cuenta();
        c2.ingresar(50);
        c1.tranferencia(c2, 3000);
        assertEquals(500, c1.getSaldo());
        assertEquals(3050, c2.getSaldo());
    }

    @Test
    public void AlHacerUnaTransferenciaDe3000Coma01DesdeUnaCuentaCon3500AUnaCon50EnLaPrimeraCuentaElSaldoSeQuedaráEn3500YEnLaSegundaSeQuedaráEn50() {
        Cuenta c1 = new Cuenta();
        c1.ingresar(3500);
        Cuenta c2 = new Cuenta();
        c2.ingresar(50);
        c1.tranferencia(c2, 3000.1);
        assertEquals(3500, c1.getSaldo());
        assertEquals(50, c2.getSaldo());
    }
}
