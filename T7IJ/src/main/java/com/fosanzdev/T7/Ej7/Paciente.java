package com.fosanzdev.T7.Ej7;

public class Paciente {
    private int SIP;
    private String nombre;
    private char sexo;
    private int edad;
    private String sintomatologia;
    private String observaciones;
    private String horaIngreso;
    private String fechaIngreso;


    public Paciente(int SIP, String nombre, char sexo, int edad, String sintomatologia, String observaciones, String horaIngreso, String fechaIngreso) {
        this.SIP = SIP;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.sintomatologia = sintomatologia;
        this.observaciones = observaciones;
        this.horaIngreso = horaIngreso;
        this.fechaIngreso = fechaIngreso;
    }

    public int getSIP() {
        return SIP;
    }

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public String getSintomatologia() {
        return sintomatologia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }
}
