package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

    public static void main(String[] args) {
        Telefono telf1 = new Telefono("claro", "099655445", 8);
        Telefono telf2 = new Telefono("movi", "0996584853", 10);
        Contacto c1 = new Contacto("Marta", "Cuti", telf1, 3.5);
        Contacto c2 = new Contacto("Aron", "Cachago", telf2, 2.2);
        AdminContactos admin = new AdminContactos();

        System.out.println("Contacto mas Pesado\n" + admin.buscarMasPesado(c1, c2));
        System.out.println(admin.compararOperadoras(c1, c2));
    }
}
