package com.fosanzdev.T10.Ej5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Paciente {

    // Setting up default values
    static final char SEXO_DEF = 'M';
    static int localId = 0;

    // Attributes
    private int id;
    private String nombre;
    private Date fechaNacimiento;
    private char sexo;
    private double altura;
    private double peso;

    // Constructors
    public Paciente(String nombre, Date fechaNacimiento, char sexo, double altura, double peso) {
        this.id = localId++;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    //Getters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    //ToString
    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + new SimpleDateFormat("dd/MM/yyy").format(fechaNacimiento)  +
                ", sexo=" + sexo +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paciente paciente = (Paciente) o;

        if (id != paciente.id) return false;
        return nombre.equals(paciente.nombre);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nombre.hashCode();
        return result;
    }
}
