package com.fosanzdev.T7.Ej2;

public class Asignatura {

    private String nombre;
    private int id;
    private String curso;

    public Asignatura(String nombre, int id, String curso) {
        this.nombre = nombre;
        this.id = id;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", id=" + id + ", curso=" + curso + '}';
    }
}