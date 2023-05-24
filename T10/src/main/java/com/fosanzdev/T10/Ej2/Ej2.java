package com.fosanzdev.T10.Ej2;

public class Ej2 {

    public Ej2(){
        //Create a list of 10 random numbers between 0 and 100
        ArrayListEstadisticas lista = new ArrayListEstadisticas();

        for (int i = 0; i < 10; i++) {
            lista.add(Math.random() * 100);
        }


        //Print the list and the statistics
        System.out.println("Lista: " + lista);
        System.out.printf("Mínimo: %.3f\n", lista.minimo());
        System.out.printf("Máximo: %.3f\n", lista.maximo());
        System.out.printf("Sumatorio: %.3f\n", lista.sumatorio());
        System.out.printf("Media: %.3f\n", lista.media());
        System.out.printf("Moda: %.3f\n", lista.moda());
        
    }
}
