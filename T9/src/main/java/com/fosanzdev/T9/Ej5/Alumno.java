package com.fosanzdev.T9.Ej5;

public class Alumno {

    private String nombre;
    private int edad;
    private int altura;

    public Alumno(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNia() {
        return 0;
    }
}
