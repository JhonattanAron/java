package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {
    public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.agregarCelda(new Celda("A1"));
        maquina.agregarCelda(new Celda("B1"));
        maquina.agregarCelda(new Celda("A2"));
        maquina.agregarCelda(new Celda("B2"));
        maquina.agregarCelda(new Celda("C1"));
        maquina.agregarCelda(new Celda("C2"));

        Producto producto1 = new Producto("KH3", "Papitas", 0.85);
        Producto producto2 = new Producto("KH4", "Doritos", 0.50);
        Producto producto3 = new Producto("K7F", "Jet", 0.25);
        Producto producto4 = new Producto("LH3", "DeTodito", 0.6);
        Producto producto5 = new Producto("JK3", "Galletas Amor", 1.30);
        Producto producto6 = new Producto("LH3", "AGOGO", 2.5);

        maquina.cargarProducto(producto1, "A1", 6);
        maquina.cargarProducto(producto2, "B1", 3);
        maquina.cargarProducto(producto3, "A2", 5);
        maquina.cargarProducto(producto4, "B2", 6);
        maquina.cargarProducto(producto5, "C1", 4);
        maquina.cargarProducto(producto6, "C2", 2);

        ArrayList<Producto> productosMenores = maquina.buscarMenores(1.0);

        System.out.println("Productos menores: " + productosMenores.size());
        for (Producto producto : productosMenores) {
            System.out.println("Nombre: " + producto.getNombre() +
                    " Precio: " + producto.getPrecio());
        }

    }
}
