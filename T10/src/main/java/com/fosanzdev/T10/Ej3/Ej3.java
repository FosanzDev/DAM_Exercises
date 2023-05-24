package com.fosanzdev.T10.Ej3;

public class Ej3 {

    public Ej3(){

        //Creamos una pila de Strings
        Pila<String> pila = new Pila<>();

        //Añadimos elementos a la pila
        pila.push("Hola");
        pila.push("Mundo");
        pila.push("!");

        //Mostramos y eliminamos algunos elementos
        System.out.println(pila.top());
        pila.pop();
        System.out.println(pila.pop());

        //Mostramos el tamaño de la pila y si está vacía
        System.out.println("Tamaño: " + pila.size());
        System.out.println("¿Está vacía? " + pila.isEmpty());

        //Vaciamos la pila
        System.out.println("Vaciamos la pila");
        while (!pila.isEmpty()){
            pila.pop();
        }

        //Finalmente mostramos si está vacía
        System.out.println("¿Está vacía? " + pila.isEmpty());

    }
}
