package com.fosanzdev.T11.Ej5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ej5 {

    public static final List<Item> items = new ArrayList<>(Arrays.asList(
            new Item("Pico", 10, 100, "Herramienta", Apilable.X1),
            new Item("Espada", 20, 100, "Arma", Apilable.X1),
            new Item("Piedra", Apilable.X64),
            new Item("Madera", Apilable.X64),
            new Item("Huevo", Apilable.X16),
            new Item("Perla de Ender", Apilable.X16)
    ));

    public static final String Menu = "1. Añadir item\n"
            + "2. Eliminar item\n"
            + "3. Mostrar inventario\n"
            + "0. Salir\n"
            + "Opción: ";

    public Ej5() {
        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();
        inventario.addItem(items.get(0));
        inventario.addItem(items.get(2));
        inventario.addItem(items.get(2));
        inventario.addItem(items.get(2));
        inventario.addItem(items.get(3));

        int opt = 0;
        while(true){
            System.out.printf(Menu);
            opt = sc.nextInt();
            sc.nextLine();

            switch (opt){
                case 1:
                    while(true){
                        try {
                            System.out.println("Introduce el nombre del item: ");
                            String name = sc.nextLine();
                            System.out.println("Introduce el tipo del item: ");
                            String type = sc.nextLine();
                            System.out.println("Introduce la cantidad del item: ");
                            int amount = sc.nextInt();
                            sc.nextLine();
                            inventario.addItem(new Item(name, amount, 100, type, Apilable.X64));
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                            sc.nextLine();
                            continue;
                        }
                        break;
                    }
                    break;

                case 2:
                    while(true){
                        try {
                            System.out.println("Introduce el nombre del item: ");
                            String name = sc.nextLine();
                            System.out.println("Introduce la cantidad del item: ");
                            int amount = sc.nextInt();
                            sc.nextLine();
                            inventario.removeItem(new Item(name, amount));
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                            continue;
                        }
                        break;
                    }
                    break;

                case 3:
                    System.out.println(inventario);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
            }
        }
    }
}
