package com.cmc.directorio.entidades;

public class Telefono {
    public String operadora;
    public String numero;
    public int codigo;
    public boolean tieneWhatsapp = false;

    public Telefono(String operadora, String numero, int codigo) {
        this.operadora = operadora;
        this.numero = numero;
        this.codigo = codigo;
    }

    public String getOperadora() {
        return this.operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isTieneWhatsapp() {
        return this.tieneWhatsapp;
    }

    public boolean getTieneWhatsapp() {
        return this.tieneWhatsapp;
    }

    public void setTieneWhatsapp(boolean tieneWhatsapp) {
        this.tieneWhatsapp = tieneWhatsapp;
    }

    @Override
    public String toString() {
        return "{" +
                " operadora='" + getOperadora() + "'" +
                ", numero='" + getNumero() + "'" +
                ", codigo='" + getCodigo() + "'" +
                ", tieneWhatsapp='" + isTieneWhatsapp() + "'" +
                "}";
    }

}
