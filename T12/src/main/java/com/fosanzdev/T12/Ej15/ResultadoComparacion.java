package com.fosanzdev.T12.Ej15;

import java.io.File;

public class ResultadoComparacion {

    private File file1;
    private ValorComparacion valorComparacion;

    public ResultadoComparacion(File file1, File file2){
        this.file1 = file1;
    }

    public String getNombreArchivo(){
        return file1.getName();
    }

    public ValorComparacion getValorComparacion(){
        return valorComparacion;
    }
}
