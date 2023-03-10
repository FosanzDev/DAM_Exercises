package com.fosanzdev.T9.preExamen;

import com.fosanzdev.T9.Ej5.Alumno;

public class test {

    public class GestorAlumnos implements IGestionAlumnos {
        private Alumno[] alumnos;
        private int numAlumnos;

        public GestorAlumnos(int maxAlumnos) {
            alumnos = new Alumno[maxAlumnos];
            numAlumnos = 0;
        }

        @Override
        public void mostrarTodos() {
            for (int i = 0; i < numAlumnos; i++) {
                System.out.println(alumnos[i]);
            }
        }

        @Override
        public Alumno buscarPorNia(int nia) {
            for (int i = 0; i < numAlumnos; i++) {
                if (alumnos[i].getNia() == nia) {
                    return alumnos[i];
                }
            }
            return null;
        }

        public void insertarAlumno(Alumno alumno) {
            if (numAlumnos < alumnos.length) {
                alumnos[numAlumnos] = alumno;
                numAlumnos++;
            } else {
                System.out.println("No se pueden insertar más alumnos");
            }
        }

        public void eliminarAlumno(int nia) {
            for (int i = 0; i < numAlumnos; i++) {
                if (alumnos[i].getNia() == nia) {
                    alumnos[i] = alumnos[numAlumnos - 1];
                    alumnos[numAlumnos - 1] = null;
                    numAlumnos--;
                }
            }
        }
    }
}
