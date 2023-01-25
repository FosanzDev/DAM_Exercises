package com.fosanzdev.T7.Ej3;

import com.fosanzdev.T7.Config;
import com.fosanzdev.T7.libs.Utils;
import com.github.javafaker.Faker;
import com.fosanzgames.damresources.DAMUtils;

import java.text.SimpleDateFormat;

public class Ej3 {

    private static final GestorAlumnos gestorAlumnos = new GestorAlumnos(50);

    public Ej3() {

        Faker faker = new Faker();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        if (Config.DEBUG) {
            //Fill the array with 25 random students
            for (int i = 0; i < 25; i++) {
                gestorAlumnos.nuevoAlumno(
                        (int) faker.number().randomNumber(8, true),
                        faker.name().firstName(),
                        faker.name().lastName(),
                        sdf.format(faker.date().birthday(10, 25)),
                        gestorAlumnos.grupos[faker.number().numberBetween(1, 4)],
                        faker.number().digits(9));
            }
        }

        mainMenu();

    }

    public static void mainMenu() {

        gestorAlumnos.printAlumnos();

        do {
            Utils.deployMenu(
                    "GESTION ALUMNOS", "0. Salir", ". ",
                    "Nuevo alumno",
                    "Baja de alumno",
                    "Consultas");

            int option = Utils.readInt("Elija una opcion: ");

            switch (option) {
                case 0:
                    System.out.println("Hasta luego!");
                    return;

                case 1:
                    int nia = Utils.readLimitedInt("Introduzca el NIA del alumno: ", 8);
                    String nombre = Utils.readString("Introduzca el nombre del alumno: ");
                    String apellidos = Utils.readString("Introduzca los apellidos del alumno: ");
                    String fechaNacimiento = Utils.readDate("Introduzca la fecha de nacimiento del alumno (dd/mm/yyyy): ");
                    String gr = Utils.readString("Introduzca el grupo del alumno: ");
                    Grupo grupo = null;
                    for (Grupo g : gestorAlumnos.grupos) {
                        if (g.getNombre().equals(gr)) {
                            grupo = g;
                            break;
                        } else {
                            System.out.println("Grupo incorrecto");
                        }
                    }
                    int telefono = Utils.readLimitedInt("Introduzca el telefono del alumno: ", 9);

                    gestorAlumnos.nuevoAlumno(nia, nombre, apellidos, fechaNacimiento, grupo, String.valueOf(telefono));
                    break;

                case 2:
                    gestorAlumnos.printAlumnos();
                    gestorAlumnos.bajaAlumno();
                    break;

                case 3:
                    submenuConsultas(gestorAlumnos);
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        } while (true);
    }


    public static void submenuConsultas(GestorAlumnos gestorAlumnos) {

        do {
            Alumno[] resultado = new Alumno[gestorAlumnos.getNumAlumnos()];
            Utils.deployMenu("CONSULTAS", "0. Volver al menu principal", ". ",
                    "Por grupo",
                    "Por edad",
                    "Por nia",
                    "Por apellidos");

            int option = Utils.readInt("Elija una opcion: ");

            switch (option) {
                case 0:
                    System.out.println("Volviendo al menu principal...");
                    return;

                case 1:
                    String grupo = Utils.readString("Introduzca el grupo: ");
                    resultado = gestorAlumnos.findByGroup(grupo);
                    break;

                case 2:
                    int edad = Utils.readInt("Introduzca la edad: ");
                    resultado = gestorAlumnos.findByAge(edad);
                    break;

                case 3:
                    int nia = Utils.readInt("Introduzca el NIA: ");
                    System.out.println(gestorAlumnos.findByNia(nia));
                    break;

                case 4:
                    String apellidos = Utils.readString("Introduzca los apellidos: ");
                    resultado = gestorAlumnos.findBySurname(apellidos);
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;

            }

            System.out.println("Resultado de la consulta:");
            for (Alumno alumno : resultado) {
                if (alumno != null) {
                    System.out.println(alumno);
                }
            }

        } while (true);
    }

}
