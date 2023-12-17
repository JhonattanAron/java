package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Aron");
        Estudiante estudiante2 = new Estudiante("Maria");
        estudiante.calificar(8.5);
        estudiante2.calificar(5.5);

        System.out.println(estudiante.toString());
        System.out.println(estudiante2.toString());

    }

}
