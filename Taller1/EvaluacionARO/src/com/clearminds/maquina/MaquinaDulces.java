package com.clearminds.maquina;

import com.clearminds.componentes.Celda;

public class MaquinaDulces {
    private Celda celda1;
    private Celda celda2;
    private Celda celda3;
    private Celda celda4;
    private double saldo;

    public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
        celda1.setCodigo(codigo1);
        celda1.setCodigo(codigo2);
        celda1.setCodigo(codigo3);
        celda1.setCodigo(codigo4);
    }

    public void mostrarConfiguracion() {
        System.out.println(
                "Configuracion\n" +
                        "----------------" +
                        "\nCodigo Celda1: " + celda1.getCodigo() +
                        "\nCodigo Celda2: " + celda1.getCodigo() +
                        "\nCodigo Celda3: " + celda1.getCodigo() +
                        "\nCodigo Celda4: " + celda1.getCodigo() +
                        "\n----------------" +
                        "Saldo Actal:" + getSaldo()

        );
    }

    public void cargarProducto() {

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
