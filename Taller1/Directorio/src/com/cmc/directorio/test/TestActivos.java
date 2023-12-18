package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {
    public static void main(String[] args) {
        Telefono telf1 = new Telefono("claro", "099655445", 8);
        Contacto c1 = new Contacto("Marta", "Cuti", telf1, 3.5);
        AdminContactos admin = new AdminContactos();
        System.out.println(c1.toString());
        admin.activarUsuario(c1);
        System.out.println(c1.toString());
    }
}
