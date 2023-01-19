package com.fosanzdev.T7.Ej2;

public class Ej2 {
    public Ej2() {
        Asignatura programacion = new Asignatura("Programación", 1017, "curso 1");

        System.out.println("Nombre: " + programacion.getNombre());
        System.out.println("ID: " + programacion.getId());
        System.out.println("Curso: " + programacion.getCurso());

        System.out.println(programacion.toString());
    }
}
