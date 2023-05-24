package com.fosanzdev.T10.Ej10.Requesters;

import com.fosanzdev.T10.Ej10.Classes.Empleado;
import com.fosanzdev.T10.Ej10.EmployeeManager;
import com.fosanzdev.T10.Ej10.Exceptions.AlreadyExistsException;
import com.fosanzdev.T10.Ej10.Classes.Hijo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import static com.fosanzdev.T10.Ej10.Requesters.GeneralRequesters.*;
import static com.fosanzdev.T10.Ej10.Requesters.GeneralRequesters.requestBirthDate;

public class SpecificRequesters {

    public static Empleado requestEmployeeInfo(EmployeeManager manager) throws AlreadyExistsException {

        String DNI = requestDNI("Introduce el DNI del empleado");
        if (manager.exists(DNI)){
            throw new AlreadyExistsException("El empleado con DNI " + DNI + " ya existe");
        }
        String name = requestValidName("Introduce el nombre del empleado");
        String surname = requestValidName("Introduce los apellidos del empleado");
        LocalDate birthDate = requestBirthDate("Introduce la fecha de nacimiento del empleado", 16);
        double salary = requestDouble("Introduce el salario del empleado");
        int numChildren = requestInteger("Introduce el número de hijos del empleado");
        ArrayList<Hijo> hijos = requestChildrenInfo(numChildren);
        return new Empleado(DNI, name, surname, birthDate, salary, hijos);
    }

    /** Requests the info of a child
     *
     * @return Hijo object with the info
     */
    public static Hijo requestChildInfo(){
        String name = requestValidName("Introduce el nombre del hijo ");
        LocalDate birthDate = requestBirthDate("Introduce la fecha de nacimiento del hijo", 0);
        return new Hijo(name, birthDate);
    }

    /**
     * Requests the info of a child
     * @param childNumber number of the child
     * @return Hijo object with the info
     */
    public static Hijo requestChildInfo(int childNumber){
        String name = requestValidName("Introduce el nombre del hijo " + childNumber);
        LocalDate birthDate = requestBirthDate("Introduce la fecha de nacimiento del hijo" + childNumber, 0);
        return new Hijo(name, birthDate);
    }

    /**
     * Requests the info of x number of children
     * @param numChildren number of children to request info from
     * @return ArrayList with the children info
     */
    public static ArrayList<Hijo> requestChildrenInfo(int numChildren){
        Hijo[] children = new Hijo[numChildren];
        for (int i = 0; i < numChildren; i++) {
            children[i] = requestChildInfo(i+1);
        }
        ArrayList<Hijo> result = new ArrayList<>();
        Collections.addAll(result, children);
        return result;
    }
}
