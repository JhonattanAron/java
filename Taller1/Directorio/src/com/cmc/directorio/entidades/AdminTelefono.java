package com.cmc.directorio.entidades;

public class AdminTelefono {

    public void activarMensajeria(Telefono telefono) {
        if (telefono.getOperadora() != null) {
            telefono.setTieneWhatsapp(true);
        } else {
            System.out.println("El celular no tiene operadora");
        }
    }

}
