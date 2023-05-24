package com.fosanzdev.T10.Ej2;

import java.awt.*;
import java.util.ArrayList;

public class ArrayListEstadisticas extends ArrayList<Double> implements IEstadisticas {

    // Constructor:
    // Extends the ArrayList class and implements the IEstadisticas interface
    public ArrayListEstadisticas(){
        super();
    }

    /**
     * Returns the minimum value of the list
     * @return the minimum value of the list
     */
    public double minimo(){
        double min = get(0);
        for (double i : this){
            if(i < min){
                min = i;
            }
        }
        return min;
    }

    /**
     * Returns the maximum value of the list
     * @return the maximum value of the list
     */
    public double maximo(){
        double max = get(0);
        for (double i : this){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    /**
     * Returns the sum of all the values of the list
     * @return the sum of all the values of the list
     */
    public double sumatorio(){
        double sum = 0;
        for (double i : this){
            sum += i;
        }
        return sum;
    }

    /**
     * Returns the average of all the values of the list
     * @return the average of all the values of the list
     */
    public double media(){
        return sumatorio() / size();
    }

    /**
     * Returns the most repeated value of the list
     * @return the most repeated value of the list
     */
    public double moda(){
        double moda = get(0);
        int count = 0;
        for (double i : this){
            int count2 = 0;
            for (double j : this){
                if(i == j){
                    count2++;
                }
            }
            if(count2 > count){
                count = count2;
                moda = i;
            }
        }

        return moda;
    }

    @Override
    public String toString(){
        String str = "[";
        for (double i : this){
            str += String.format("%.3f", i) + ", ";
        }
        str = str.substring(0, str.length() - 2);
        str += "]";
        return str;
    }
}
