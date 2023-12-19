package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {

    private ArrayList<Contacto> contactos = new ArrayList<>();
    private Date fechaModificacion;
    private ArrayList<Contacto> correcto = new ArrayList<>();
    private ArrayList<Contacto> incorrecto = new ArrayList<>();

    public Directorio() {
    }

    public Directorio(ArrayList<Contacto> contactos, Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
        this.contactos = new ArrayList<>();

        for (Contacto contacto : contactos) {
            if (!existeContactoConCedula(contacto.getCedula())) {
                this.contactos.add(contacto);
            } else {
                System.out.println("Error: Ya existe un contacto con la cédula proporcionada.");
            }
        }
    }

    private boolean existeContactoConCedula(String cedula) {
        for (Contacto contacto : contactos) {
            if (contacto.getCedula().equals(cedula)) {
                return true;
            }
        }
        return false;
    }

    public boolean agregarContacto(Contacto contacto) {
        if (!existeContactoConCedula(contacto.getCedula())) {
            contactos.add(contacto);
            setFechaModificacion();
            return true;
        } else {
            return false;
        }
    }

    public Contacto buscarPorCedula(String cedula) {
        for (Contacto contacto : contactos) {
            if (contacto.getCedula().equals(cedula)) {
                return contacto;
            }
        }
        return null;
    }

    public String consultarUltimaModificacion() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
        String formattedDate = dateFormat.format(getFechaModificacion());

        return "Ultima modificacion: " + formattedDate;
    }

    public int contarPerdidos() {
        int pedidos = 0;
        for (Contacto contacto : contactos) {
            if (contacto.getDireccion() == null) {
                pedidos += 1;
            }
        }
        return pedidos;
    }

    public int contarFijos() {
        int fijos = 0;
        for (Contacto contacto : contactos) {
            ArrayList<Telefono> telefonos = contacto.getTelefonos();
            for (Telefono telefono : telefonos) {
                if (telefono.getTipo().equalsIgnoreCase("Convencional") &&
                        telefono.getEstado().equals("C")) {
                    fijos += 1;
                }
            }
        }
        return fijos;
    }

    public void depurar() {
        for (Contacto contacto : contactos) {
            if (contacto.getDireccion() == null) {
                incorrecto.add(contacto);
            } else {
                correcto.add(contacto);
            }
        }
        contactos.clear();
    }

    public ArrayList<Contacto> getContactos() {
        return this.contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }

    public void setFechaModificacion() {
        this.fechaModificacion = new Date(System.currentTimeMillis());
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public ArrayList<Contacto> getCorrectos() {
        return correcto;
    }

    public void setCorrecto(ArrayList<Contacto> correcto) {
        this.correcto = correcto;
    }

    public ArrayList<Contacto> getIncorrectos() {
        return incorrecto;
    }

    public void setIncorrecto(ArrayList<Contacto> incorrecto) {
        this.incorrecto = incorrecto;
    }

}
