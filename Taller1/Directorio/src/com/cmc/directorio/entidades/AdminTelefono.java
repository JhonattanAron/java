package com.cmc.directorio.entidades;

import java.util.ArrayList;

public class AdminTelefono {

    public void activarMensajeria(Telefono telefono) {
        if (telefono.getOperadora() != null) {
            telefono.setTieneWhatsapp(true);
        } else {
            System.out.println("El celular no tiene operadora");
        }
    }

    public String contarMovi(Telefono[] telefonos) {
        ArrayList<String> list = new ArrayList<>();
        for (Telefono telefono : telefonos) {
            int i = 0;
            if (telefono.getOperadora() == "movi") {
                list.add(telefono.getOperadora());
            }
        }
        return list.toString();
    }

}
