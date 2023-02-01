package com.fosanzdev.T7.Ej7;

public class Ingreso {
    private final Paciente paciente;
    private final double[] constantes;
    private String fechaAlta;
    private String horaAlta;
    private String motivoAlta;


    public Ingreso(Paciente paciente, double[] constantes) {
        this.paciente = paciente;
        this.constantes = constantes;
    }


}
