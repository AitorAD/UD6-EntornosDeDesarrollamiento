package es.iesmz.tests;

import java.math.BigInteger;

public class Compte {
    private String nombreTitular;
    private String numCuenta;
    private final String extension;

    public Compte(String nombreTitular, String numCuenta) {
        extension = "ES";
        this.nombreTitular = nombreTitular;
        this.numCuenta = numCuenta;
    }

    boolean compruebaIBAN(String iban) {
        boolean validacion = false;
        if (iban.length() == 34) {
            if (obtenerDigitosDeControl(iban).equals(iban.substring(2,3))) {
                validacion = true;
            }
        }
        return validacion;
    }

    String generaIBAN(String entitat, String oficina, String dc, String compte) throws IvalidIbanException {
        if (entitat.length() != 4 || oficina.length() != 4 || dc.length() != 2 || compte.length() != 10) {
            throw new IvalidIbanException("");
        }
        BigInteger nIBAN = new BigInteger(entitat + oficina + compte + "142800");
        String digitosDeControl = obtenerDigitosDeControl(nIBAN.toString());
        return extension + digitosDeControl + nIBAN;
    }

    private String obtenerDigitosDeControl(String iban) {
        BigInteger nIBAN = new BigInteger(iban.substring(4,33));
        BigInteger modulo = new BigInteger("97");
        nIBAN = nIBAN.mod(modulo);
        BigInteger resta = new BigInteger("98");
        nIBAN = nIBAN.subtract(resta);
        return nIBAN.toString();
    }
}
