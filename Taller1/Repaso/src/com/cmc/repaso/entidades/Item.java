package com.cmc.repaso.entidades;

public class Item {
    public String name;
    public int productosActuales;
    public int productosDevueltos;
    public int productosVendidos;

    public Item(String name) {
        this.name = name;
    }

    public void vender(int productosVendidos) {
        this.productosActuales -= productosVendidos;
        this.productosVendidos += productosVendidos;
    }

    public void devolver(int productosDevueltos) {
        this.productosVendidos -= productosDevueltos;
        this.productosDevueltos += productosDevueltos;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductosActuales() {
        return this.productosActuales;
    }

    public void setProductosActuales(int productosActuales) {
        this.productosActuales = productosActuales;
    }

    public int getProductosDevueltos() {
        return this.productosDevueltos;
    }

    public void setProductosDevueltos(int productosDevueltos) {
        this.productosDevueltos = productosDevueltos;
    }

    public int getProductosVendidos() {
        return this.productosVendidos;
    }

    public void setProductosVendidos(int productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public String imprimir() {
        return "{" +
                " name='" + getName() + "'" +
                ", productosActuales='" + getProductosActuales() + "'" +
                ", productosDevueltos='" + getProductosDevueltos() + "'" +
                ", productosVendidos='" + getProductosVendidos() + "'" +
                "}";
    }

}
