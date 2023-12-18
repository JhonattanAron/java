package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
    private ArrayList<Celda> celdas = new ArrayList<>();
    private double saldo;

    public MaquinaDulces() {
    }

    public MaquinaDulces(ArrayList<Celda> celdas, double saldo) {
        this.celdas = celdas;
        this.saldo = saldo;
    }

    public void agregarCelda(Celda celda) {
        celdas.add(celda);
    }

    public void mostrarConfiguracion() {
        System.out.println("--------Celdas-------");
        for (Celda celda : celdas) {
            System.out.println("Codigo Celda: " + celda.getCodigo());
        }
    }

    public Celda buscarCelda(String codigo) {
        for (Celda celda : celdas) {
            if (codigo.equals(celda.getCodigo())) {
                return celda;
            }
        }
        return null;
    }

    public void cargarProducto(Producto producto, String codigoCelda, int items) {
        Celda celdaRecuperada = buscarCelda(codigoCelda);
        if (celdaRecuperada != null) {
            celdaRecuperada.ingresarProducto(producto, items);
        }
    }

    public void mostrarProductos() {
        for (Celda celda : celdas) {
            System.out.println("CELDA:" + celda.getCodigo() +
                    " Stock: " + celda.getStock() +
                    verificarProductos(celda));
        }
        System.out.println("\nSaldo: " + getSaldo());
    }

    public String verificarProductos(Celda celda) {
        if (celda.getProducto() == null || celda.getProducto().getNombre() == null) {
            return " Sin Producto asignado";
        } else {
            return " Producto:" + celda.getProducto().getCodigo() +
                    " Precio:" + celda.getProducto().getPrecio();
        }
    }

    public Producto buscarProductoEnCelda(String codCelda) {
        for (Celda celda : celdas) {
            if (celda.getCodigo().equals(codCelda)) {
                Producto producto = celda.getProducto();
                return producto;
            }
        }
        return null;
    }

    public double consultarPrecio(String codCelda) {
        for (Celda celda : celdas) {
            if (celda.getCodigo().equals(codCelda)) {
                return celda.getProducto().getPrecio();
            }
        }
        return 0;
    }

    public Celda buscarCeldaProducto(String codProducto) {
        for (Celda celda : celdas) {
            Producto producto = celda.getProducto();
            if (producto != null && producto.getCodigo() == codProducto) {
                return celda;
            }
        }
        return null;
    }

    public void incrementarProductos(String codPro, int items) {
        Celda celdaEncontrada = buscarCeldaProducto(codPro);
        celdaEncontrada.setStock(items + celdaEncontrada.getStock());
    }

    public void vender(String codCelda) {
        for (Celda celda : celdas) {
            if (celda.getCodigo() == codCelda) {
                celda.setStock(celda.getStock() - 1);
                setSaldo(getSaldo() + celda.getProducto().getPrecio());
            }
        }
    }

    public double venderConCambio(String codCelda, double val) {
        Celda celdaEncontrada = buscarCelda(codCelda);
        celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
        double precioProducto = celdaEncontrada.getProducto().getPrecio();
        setSaldo(getSaldo() + precioProducto);
        double vuelto = val - precioProducto;
        return vuelto;

    }

    public ArrayList<Producto> buscarMenores(double limite) {
        ArrayList<Producto> productosMenores = new ArrayList<>();
        for (Celda celda : celdas) {
            if (celda.getProducto().getPrecio() <= limite) {
                productosMenores.add(celda.getProducto());
            }
        }
        return productosMenores;
    }

    public ArrayList<Celda> getCeldas() {
        return celdas;
    }

    public void setCeldas(ArrayList<Celda> celdas) {
        this.celdas = celdas;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
