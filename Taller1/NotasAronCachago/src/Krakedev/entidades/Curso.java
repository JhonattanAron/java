package Krakedev.entidades;

import java.util.ArrayList;

public class Curso {

    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public String buscarEstudiantePorCedula(Estudiante estudiante) {
        if (estudiantes.stream().anyMatch(est -> est.getCedula().equals(estudiante.getCedula()))) {
            System.out.println("El estudiante se encuntra en el Curso");
        }
        return null;
    }

    public void matricularEstudiante(Estudiante estudiante) {
        if (buscarEstudiantePorCedula(estudiante) == null) {
            estudiantes.add(estudiante);
        } else {
            System.out.println("El estudiante se encuntra en el Curso");
        }
    }

    public double calcularPromedioCurso() {
        double sumPromedios = 0;
        double estudiantesSum = 0;
        for (Estudiante estudiante : estudiantes) {
            sumPromedios += estudiante.calcularPromedioNotasEstudiante();
            estudiantesSum += 1;
        }
        return sumPromedios / estudiantesSum;
    }

    public void mostrar() {
        System.out.println("Curso [estudiantes=" + estudiantes + "]");
    }

}
