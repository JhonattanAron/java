package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
    private Celda celda1 = new Celda();
    private Celda celda2 = new Celda();
    private Celda celda3 = new Celda();
    private Celda celda4 = new Celda();
    private double saldo;

    public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
        celda1.setCodigo(codigo1);
        celda2.setCodigo(codigo2);
        celda3.setCodigo(codigo3);
        celda4.setCodigo(codigo4);
    }

    public void mostrarConfiguracion() {
        System.out.println(
                "Configuracion\n" +
                        "----------------" +
                        "\nCodigo Celda 1: " + celda1.getCodigo() +
                        "\nCodigo Celda 2: " + celda2.getCodigo() +
                        "\nCodigo Celda 3: " + celda3.getCodigo() +
                        "\nCodigo Celda 4: " + celda4.getCodigo() +
                        "\n----------------" +
                        "\nSaldo Actual: " + getSaldo());
    }

    public Celda buscarCelda(String codigo) {
        if (codigo.equals(getCelda1().getCodigo())) {
            return getCelda1();
        } else if (codigo.equals(getCelda2().getCodigo())) {
            return getCelda2();
        } else if (codigo.equals(getCelda3().getCodigo())) {
            return getCelda3();
        } else if (codigo.equals(getCelda4().getCodigo())) {
            return getCelda4();
        } else {
            return null;
        }
    }

    public void cargarProducto(Producto producto, String codigoCelda, int items) {
        Celda celdaRecuperada = buscarCelda(codigoCelda);
        celdaRecuperada.ingresarProducto(producto, items);
    }

    public void mostrarProductos() {
        System.out.println(
                "Configuracion\n" +
                        "---Celda 1-----" +
                        "\nCodigo: " + celda1.getCodigo() +
                        "\nStock: " + celda1.getStock() +
                        "\n" + verificarProductos(celda1) +
                        "---Celda 2-----" +
                        "\nCodigo: " + celda2.getCodigo() +
                        "\nStock: " + celda2.getStock() +
                        "\n" + verificarProductos(celda2) +
                        "---Celda 3-----" +
                        "\nCodigo: " + celda3.getCodigo() +
                        "\nStock: " + celda3.getStock() +
                        "\n" + verificarProductos(celda3) +
                        "---Celda 4-----" +
                        "\nCodigo: " + celda4.getCodigo() +
                        "\nStock: " + celda4.getStock() +
                        "\n" + verificarProductos(celda4));
    }

    public String verificarProductos(Celda celda) {
        if (celda.getProducto() == null || celda.getProducto().getNombre() == null) {
            return "La celda no tiene producto!!!!\n";
        } else {
            return "Producto Nombre: " + celda.getProducto().getNombre() +
                    "\nProducto Precio: " + celda.getProducto().getPrecio() + "\n";
        }
    }

    public Producto buscarProductoEnCelda(String codigo) {
        if (codigo.equals(getCelda1().getCodigo())) {
            return getCelda1().getProducto();
        } else if (codigo.equals(getCelda2().getCodigo())) {
            return getCelda2().getProducto();
        } else if (codigo.equals(getCelda3().getCodigo())) {
            return getCelda3().getProducto();
        } else if (codigo.equals(getCelda4().getCodigo())) {
            return getCelda4().getProducto();
        } else {
            return null;
        }
    }

    public double consultarPrecio(String codigo) {
        if (codigo.equals(getCelda1().getCodigo())) {
            return getCelda1().getProducto().getPrecio();
        } else if (codigo.equals(getCelda2().getCodigo())) {
            return getCelda2().getProducto().getPrecio();
        } else if (codigo.equals(getCelda3().getCodigo())) {
            return getCelda3().getProducto().getPrecio();
        } else if (codigo.equals(getCelda4().getCodigo())) {
            return getCelda4().getProducto().getPrecio();
        } else {
            return 0;
        }
    }

    public Celda buscarCeldaProducto(String codigoProducto) {
        if (codigoProducto.equals(celda1.getProducto().getCodigo())) {
            return getCelda1();
        } else if (codigoProducto.equals(celda2.getProducto().getCodigo())) {
            return getCelda2();
        } else if (codigoProducto.equals(celda3.getProducto().getCodigo())) {
            return getCelda3();
        } else if (codigoProducto.equals(celda4.getProducto().getCodigo())) {
            return getCelda4();
        } else {
            return null;
        }
    }

    public void incrementarProductos(String codigoProducto, int items) {
        Celda celdaEcontrada = buscarCeldaProducto(codigoProducto);
        celdaEcontrada.setStock(celdaEcontrada.getStock() + items);
    }

    public void vender(String codigoCelda) {
        Celda celdaEcontrada = buscarCeldaProducto(codigoCelda);
        celdaEcontrada.setStock(celdaEcontrada.getStock() - 1);
        double precioProducto = celdaEcontrada.getProducto().getPrecio();
        setSaldo(precioProducto + getSaldo());
    }

    public double venderConCambio(String codigoCelda, double valorIngresado) {
        Celda celda = buscarCelda(codigoCelda);
        celda.setStock(celda.getStock() - 1);
        double vuelto = valorIngresado - celda.getProducto().getPrecio();
        setSaldo(celda.getProducto().getPrecio() + getSaldo());
        return vuelto;
    }

    public Celda getCelda1() {
        return celda1;
    }

    public void setCelda1(Celda celda1) {
        this.celda1 = celda1;
    }

    public Celda getCelda2() {
        return celda2;
    }

    public void setCelda2(Celda celda2) {
        this.celda2 = celda2;
    }

    public Celda getCelda3() {
        return celda3;
    }

    public void setCelda3(Celda celda3) {
        this.celda3 = celda3;
    }

    public Celda getCelda4() {
        return celda4;
    }

    public void setCelda4(Celda celda4) {
        this.celda4 = celda4;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
