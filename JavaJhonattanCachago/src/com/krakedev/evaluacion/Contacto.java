package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {

    private String cedula;
    private String nombre;
    private String apellido;
    private Direccion direccion;
    private ArrayList<Telefono> telefonos = new ArrayList<Telefono>();

    public Contacto(String cedula, String nombre, String apellido, Direccion direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public void imprimir() {
        // Test Contacto1
        /*
         * System.out.println(
         * "Cédula: " + getCedula() +
         * "\nNombre: " + getNombre() +
         * "\nApellido: " + getApellido() +
         * "\nDireccion: " + getDireccion() + "\n" +
         * "   Calle Principal: " + getDireccion().getCallePrincipal() + "\n" +
         * "   Calle Secundaria: " + getDireccion().getCalleSecundaria());
         */
        // Test Contacto2
        System.out.println(
                "***" + getNombre() + "***\n" +
                        getDireccion().getCallePrincipal() + " y " + getDireccion().getCalleSecundaria());

    }

    public void agregarTelefono(Telefono telefono) {
        this.telefonos.add(telefono);
    }

    public void mostrarTelefonos() {
        System.out.println("Telefono con estado 'C':");
        for (Telefono telefono : telefonos) {
            if (telefono.getEstado().equals("C")) {
                System.out.println(
                        "Numero: " + telefono.getNúmero() + ", Tipo: " + telefono.getTipo());
            }
        }
    }

    public ArrayList<Telefono> recuperarIncorrectos() {
        ArrayList<Telefono> incorrectos = new ArrayList<>();
        for (Telefono telefono : telefonos) {
            if ("E".equals(telefono.getEstado())) {
                incorrectos.add(telefono);
            }
        }
        return incorrectos;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Direccion getDireccion() {
        return this.direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

}
