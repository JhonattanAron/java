package com.clearminds.test;

import java.text.DecimalFormat;

import com.clearminds.componentes.Producto;

public class TestProducto {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Producto producto = new Producto("KE34", "Papitas", 0.85);
        System.out.println(producto.toString());
        producto.incrementarPrecio(6);
        System.out.println("Nuevo Precio: " + df.format(producto.getPrecio()));
        producto.incrementarPrecio(50);
        System.out.println("Precio Incrementado: " + df.format(producto.getPrecio()));
        producto.disminuirPrecio(0.35);
        System.out.println("Precio Incrementado: " + df.format(producto.getPrecio()));
    }
}
