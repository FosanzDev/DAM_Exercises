package com.fosanzdev.T9.Ej5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej5 {

    // Se crea el lector de datos y el array de alumnos
    public static final Scanner lector = new Scanner(System.in);
    private Alumno[] alumnos = new Alumno[2];

    public Ej5() {

        // Se piden los datos de los dos alumnos
        for (int i = 0; i < alumnos.length; i++) {
            // Se declaran las variables
            String nombre;
            int edad;
            int altura;

            // Se piden los datos del alumno
            System.out.println("Introduce el nombre del alumno");
            nombre = lector.nextLine();
            edad = leerInt("Introduce la edad del alumno");
            altura = leerInt("Introduce la altura del alumno");

            // Se crea el objeto alumno y se guarda en el array
            alumnos[i] = new Alumno(nombre, edad, altura);
        }

        // Se busca el alumno con mayor edad
        Alumno mayor = alumnos[0];

        // Se recorre el array de alumnos
        for (Alumno alumno : alumnos) {
            // Si la edad del alumno es mayor que la del alumno con mayor edad, se guarda
            if (alumno.getEdad() > mayor.getEdad()) {
                mayor = alumno;
            }

            // Se muestran los datos del alumno
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Edad: " + alumno.getEdad());
            System.out.println("Altura: " + alumno.getAltura());
            System.out.println("--------------------");
        }

        // Se muestra el alumno con mayor edad
        System.out.println("El alumno con mayor edad es: " + mayor.getNombre());
    }

    /**
     * Lee un número entero introducido por el usuario
     * @param msg Mensaje que se muestra al usuario
     * @return Número entero introducido por el usuario
     */
    public int leerInt(String msg) {
        // Se repite hasta que el usuario introduzca un número entero
        while (true) {
            try {
                System.out.println(msg);
                return lector.nextInt();
            // Si el usuario introduce un valor que no es un número, se informa al usuario
            // El programa no se detiene y se vuelve a pedir el número
            } catch (InputMismatchException e) {
                System.out.println("El valor introducido no es un número");
            } finally {
                // Se vacía el buffer del lector
                lector.nextLine();
            }
        }
    }
}
