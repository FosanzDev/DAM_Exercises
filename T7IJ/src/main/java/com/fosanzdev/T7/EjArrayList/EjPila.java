package com.fosanzdev.T7.EjArrayList;

public class EjPila {

    public EjPila() {
        System.out.println("EjPila");

        Pila pila = new Pila(10);

        for (int i = 0; i < 10; i++) {
            pila.add(i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(pila.next());
        }

        for (int i = 0; i < 10; i++) {
            pila.add(i);
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(pila.next());
        }
    }
}
