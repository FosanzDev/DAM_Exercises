package com.fosanzdev.T12;

public class Main {

    public static void main(String[] args) {
        //Ej1 ej1 = new Ej1(args);
        //Ej5 ej5 = new Ej5(args);
        //Ej9 ej9 = new Ej9();
        //PrimeCalculator primeCalculator = new PrimeCalculator();
        FileComparator fileComparator = new FileComparator("C:\\Users\\fosan\\OneDrive\\Escritorio\\archivo1.txt",
                "C:\\Users\\fosan\\OneDrive\\Escritorio\\archivo2.txt");

        System.out.println(fileComparator.compareFiles());
    }
}
