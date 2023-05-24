package com.fosanzdev.T10.Ej8;
import com.fosanzdev.jresources.JMenuGenerator;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ej8 {

    public MyDict dict;

    public Ej8() {
        dict = new MyDict();
        Scanner lector = new Scanner(System.in);
        JMenuGenerator menu = new JMenuGenerator(". ", true, true, true);
        GameManager gameManager = new GameManager(dict, lector);
        dict.addWord("Hola", "Saludo en español");
        dict.addWord("Adiós", "Despedida en español");
        dict.addWord("Perro", "Animal doméstico que ladra");
        dict.addWord("Gato", "Animal doméstico que maúlla");

        String menuString = menu.generateMenu("JUEGO DICCIONARIO",
                "Añadir palabra", "Modificar palabra", "Eliminar palabra",
                "Consultar palabra", "Mostrar diccionario", "Jugar", "Mejores  puntuaciones", "Salir");

        while (true){
            System.out.println(menuString);
            int opt = lector.nextInt();
            lector.nextLine();

            switch (opt) {
                case 1:
                    System.out.println("Introduce la palabra");
                    String word = lector.nextLine();
                    System.out.println("Introduce la descripción");
                    String description = lector.next();
                    try {
                        dict.addWord(word, description);
                    } catch (KeyAlreadyExistsException e) {
                        System.out.println("La palabra ya existe y no se ha añadido");
                    }
                    break;

                case 2:
                    System.out.println("Introduce la palabra");
                    word = lector.nextLine();
                    System.out.println("Introduce la nueva descripción");
                    description = lector.nextLine();
                    try {
                        dict.modifyWord(word, description);
                    } catch (NoSuchElementException e) {
                        System.out.println("La palabra no existe y no se ha modificado");
                    }
                    break;

                case 3:
                    System.out.println("Introduce la palabra");
                    word = lector.nextLine();
                    try {
                        dict.deleteWord(word);
                    } catch (NoSuchElementException e) {
                        System.out.println("La palabra no existe y no se ha eliminado");
                    }
                    break;

                case 4:
                    System.out.println("Introduce la palabra");
                    word = lector.nextLine();
                    try {
                        System.out.println(dict.getDescription(word));
                    } catch (NoSuchElementException e) {
                        System.out.println("La palabra no existe");
                    }
                    break;

                case 5:
                    System.out.println(dict);
                    break;

                case 6:
                    gameManager.startGame();
                    break;

                case 7:
                    System.out.println(gameManager.getBestScores());
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    System.exit(0);

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
