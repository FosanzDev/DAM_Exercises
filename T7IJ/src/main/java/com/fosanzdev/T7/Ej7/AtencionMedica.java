package com.fosanzdev.T7.Ej7;

public class AtencionMedica {
    private final Paciente paciente;
    private final String sintomatologia;
    private final String horaIngreso;
    private final String fechaIngreso;
    private double[] constantes;
    private String fechaAlta;
    private String horaAlta;
    private String motivoAlta;

    public AtencionMedica(Paciente paciente, String sintomatologia, String horaIngreso, String fechaIngreso) {
        this.paciente = paciente;
        this.sintomatologia = sintomatologia;
        this.horaIngreso = horaIngreso;
        this.fechaIngreso = fechaIngreso;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getSintomatologia() {
        return sintomatologia;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public double[] getConstantes() {
        return constantes;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public String getHoraAlta() {
        return horaAlta;
    }

    public String getMotivoAlta() {
        return motivoAlta;
    }

    public void setConstantes(double[] constantes) {
        this.constantes = constantes;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setHoraAlta(String horaAlta) {
        this.horaAlta = horaAlta;
    }

    public void setMotivoAlta(String motivoAlta) {
        this.motivoAlta = motivoAlta;
    }
}
