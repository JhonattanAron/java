package models;

public class Auto {
    private String marca;
    private int anio;
    private double precio;

    public Auto(String marca, int anio, float precio) {
        this.marca = marca;
        this.anio = anio;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public int getanio() {
        return anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setMarca(String maraca) {
        this.marca = maraca;
    }

    public void setanio(int anio) {
        this.anio = anio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String toString() {
        return "Auto(" + marca + " Anio: " + anio + " Precio: " + precio + ")";
    }

}