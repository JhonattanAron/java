package com.clearminds.cuentas;

public class Cuenta {
    private String id;
    private String tipo = "A";
    private double Saldo;

    public Cuenta(String id) {
        this.id = id;
    }

    public Cuenta(String id, String tipo, double Saldo) {
        this.id = id;
        this.tipo = tipo;
        this.Saldo = Saldo;
    }

    public String imprimir() {
        return "****************" +
                "\nCUENTA\n" +
                "\n****************" +
                "\nNumero de Cuenta: " + getId() +
                "\nTipo: " + getTipo() +
                "\nSaldo: " + getSaldo() +
                "\n****************";
    }

    public String imprimirConMiEstilo() {
        return "{" +
                " id='" + getId() + "'" +
                ", tipo='" + getTipo() + "'" +
                ", Saldo='" + getSaldo() + "'" +
                "}";

    }

    public String getId() {
        return this.id;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return this.Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

}
