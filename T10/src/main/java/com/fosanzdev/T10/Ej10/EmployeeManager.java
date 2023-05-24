package com.fosanzdev.T10.Ej10;

import com.fosanzdev.T10.Ej10.Classes.Empleado;
import com.fosanzdev.T10.Ej10.Exceptions.AlreadyExistsException;
import com.fosanzdev.T10.Ej10.Exceptions.NoSuchElementException;

import java.util.ArrayList;

public class EmployeeManager {

    private final ArrayList<Empleado> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    //Finders

    public boolean exists(Empleado e){
        for (Empleado employee : employees) {
            if (employee != null && employee.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public boolean exists(String DNI){
        for (Empleado employee : employees) {
            if (employee != null && employee.getDNI().equals(DNI)) {
                return true;
            }
        }
        return false;
    }

    public Empleado getDNI(String parentDNI) throws NoSuchElementException{

        for (Empleado employee : employees) {
            if (employee != null && employee.getDNI().equals(parentDNI)) {
                return employee;
            }
        }
        throw new NoSuchElementException("El empleado no existe");
    }

    public Empleado getName(String nombre, String surnames) throws NoSuchElementException{
        for (Empleado employee : employees) {
            if (employee != null && employee.getNombre().equals(nombre) && employee.getApellidos().equals(surnames)) {
                return employee;
            }
        }
        throw new NoSuchElementException("El empleado no existe");
    }

    //Adders

    public void add(Empleado e) throws AlreadyExistsException{
        if (!exists(e)) {
            employees.add(e);
            return;
        }
        throw new AlreadyExistsException("El empleado ya existe");
    }

    //Removers

    public void remove(Empleado e){
        employees.remove(e);
    }

    public void remove(String dni) throws NoSuchElementException{
        this.remove(this.getDNI(dni));
    }


    //Specific finders

}
