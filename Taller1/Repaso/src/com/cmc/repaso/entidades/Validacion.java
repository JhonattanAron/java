package com.cmc.repaso.entidades;

public class Validacion {
    public boolean validarMonto(Double monto) {
        if (monto > 0.0) {
            return true;
        } else {
            return false;
        }
    }
}
