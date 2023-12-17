package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Productos;

public class TestProducto {
    public static void main(String[] args) {
        Productos productos = new Productos("Televisor Lg");
        productos.setPrecio(100);
        System.out.println(productos.calcularPreciPromo(30));
    }
}
