package com.fosanzdev.T7.Ej7;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;

public class CentroSalud {

    private int MAX_PACIENTES = 40;

    private Calendar cal = Calendar.getInstance();
    private SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat dayFormat = new SimpleDateFormat("dd");

    private Paciente[] pacientes = new Paciente[100];
    private AtencionMedica[] atencionesMedicas = new AtencionMedica[MAX_PACIENTES];
    private AtencionMedica[][] historico = new AtencionMedica[31][MAX_PACIENTES];

    //Setting the indexes
    private int indexPatient = 0;
    private int indexMedicalAttention = 0;

    private int indexHistoric = 0;
    private int dayIndex = Integer.parseInt(dayFormat.format(cal.getTime())) - 1;


    // --------------------------------------------
    // PATIENT REGISTRATION
    // --------------------------------------------

    public void registroPaciente(Paciente p) {
        pacientes[indexPatient] = p;
        indexPatient++;
    }

    /**
     * Sets the given patient as admitted
     *
     * @param paciente       Patient to be admitted
     * @param sintomatologia Patient's symptoms
     */
    public int registroAtencionMedica(Paciente paciente, String sintomatologia) {
        atencionesMedicas[indexMedicalAttention] = (new AtencionMedica(paciente, sintomatologia, hourFormat.format((cal.getTime())), dateFormat.format((cal.getTime()))));
        indexMedicalAttention++;
        return indexMedicalAttention - 1;
    }

    /**
     * Registers a new patient's admission
     *
     * @param constantes Patient's vital signs
     */
    public void atencionMedia(AtencionMedica atencionMedica, double[] constantes) {
        atencionMedica.setConstantes(constantes);
    }


    // --------------------------------------------
    // PATIENT SEARCH
    // --------------------------------------------

    /**
     * Returns the patient with the given SIP
     * Returns null if the patient is not found
     *
     * @param SIP Patient's SIP
     * @return Paciente
     */
    public Paciente buscarPaciente(int SIP) {
        System.out.println("Paciente buscado: " + SIP);
        for (Paciente paciente : pacientes) {
            if (paciente == null) {
                return null;
            } else if (paciente.getSIP() == SIP) {
                return paciente;
            }
        }
        return null;
    }

    /**
     * Returns the medical attention with the given SIP
     *
     * @param SIP Patient's SIP
     * @return AtencionMedica
     */
    public AtencionMedica buscarAtencionMedica(int SIP) {
        for (AtencionMedica atencionMedica : atencionesMedicas) {
            if (atencionMedica == null) {
                return null;
            } else if (atencionMedica.getPaciente().getSIP() == SIP) {
                return atencionMedica;
            }
        }
        return null;
    }

    public AtencionMedica getAntencionMedica(int index) {
        return atencionesMedicas[index];
    }

    public AtencionMedica[] buscarHistorico(int SIP) {
        AtencionMedica[] atencionMedicas = new AtencionMedica[50];
        int idx = 0;

        for (AtencionMedica[] atencionMedica : historico) {
            for (AtencionMedica atencionMedica1 : atencionMedica) {
                if (atencionMedica1 == null) {
                    return atencionMedicas;
                } else if (atencionMedica1.getPaciente().getSIP() == SIP) {
                    atencionMedicas[idx] = atencionMedica1;
                    idx++;
                }
            }
        }
        return atencionMedicas;
    }

    // --------------------------------------------
    // PATIENT DISCHARGE
    // --------------------------------------------

    /**
     * Registers the patient's discharge and the reason
     *
     * @param atencionMedica Patient's medical attention
     * @param motivo         Reason for discharge
     */
    public void darAlta(AtencionMedica atencionMedica, String motivo) {
        atencionMedica.setFechaAlta(dateFormat.format((cal.getTime())));
        atencionMedica.setHoraAlta(hourFormat.format((cal.getTime())));
        atencionMedica.setMotivoAlta(motivo);

        historico[dayIndex][indexHistoric] = atencionMedica;
        indexHistoric++;
    }

    // --------------------------------------------
    // STATISTICS AND QUERIES
    // --------------------------------------------

    /**
     * Returns an array with calculated statistics
     *
     * @return double array with the following values:
     * 0. Average temperature
     * 1. Average heart rate
     * 2. Average systolic blood pressure
     * 3. Average diastolic blood pressure
     * 4. Average age
     * 5. Percentage of men
     * 6. Percentage of woman
     */
    public double[] estadisticas() {
        //TODO
        return new double[0];
    }

    /**
     * Returns an array with all the patients of the month
     *
     * @return Paciente array
     */
    public AtencionMedica[] historicoMensual() {
        AtencionMedica[] historicoMensual = new AtencionMedica[MAX_PACIENTES * 31];

        for (int i = 0; i < historico.length; i++) {
            for (int j = 0; j < historico[i].length; j++) {
                historicoMensual[i * MAX_PACIENTES + j] = historico[i][j];
            }
        }
        return historicoMensual;
    }

    /**
     * Returns an array with all the patients between the given dates
     *
     * @param fechaInicio Starting date in format dd/MM/yyyy
     * @param fechaFin    End date in format dd/MM/yyyy
     * @return Paciente array
     */
    public Paciente[] buscarPorFecha(String fechaInicio, String fechaFin) {
        //TODO
        return new Paciente[0];
    }

    /**
     * Returns an array with all the patients from the given date to the current date
     *
     * @param fecha Starting date in format dd/MM/yyyy
     * @return Paciente array
     */
    public Paciente[] buscarPorFecha(String fecha) {
        //TODO
        return new Paciente[0];
    }
}