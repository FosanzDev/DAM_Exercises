package com.fosanzdev.T12.Ej5;

public class Ej5 {

    public Ej5(String[] args){
        GestionArchivos.listarDirectorio("C:\\Users\\fosan\\OneDrive\\Escritorio\\FP");
        GestionArchivos.verContenidoHexadecimal("C:\\Users\\fosan\\OneDrive\\Escritorio\\logSaver.txt");
        GestionArchivos.verContenido(args[0]);
    }
}
