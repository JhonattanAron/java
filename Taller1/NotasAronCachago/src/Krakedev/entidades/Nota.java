package Krakedev.entidades;

public class Nota {

    private Materia materia;
    private double calificacion;

    public void mostrar() {
        System.out.println("Nota [materia=" + materia + ", calificacion=" + calificacion + "]");
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

}
