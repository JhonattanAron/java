package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {
    public static void main(String[] args) throws Exception {
        Validacion validacion = new Validacion();
        System.out.println(validacion.validarMonto(500.50));

    }
}
