package com.fosanzdev.T7.Ej7;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;

public class CentroSalud {

    private Calendar cal = Calendar.getInstance();
    private SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    private ArrayList<Paciente> pacientes = new ArrayList<>();
    private ArrayList<Ingreso> ingresos = new ArrayList<>();
    private int numPacientes = 0;
    private int numIngresos = 0;


    // --------------------------------------------
    // PATIENT MANAGEMENT
    // --------------------------------------------
    public void registroPaciente(int SIP, String nombre, char sexo, int edad, String sintomatologia, String observaciones) {
        pacientes.add(new Paciente(SIP, nombre, sexo, edad,
                sintomatologia, observaciones,
                hourFormat.format((cal.getTime())), dateFormat.format((cal.getTime()))));
        numPacientes++;
    }

    public Paciente buscarPaciente(int SIP) {
        for (Paciente paciente : pacientes) {
            if (paciente.getSIP() == SIP) {
                return paciente;
            }
        }
        return null;
    }


    //--------------------------------------------
    // ADMISSION MANAGEMENT
    //--------------------------------------------

    public void nuevoIngreso(int SIP, double[] constantes) {
        for (Paciente paciente : pacientes) {
            if (paciente.getSIP() == SIP) {
                ingresos.add(new Ingreso(paciente, constantes));
                numIngresos++;
            }
        }
    }

    public Ingreso[] buscarPorFecha(String fecha) {
        //TODO
        return new Ingreso[0];
    }

    public void darAlta(int SIP, String motivo) {
        //TODO
    }
}