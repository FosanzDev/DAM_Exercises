package com.fosanzdev.T10.Ej10.Classes;

import java.time.LocalDate;
import java.util.Date;

public class Hijo {
    private final String nombre;
    private final LocalDate fechaNacimiento;

    public Hijo(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return "- " + nombre + '(' + fechaNacimiento + ')' +'\n';
    }
}
