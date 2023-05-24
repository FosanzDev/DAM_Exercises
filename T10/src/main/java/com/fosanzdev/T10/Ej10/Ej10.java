package com.fosanzdev.T10.Ej10;

import com.fosanzdev.T10.Ej10.Classes.Empleado;
import com.fosanzdev.T10.Ej10.Classes.Hijo;
import com.fosanzdev.T10.Ej10.Exceptions.AlreadyExistsException;
import com.fosanzdev.T10.Ej10.Exceptions.NoSuchElementException;
import com.fosanzdev.jresources.JMenuGenerator;

import java.time.LocalDate;
import java.util.*;

import static com.fosanzdev.T10.Ej10.Requesters.GeneralRequesters.*;
import static com.fosanzdev.T10.Ej10.Requesters.SpecificRequesters.*;

public class Ej10 {

    public static final Scanner lector = new Scanner(System.in);
    public static final EmployeeManager manager = new EmployeeManager();
    public static final JMenuGenerator menu = new JMenuGenerator(". ", true, true, true);

    public static void main(String[] args) {
        try{
            manager.add(
                    new Empleado("45368056G", "Fernando", "Sanz", LocalDate.of(1999, 12, 12), 1000,
                            new ArrayList<>(Arrays.asList(
                                    new Hijo("Fernando", LocalDate.of(2010, 12, 12)),
                                    new Hijo("Fernando", LocalDate.of(2010, 12, 12))
                            ))
                    )
            );
        } catch (AlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        String strMenu = menu.generateMenu("GESTION EMPLEADOS", "Nuevo empleado", "Nuevo hijo"
        , "Modificar sueldo", "Borrar empleado", "Borrar hijo", "Consultas", "Salir");
        int option = 0;
        do {
            System.out.println(strMenu);
            option = lector.nextInt();
            lector.nextLine();
            String DNI;
            switch (option) {
                case 1:
                    try{
                        manager.add(requestEmployeeInfo(manager));
                    } catch (AlreadyExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    String parentDNI = requestDNI("Introduce el DNI del padre/madre");
                    try {
                        manager.getDNI(parentDNI).addHijo(requestChildInfo());
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                case 3:
                    DNI = requestDNI("Introduce el DNI del empleado");
                    try {
                        manager.getDNI(DNI).setSalario(requestDouble("Introduce el nuevo sueldo"));
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    DNI = requestDNI("Introduce el DNI del empleado");
                    try {
                        manager.remove(DNI);
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    DNI = requestDNI("Introduce el DNI del empleado");
                    String childName = requestValidName("Introduce el nombre del hijo");
                    try {
                        manager.getDNI(DNI).removeHijo(childName);
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    consultMenu();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    lector.close();
                    System.exit(0);

                default:
                    System.out.println("Opción no válida");
            }
        } while (option != 3);
    }

    public static void consultMenu(){
        String strConsultMenu = menu.generateMenu("CONSULTAS EMPLEADOS", "Buscar por NIF", "Buscar por nombre",
                "Buscar por rango de edad", "Buscar por rango de sueldo", "Buscar por hijos menores de edad", "Volver");
        while (true){
            System.out.println(strConsultMenu);
            int option = lector.nextInt();
            lector.nextLine();
            switch (option) {
                case 1:
                    String DNI = requestDNI("Introduce el DNI del empleado");
                    try{
                        System.out.println(manager.getDNI(DNI));
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    String name = requestValidName("Introduce el nombre del empleado");
                    String surname = requestValidName("Introduce los apellidos del empleado");
                    try{
                        System.out.println(manager.getName(name, surname));
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    //searchByAgeRange();
                    break;
                case 4:
                    //searchBySalaryRange();
                    break;
                case 5:
                    //searchByChildren();
                    break;
                case 0:
                    System.out.println("Volviendo al menu principal...");
                    return;

                default:
                    System.out.println("Opción no válida");
            }
        }


    }
}
