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
        if (iban.length() == 24) {
            String digitosDeControl = iban.substring(2,4);
            if (obtenerDigitosDeControl(iban).equals(digitosDeControl)) {
                validacion = true;
            }
        }
        return validacion;
    }

    String generaIBAN(String entitat, String oficina, String dc, String compte) {
        if (entitat.matches("^[0-9]{4}") && oficina.matches("^[0-9]{4}") && dc.matches("^[0-9]{2}") && compte.matches("^[0-9]{10}")) {
            String IBANsinDigitosDeControl = extension + "XX" + entitat + oficina + dc + compte;
            String digitosDeControl = obtenerDigitosDeControl(IBANsinDigitosDeControl);
            String IBAN = extension + digitosDeControl + entitat + oficina + dc + compte;
            return IBAN;
        }
        return null;
    }

    private String obtenerDigitosDeControl(String iban) {
        BigInteger nIBAN = new BigInteger(iban.substring(4,24) + "142800");
        BigInteger modulo = new BigInteger("97");
        nIBAN = nIBAN.mod(modulo);
        BigInteger resta = new BigInteger("98");
        nIBAN = resta.subtract(nIBAN);
        return nIBAN.toString();
    }
}
