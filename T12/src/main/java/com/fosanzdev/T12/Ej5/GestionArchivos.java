package com.fosanzdev.T12.Ej5;

import java.io.*;
import java.util.Objects;

public class GestionArchivos {

    /**
     * Crea un archivo en la ruta especificada
     * @param directorio Ruta donde se creará el directorio
     * @param archivo Nombre del archivo
     * @return true si se ha creado correctamente, false si no
     */
    public static boolean crearArchivo(String directorio, String archivo){
        File f = new File(directorio, archivo);
        if (f.exists()){
            return false;
        } else {
            try {
                return f.createNewFile();
            } catch (IOException ioe){
                return false;
            }
        }
    }

    /**
     * Muestra el contenido de una carpeta asi como las
     * propiedades de los archivos que contiene
     * @param directorio Ruta del directorio
     */
    public static void listarDirectorio(String directorio){
        File f = new File(directorio);
        if (!f.exists()){
            System.out.println("El directorio no existe");
            return;
        }
        System.out.println("Nombre\tTipo\tTamaño\tPermisos\n");

        for (File file : Objects.requireNonNull(f.listFiles())) {
            verInfo(directorio, file.getName());
        }
    }

    /**
     * Muestra las propiedades de un archivo
     * @param directorio Ruta del directorio
     * @param archivo Nombre del archivo
     */
    public static void verInfo(String directorio, String archivo){
        File f = new File(directorio, archivo);
        if (!f.exists()){
            System.out.println("Ruta incorrecta // El archivo no existe");
            return;
        }
        StringBuilder sb = new StringBuilder();
        //Nombre
        sb.append(f.getName()).append("\t");

        //Tipo
        if (f.isFile()){
            sb.append("f\t");
        } else if (f.isDirectory()){
            sb.append("d\t");
        }

        //Tamaño
        sb.append(f.length()).append(" bytes\t");
        //Permisos
        sb.append(f.canRead() ? "r" : "-");
        sb.append(f.canWrite() ? "w" : "-");

        //Salto de linea
        sb.append("\n");

        System.out.println(sb);
    }

    /**
     * Muestra el contenido de un archivo
     * @param path Ruta del archivo
     * @returns true si se ha mostrado correctamente, false si no
     */
    public static boolean verContenido(String path){
        File f = new File(path);
        StringBuilder sb = new StringBuilder();
        try (FileReader fr = new FileReader(f)) {
            int i;
            while ((i = fr.read()) != -1){
                sb.append((char) i);
            }
            System.out.println(sb);
            return true;
        } catch (IOException e) {
            System.out.println("Fichero no encontrado");
            return false;
        }
    }

    /**
     * Añade un método a la clase anterior que permita ver el contenido de un archivo binario en
     * hexadecimal agrupados en bytes (de dos en dos).
     * @param path Ruta del archivo
     * @return true si se ha mostrado correctamente, false si no
     */
    public static boolean verContenidoHexadecimal(String path){
        File f = new File(path);
        StringBuilder sb = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(f)) {
            int i;
            int cont = 0;
            while ((i = fis.read()) != -1){
                sb.append(String.format("%2X ", i));
                cont++;
                if (cont % 2 == 0){
                    sb.append(" ");
                }
                if (cont % 12 == 0){
                    sb.append("\n");
                }
            }
            System.out.println(sb);
            return true;
        } catch (IOException e) {
            System.out.println("Fichero no encontrado");
            return false;
        }
    }
}
