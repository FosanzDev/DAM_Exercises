package com.fosanzdev.T12.Ej15;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DirectoryComparator {

    private File folder1;
    private File folder2;

    public DirectoryComparator(File folder1, File folder2){
        this.folder1 = folder1;
        this.folder2 = folder2;
    }

    public void setFolders(File folder1, File folder2){
        this.folder1 = folder1;
        this.folder2 = folder2;
    }

    public File getFolder1() {
        return folder1;
    }

    public File getFolder2() {
        return folder2;
    }

    public Iterator<ResultadoComparacion> compare(){
        ArrayList<ResultadoComparacion> resultados = new ArrayList<>();
        File[] files1 = folder1.listFiles();
        File[] files2 = folder2.listFiles();
        if (files1 == null || files2 == null) return resultados.iterator();

        for (File file1 : files1){
            for (File file2 : files2){
                boolean existsInBothDirs = false;
                boolean hasSameSize = false;
                //Compare the name
                if (file1.getName().equals(file2.getName())){
                    existsInBothDirs = true;
                    //Compare the size
                    if (file1.length() == file2.length()){
                    }
                }
            }
        }
        return null;

    }
}
