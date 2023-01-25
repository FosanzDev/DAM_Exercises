package com.fosanzdev.T7.Ej3;

import java.time.LocalDateTime;

public class Alumno {
    private int nia;
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private Grupo grupo;
    private String telefono;

    public Alumno(int nia, String nombre, String apellidos, String fechaNacimiento, Grupo grupo, String telefono) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.grupo = grupo;
        this.telefono = telefono;
    }

    public Alumno(Alumno alumno) {
        this.nia = alumno.getNia();
        this.nombre = alumno.getNombre();
        this.apellidos = alumno.getApellidos();
        this.fechaNacimiento = alumno.getFechaNacimiento();
        this.grupo = alumno.getGrupo();
        this.telefono = alumno.getTelefono();
    }

    public int getNia() {
        return nia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getAge() {
        LocalDateTime now = LocalDateTime.now();

        String fecha = this.getFechaNacimiento();
        String[] fechaSplit = fecha.split("/");
        int dia = Integer.parseInt(fechaSplit[0]);
        int mes = Integer.parseInt(fechaSplit[1]);
        int anyo = Integer.parseInt(fechaSplit[2]);

        if (now.getMonthValue() - mes >= 0
                && now.getDayOfMonth() - dia >= 0) {
            return now.getYear() - anyo;
        } else {
            return now.getYear() - anyo - 1;
        }

    }

    @Override
    public String toString() {
        return nia + " || "
                + nombre + " || "
                + apellidos + " || "
                + fechaNacimiento + " || "
                + grupo + " || "
                + telefono;
    }

}
