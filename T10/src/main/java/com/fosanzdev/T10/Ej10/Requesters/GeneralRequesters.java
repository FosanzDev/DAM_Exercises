package com.fosanzdev.T10.Ej10.Requesters;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GeneralRequesters {

    private static final Scanner lector = new Scanner(System.in);

    /**
     * Requests a DNI and validates it
     * @param msg Message to show to the user
     * @return String with the DNI
     */
    public static String requestDNI(String msg) {
        String DNI;

        do {
            System.out.println(msg);
            DNI = lector.nextLine();
            if (DNI.matches("[0-9]{8}[A-Z]")) {
                if (DNIValidator(DNI)) {
                    return DNI;
                } else {
                    System.out.println("DNI no válido");
                }
            } else {
                System.out.println("DNI no válido");
            }
        } while (true);
    }

    /**
     * Validates a DNI
     * @param DNI DNI to validate
     * @return true if the DNI is valid, false otherwise
     */
    public static boolean DNIValidator(String DNI){
        char[] dniOrderedLetters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        String dniNumber = DNI.substring(0, 8);
        char dniLetter = DNI.charAt(8);
        int dniNumberInt = Integer.parseInt(dniNumber);
        return dniOrderedLetters[dniNumberInt % 23] == dniLetter;
    }

    /**
     * Requests the user a valid name with Alphabetic characters only.
     * @param msg message to show to the user
     * @return the name as a String
     */
    public static String requestValidName(String msg){
        String str;
        do {
            System.out.println(msg);
            str = lector.nextLine();
            if (str.matches("[[A-Za-z]+ ]*")) {
                return str;
            } else {
                System.out.println("Cadena no válida");
            }
        } while (true);
    }

    /**
     * Requests the user a birthdate and checks if it's valid.
     *
     * @param msg message to show to the user
     * @param ageLimit minimum age to be valid. 0 for no limit
     * @return the birthdate as a LocalDate object
     */
    public static LocalDate requestBirthDate(String msg, int ageLimit){
        LocalDate birthDate;
        do {
            System.out.println(msg);
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                birthDate = LocalDate.parse(lector.nextLine(), formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Fecha no válida");
                continue;
            }

            if (birthDate.isBefore(LocalDate.now())) {
                return birthDate;
            } else if (birthDate.isBefore(LocalDate.now().minusYears(ageLimit))){
                System.out.println("El empleado debe ser mayor de 16 años");
            } else {
                System.out.println("Fecha no válida");
            }
        } while (true);
    }

    /**
     * Requests the user a double and checks if it's valid.
     *
     * @param msg message to show to the user
     * @return the double
     */
    public static double requestDouble(String msg){
        double num;
        do {
            System.out.println(msg);
            try {
                num = lector.nextDouble();
                lector.nextLine();
            } catch (InputMismatchException e){
                System.out.println("Número no válido");
                lector.nextLine();
                continue;
            }
            return num;
        } while (true);
    }

    /**
     * Requests the user an integer and checks if it's valid.
     * @param msg message to show to the user
     * @return the integer
     */
    public static int requestInteger(String msg){
        int num;
        do {
            System.out.println(msg);
            try {
                num = lector.nextInt();
                lector.nextLine();
            } catch (InputMismatchException e){
                System.out.println("Número no válido");
                lector.nextLine();
                continue;
            }
            return num;
        } while (true);
    }
}
