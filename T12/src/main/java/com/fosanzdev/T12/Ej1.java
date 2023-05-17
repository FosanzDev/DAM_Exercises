package com.fosanzdev.T12;

import java.io.File;

public class Ej1 {

    public Ej1(String[] args) {
        if (args.length != 1){
            System.err.println("ERROR: Ruta no indicada");
            System.exit(1);
        }

        File f = new File(args[0]);

        if (f.exists()){
            System.out.print("El archivo existe y ");

            if (f.isFile()){
                System.out.println("es un archivo");
            } else if (f.isDirectory()){
                System.out.println("es una carpeta");
            }
        } else{
            System.out.println("El archivo no existe");
        }
        
    }
}
