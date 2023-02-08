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
                    // Searches for the patient, if it is not found, it is created and registered
                    int SIP = JRequest.requestInt("Introduzca el número de SIP: ");
                    Paciente p = centroSalud.buscarPaciente(SIP);
                    if (p == null) {
                        System.out.println("El paciente no se encuentra en el centro de salud");
                        System.out.println("Creando nuevo paciente...");
                        p = registrarPaciente();
                    }
                    if (centroSalud.buscarAtencionMedica(p.getSIP()) != null) {
                        System.out.println("El paciente ya ha sido registrado");
                        break;
                    }
                    //Printing patient's data and asking for symptoms
                    System.out.println(p);
                    String sintomatologia = JRequest.requestString("Introduzca la sintomatología del paciente: ");

                    // Registering the medical attention
                    centroSalud.registroAtencionMedica(p, sintomatologia);
                }

                case 2 -> {
                    //Searches for the patient, if it is not found, it is created and registered
                    int SIP = JRequest.requestInt("Introduzca el número de SIP: ");
                    AtencionMedica atencionMedica = centroSalud.buscarAtencionMedica(SIP);
                    // If the patient is not found, ask if the user wants to register a new one
                    if (atencionMedica == null) {
                        System.out.println("No se ha encontrado el registro");
                        if (JRequest.readOption("¿Crear nuevo registro? (y/n): ")) {
                            Paciente paciente = centroSalud.buscarPaciente(SIP);
                            if (paciente == null) {
                                System.out.println("El paciente no se encuentra en el centro de salud");
                                System.out.println("Creando nuevo paciente...");
                                paciente = registrarPaciente();
                                System.out.println("Paciente registrado con éxito");
                            }
                            String sintomatologia = JRequest.requestString("Introduzca la sintomatología del paciente: ");
                            int idx = centroSalud.registroAtencionMedica(paciente, sintomatologia);
                            atencionMedica = centroSalud.getAntencionMedica(idx);
                            // If the user doesn't want to register a new patient, break the loop
                        } else {
                            System.out.println("Abandonando atencion al paciente...");
                            break;
                        }
                    }

                    // Once the patient is found, ask for the vital signs
                    double[] constantes = new double[4];
                    constantes[0] = JRequest.requestDouble("Introduzca la temperatura del paciente: ");
                    constantes[1] = JRequest.requestDouble("Introduzca la frecuencia cardiaca del paciente: ");
                    constantes[2] = JRequest.requestDouble("Introduzca la tensión sistólica del paciente: ");
                    constantes[3] = JRequest.requestDouble("Introduzca la tensión diastólica del paciente: ");
                    atencionMedica.setConstantes(constantes);
                }

                case 3 -> {
                    runConsultas();
                }

                case 4 -> {
                    int SIP = JRequest.requestInt("Introduzca el número de SIP: ");
                    AtencionMedica atencionMedica = centroSalud.buscarAtencionMedica(SIP);
                    if (atencionMedica == null) {
                        System.out.println("No se ha encontrado el paciente");
                        break;
                    } else if (atencionMedica.getConstantes() == null) {
                        System.out.println("El paciente no ha sido atendido");
                        System.out.println("No se puede dar de alta");
                        break;
                    }

                    String motivo = JRequest.requestString("Introduzca el motivo de alta: ");
                    centroSalud.darAlta(atencionMedica, motivo);

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
                    Paciente p = centroSalud.buscarPaciente(SIP);
                    if (p == null) {
                        System.out.println("No se ha encontrado el paciente");
                        break;
                    }
                    AtencionMedica[] atencionMedica = centroSalud.buscarHistorico(p.getSIP());
                    for (AtencionMedica a : atencionMedica)
                        if (a != null)
                            System.out.println(a);
                        else break;
                }

                case 2 -> {
                    String fecha = JDate.readDate("Introduzca la fecha (dd/mm/aaaa): ");
                    Paciente[] pacientes = centroSalud.buscarPorFecha(fecha);
                }

                case 3 -> {
                    centroSalud.estadisticas();
                }

                case 4 -> {
                    for (AtencionMedica p : centroSalud.historicoMensual())
                        System.out.println(p);
                }
            }

        } while (true);
    }

    public Paciente registrarPaciente() {
        int SIP = faker.number().numberBetween(10000000, 99999999);
        String nombre = JRequest.requestString("Introduzca el nombre del paciente: ");
        char sexo = Character.toUpperCase(JRequest.requestString("Introduzca el sexo del paciente (M/F): ").charAt(0));
        int edad = JRequest.requestInt("Introduzca la edad del paciente: ");
        Paciente p = new Paciente(SIP, nombre, sexo, edad);
        centroSalud.registroPaciente(p);
        return p;
    }
}
