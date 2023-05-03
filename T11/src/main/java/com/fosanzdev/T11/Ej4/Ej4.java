package com.fosanzdev.T11.Ej4;

import com.github.javafaker.Faker;

import java.util.ArrayList;

public class Ej4 {

    public Ej4(){

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
        Faker faker = new Faker();
        System.out.println("Array creado");

        for (int i = 0; i < 10; i++){
            if((double)System.currentTimeMillis()%2 == 0){
                electrodomesticos.add(new Lavadora(
                        faker.number().numberBetween(100, 1000),
                        faker.color().name().toUpperCase(),
                        "ABCDEF".charAt(faker.number().numberBetween(0, 5)),
                        faker.number().numberBetween(1, 100),
                        faker.number().numberBetween(1, 100)

                ));

            } else {
                electrodomesticos.add(new Television(
                        faker.number().numberBetween(100, 1000),
                        faker.color().name().toUpperCase(),
                        "ABCDEF".charAt(faker.number().numberBetween(0, 5)),
                        faker.number().numberBetween(1, 100),
                        faker.number().numberBetween(1, 85),
                        faker.bool().bool()
                ));
            }
        }

        double sumTotal = 0;
        double sumLavadoras = 0;
        double sumTelevisores = 0;

        for (Electrodomestico e : electrodomesticos){
            double precioBase = e.getPrecioBase();
            double precioFinal = e.precioFinal();

            if (e instanceof Lavadora){
                sumLavadoras += precioFinal;
            } else if (e instanceof Television){
                sumTelevisores += precioFinal;
            }

            sumTotal += precioFinal;

            System.out.println(e.getClass().getSimpleName());
            System.out.println("--------------------");
            System.out.printf("Precio base: %.2f%n", precioBase);
            System.out.printf("Precio final: %.2f%n", precioFinal);
            System.out.println("--------------------");
            System.out.println("--------------------");
        }

        System.out.println("Total Lavadoras: " + sumLavadoras);
        System.out.println("Total Televisores: " + sumTelevisores);
        System.out.println("Total: " + sumTotal);
    }
}
