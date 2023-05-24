package com.fosanzdev.T10.Ej4;

public class Ej4 {

    public Ej4(){
        Cola<String> cola = new Cola();

        cola.add("Hola");
        cola.add("Mundo");
        cola.add("!");

        System.out.println(cola.remove());
        System.out.println(cola.remove());
        System.out.println(cola.remove());

        System.out.println("¿Está vacía?: " + cola.isEmpty());
        System.out.println("Tamaño: " + cola.size());

        cola.add("Hola2");
        cola.add("Mundo2");
        cola.add("!2");

        System.out.println(cola.peek());
        cola.remove();
        System.out.println(cola.peek());

        System.out.println("¿Está vacía?: " + cola.isEmpty());
        System.out.println("Tamaño: " + cola.size());
    }

}
