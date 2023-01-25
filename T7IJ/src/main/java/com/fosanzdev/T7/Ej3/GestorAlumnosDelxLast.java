package com.fosanzdev.T7.Ej3;

import com.fosanzdev.T7.libs.Utils;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class GestorAlumnosDelxLast {
    private int count = 0;
    private final int numAlumnos;
    private Alumno[] alumnos;


    public GestorAlumnosDelxLast(int numAlumnos) {
        this.numAlumnos = numAlumnos;
        this.alumnos = new Alumno[numAlumnos];
    }


    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void nuevoAlumno(int nia, String nombre, String apellidos, String fechaNacimiento, Grupo grupo, String telefono) {
        alumnos[count] = new Alumno(nia, nombre, apellidos, fechaNacimiento, grupo, telefono);

        count++;
    }

    /**
     * Da de baja al alumno con el NIA proporcionado.
     *
     * @param nia NIA del alumno a dar de baja.
     */
    public void bajaAlumno(int nia) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNia() == nia) {
                alumnos[i] = alumnos[count - 1];
                count--;
                return;
            }
        }
        System.out.println("No se ha encontrado el alumno");
    }


    /**
     * Da de baja un alumno. Si no se proporciona NIA, se pedirá al usuario.
     */
    public void bajaAlumno() {
        int nia = Utils.readInt("Introduzca el NIA del alumno a dar de baja: ");
        bajaAlumno(nia);
        System.out.println("No se ha encontrado el alumno");
    }

    /**
     * Imprime los alumnos
     */
    public void printAlumnos() {
        for (Alumno alumno : alumnos) {
            if (alumno != null) {
                System.out.println(alumno.toString());
            }
        }
    }

    /**
     * Returns an array of Alumno objects that match the given group
     *
     * @param grupo String with the group to search
     */
    public Alumno[] findByGroup(String grupo) {
        ArrayList<Alumno> alumnosGrupo = new ArrayList<>();

        for (Alumno alumno : alumnos) {

            if (alumno != null && alumno.getGrupo().equals(grupo)) {
                alumnosGrupo.add(alumno);
            }
        }

        return alumnosGrupo.toArray(new Alumno[0]);
    }

    /**
     * Returns an array of Alumno objects that match the given age
     * Age dates are compared with the current date
     *
     * @param age int with the age to search
     */
    public Alumno[] findByAge(int age) {
        ArrayList<Alumno> alumnosEdad = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now();


        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] == null) continue;
            if (alumnos[i].getAge() == age) {
                alumnosEdad.add(alumnos[i]);
            }
        }

        return alumnosEdad.toArray(new Alumno[0]);

    }

    /**
     * Returns an Alumno object taht matches with the given NIA
     *
     * @param nia int with the NIA to search
     * @return Alumno object if found, null if not
     */
    public Alumno findByNia(int nia) {
        for (Alumno alumno : alumnos) {
            if (alumno != null && alumno.getNia() == nia) {
                return alumno;
            }
        }
        return null;
    }

    public Alumno[] findBySurname(String apellido) {
        ArrayList<Alumno> alumnosApellido = new ArrayList<>();

        for (Alumno alumno : alumnos) {
            if (alumno != null && alumno.getApellidos().equals(apellido)) {
                alumnosApellido.add(alumno);
            }
        }

        return alumnosApellido.toArray(new Alumno[0]);
    }

}
