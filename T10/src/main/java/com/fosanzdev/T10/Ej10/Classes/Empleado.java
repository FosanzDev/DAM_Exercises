package com.fosanzdev.T10.Ej10.Classes;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empleado {

    private final String DNI;
    private final String nombre;
    private final String apellidos;
    private final LocalDate fechaNacimiento;
    private final ArrayList<Hijo> hijos;
    private double salario;

    public Empleado(String DNI, String nombre, String apellidos, LocalDate fechaNacimiento, double salary, ArrayList<Hijo> hijos) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.salario = salary;
        this.hijos = hijos;
    }

    //Getters

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public double getSalario() {
        return salario;
    }


    public ArrayList<Hijo> getHijos() {
        return hijos;
    }

    public void addHijo(Hijo h){
        hijos.add(h);
    }

    public void removeHijo(Hijo h){
        hijos.remove(h);
    }

    public void removeHijo(String name){
        for (Hijo hijo : this.hijos){
            if (hijo.getNombre().equals(name)){
                this.removeHijo(hijo);
            }
        }
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Hijo hijo : hijos){
            sb.append('\t');
            sb.append(hijo.toString());
        }
        return "Datos del empleado: \n" +
                "DNI: " + DNI + '\n' +
                "Nombre: " + nombre + '\n' +
                "Apellidos: " + apellidos + '\n' +
                "Fecha de nacimiento: " + fechaNacimiento + '\n' +
                "Salario: " + salario + '\n' +
                "Hijos:\n" + sb.toString()
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Empleado empleado = (Empleado) o;

        return DNI.equals(empleado.DNI);
    }

    @Override
    public int hashCode() {
        return DNI.hashCode();
    }
}
