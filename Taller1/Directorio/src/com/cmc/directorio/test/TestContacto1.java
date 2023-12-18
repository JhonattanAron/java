package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {
    public static void main(String[] args) {

        Telefono telf = new Telefono("movi", "0996584853", 10);
        Contacto c = new Contacto("Aron", "Cachago", telf, 1.2);

        System.out.println(c.toString());
    }
}
