package com.fosanzdev.T7.Ej7;

import com.fosanzdev.jresources.JDate;
import com.fosanzdev.jresources.JDeploy;
import com.fosanzdev.jresources.JRequest;
import com.github.javafaker.Faker;

public class Ej7 {

    private final CentroSalud centroSalud = new CentroSalud();

    private final Faker faker = new Faker();


    public Ej7() {

        do {
            JDeploy.deployMenu("URGENCIAS", "0. Salir", ". ", "Nuevo paciente", "Atender paciente", "Consultas", "Alta médica");
            int opt = JRequest.requestInt("Introduzca una opción: ");

            switch (opt) {
                case 0 -> {
                    System.out.println("Saliendo...");
                    System.exit(0);
                }

                case 1 -> {
                    int SIP = JRequest.requestInt("Introduzca el número de SIP: ");
                    String nombre = JRequest.requestString("Introduzca el nombre del paciente: ");
                    char sexo = JRequest.requestString("Introduzca el sexo del paciente: ").charAt(0);
                    int edad = JRequest.requestInt("Introduzca la edad del paciente: ");
                    String sintomatologia = JRequest.requestString("Introduzca la sintomatología del paciente: ");
                    String observaciones = JRequest.requestString("Introduzca las observaciones del paciente: ");
                    centroSalud.registroPaciente(SIP, nombre, sexo, edad, sintomatologia, observaciones);
                }

                case 2 -> {
                    int SIP = JRequest.requestInt("Introduzca el número de SIP: ");
                    Paciente paciente = centroSalud.buscarPaciente(SIP);
                    if (paciente == null) {
                        System.out.println("No se ha encontrado el paciente");
                        break;
                    }
                    double[] constantes = new double[4];
                    constantes[0] = JRequest.requestDouble("Introduzca la temperatura del paciente: ");
                    constantes[1] = JRequest.requestDouble("Introduzca la frecuencia cardiaca del paciente: ");
                    constantes[2] = JRequest.requestDouble("Introduzca la tensión sistólica del paciente: ");
                    constantes[3] = JRequest.requestDouble("Introduzca la tensión diastólica del paciente: ");
                    centroSalud.nuevoIngreso(SIP, constantes);
                }

                case 3 -> {
                    runConsultas();
                }

                case 4 -> {
                    int SIP = JRequest.requestInt("Introduzca el número de SIP: ");
                    Paciente paciente = centroSalud.buscarPaciente(SIP);
                    if (paciente == null) {
                        System.out.println("No se ha encontrado el paciente");
                        break;
                    }

                }
            }

        } while (true);
    }

    private void runConsultas() {
        do {
            JDeploy.deployMenu("CONSULTAS", "0. Volver", ". ", "Por SIP", "Por fechas", "Estadisticas", "Mostrar histórico mensual");
            int opt = JRequest.requestInt("Introduzca una opción: ");

            switch (opt) {
                case 0 -> {
                    System.out.println("Volviendo al menu principal...");
                    return;
                }

                case 1 -> {
                    int SIP = JRequest.requestInt("Introduzca el número de SIP: ");
                    centroSalud.buscarPaciente(SIP);
                }

                case 2 -> {
                    String fecha = JDate.readDate("Introduzca la fecha de inicio (dd/mm/aaaa): ");
                    Ingreso[] ingresos = centroSalud.buscarPorFecha(fecha);
                }

                case 3 -> {
                    int SIP = JRequest.requestInt("Introduzca el número de SIP: ");
                    Paciente paciente = centroSalud.buscarPaciente(SIP);
                    if (paciente == null) {
                        System.out.println("No se ha encontrado el paciente");
                        break;
                    }
                    String motivo = JRequest.requestString("Introduzca el motivo de alta: ");
                    centroSalud.darAlta(SIP, motivo);
                }
            }

        } while (true);
    }

}
