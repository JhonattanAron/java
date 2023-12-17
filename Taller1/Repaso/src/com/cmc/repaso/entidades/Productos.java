package com.cmc.repaso.entidades;

public class Productos {
    public double precio;
    public String nombre;

    public Productos(String nombre) {
        this.nombre = nombre;
    }

    public double calcularPreciPromo(double porcentajeDescuento) {
        double descuento = (porcentajeDescuento / 100) * precio;
        return precio - descuento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0.0) {
            this.precio = precio;
        } else {
            this.precio = precio * -1.0;
        }
    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", precio='" + getPrecio() + "'" +
                "}";
    }

}
