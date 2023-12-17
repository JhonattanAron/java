package com.cmc.directorio.entidades;

public class AdminTelefono {

    public void activarMensajeria(Telefono telefono) {
        if (telefono.getOperadora() != null) {
            telefono.setTieneWhatsapp(true);
        } else {
            System.out.println("El celular no tiene operadora");
        }
    }

    public String contarMovi(Telefono[] telefonos) {
        int i = 0;
        for (Telefono telefono : telefonos) {
            if (telefono.getOperadora() == "movi") {
                i++;
            }
        }
        return "Telefonos con operadora movi: " + i;
    }

    public String contarClaro(Telefono[] telefonos) {
        int i = 0;
        for (Telefono telefono : telefonos) {
            if (telefono.getOperadora() == "claro") {
                i++;
            }
        }
        return "Telefonos con operadora movi: " + i;
    }

}
