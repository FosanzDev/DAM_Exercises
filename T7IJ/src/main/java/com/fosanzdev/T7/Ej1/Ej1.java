package com.fosanzdev.T7.Ej1;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Ej1 {
    Faker faker = new Faker(new Locale("es"));

    public Ej1() {
        Coche[] coches = new Coche[10];

        for (int i = 0; i < coches.length; i++) {
            coches[i] = new Coche();
        }


        for (int i = coches.length / 2; i<coches.length; i++){

            String modelo = faker.company().name();
            String color = faker.color().hex();
            boolean metalizado = faker.bool().bool();
            String matricula = String.format("%04d", faker.number().numberBetween(0, 9999));
            Coche.TipoCoche tipo = Coche.TipoCoche.values()[faker.number().numberBetween(0, Coche.TipoCoche.values().length - 1)];
            int anyoFabricacion = faker.number().numberBetween(0, 2023);
            Coche.ModalidadSeguro modalidad = Coche.ModalidadSeguro.values()[faker.number().numberBetween(0, Coche.ModalidadSeguro.values().length - 1)];



            coches[i] = new Coche(modelo, color, metalizado, matricula, tipo, anyoFabricacion, modalidad);
        }

        for(Coche coche : coches){
            System.out.println(coche.toString());
        }

    }
}