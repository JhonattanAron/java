package com.cmc.repaso.entidades;

public class Estudiante {
    private String nombre;
    private double nota;
    private String resultado;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public void calificar(double nota) {
        this.nota = nota;
        if (nota < 8) {
            this.resultado = "F";
        } else if (nota >= 8) {
            this.resultado = "A";
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getResultado() {
        return this.resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", nota='" + getNota() + "'" +
                ", resultado='" + getResultado() + "'" +
                "}";
    }

}
