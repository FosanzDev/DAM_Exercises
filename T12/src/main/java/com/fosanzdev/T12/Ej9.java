package com.fosanzdev.T12;

import java.io.*;

public class Ej9 {

    public Ej9(){
        insertarAlumnos(
                "C:\\Users\\fosan\\OneDrive\\Escritorio\\alumnos.txt",
                "Juan", "Pedro", "Luis", "Maria", "Ana",
                "Jose", "Antonio", "Francisco", "David"
        );
        eliminarAlumno(
                "C:\\Users\\fosan\\OneDrive\\Escritorio\\alumnos.txt",
                "Juan");

    }

    public static void insertarAlumnos(String path, String... alumnos){
        File file = new File(path);
        boolean append;
        try{
            append = !file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (
             FileWriter fileWriter = new FileWriter(file, append);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String alumno : alumnos) {
                bufferedWriter.write(alumno);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean eliminarAlumno(String path, String alumno){
        File file = new File(path);
        try(
                FileReader fileReader = new FileReader(file);
                FileWriter fileWriter = new FileWriter(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ){
            StringBuilder linea = new StringBuilder();
            boolean found = false;
            while(true){
                int value = bufferedReader.read();
                System.out.println(value);
                while (value != '\n' && value != -1){
                    linea.append(bufferedReader.read());
                    value = bufferedReader.read();
                }
                System.out.println(linea);

                //If it is not found or
                if(!found && linea.toString().trim().equalsIgnoreCase(alumno)){
                    System.out.println("Skipping " + alumno);
                    linea = new StringBuilder();
                    found = true;
                }
                // If the line is not the last one, write it and reset the StringBuilder
                if (value != -1){
                    bufferedWriter.write(linea.toString());
                    bufferedWriter.newLine();
                    linea = new StringBuilder();

                // If not (it is the last one), write it and break the loop
                } else {
                    bufferedWriter.write(linea.toString());
                    break;
                }
            }
            // Flush the buffer, close the streams and return true
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
