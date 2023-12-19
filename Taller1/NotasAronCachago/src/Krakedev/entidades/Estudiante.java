package Krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String cedula;
    private ArrayList<Nota> notas = new ArrayList<>();

    public void agregarNota(Nota nuevaNota) {
        if (notas.stream().anyMatch(nota -> nota.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo()))) {
            System.out.println("El codigo de Materia se repite");
        } else {
            notas.add(nuevaNota);
        }
    }

    public void modificarNota(String codigo, double nuevaNota) {
        for (Nota nota : notas) {
            if (nota.getMateria().getCodigo().equals(codigo)) {
                nota.setCalificacion(nuevaNota);
            } else {
                System.out.println("No se encontro el codigo de Materia");
            }
        }
    }

    public double calcularPromedioNotasEstudiante() {
        double sumaNotas = 0.0;
        int materias = 0;
        for (Nota nota : notas) {
            sumaNotas += nota.getCalificacion();
            materias += 1;
        }
        return sumaNotas / materias;
    }

    public void mostrar() {
        System.out.println(
                "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula +
                        ", notas=" + notas + "]");
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

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Nota> getNotas() {
        return this.notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

}
