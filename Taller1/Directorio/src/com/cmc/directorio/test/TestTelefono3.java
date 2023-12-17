package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {
    public static void main(String[] args) {
        AdminTelefono adminTelefono = new AdminTelefono();
        Telefono[] telefonos = new Telefono[3];
        telefonos[0] = new Telefono("movi", "09932705554", 10);
        telefonos[1] = new Telefono("movi", "09932705632", 3);
        telefonos[2] = new Telefono("movi", "09932758954", 11);

        System.out.println(adminTelefono.contarMovi(telefonos));
    }
}
