package com.fosanzdev.T7.EjArrayList;

public class EjCola {


    public EjCola() {
        System.out.println("EjCola");
        Cola cola = new Cola(10);

//        for (int i = 0; i < 10; i++) {
//            cola.add(i);
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(cola.next());
//        }
//
//        for (int i = 0; i < 10; i++) {
//            cola.add(i);
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(cola.next());
//        }
//
//        for (int i = 0; i < 20; i++) {
//            cola.add(i);
//        }

        for (int i = 0; i < 20; i++) {
            cola.add(i);
            System.out.println(cola.next());
        }
    }
}
