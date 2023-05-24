package com.fosanzdev.T10.Ej1;

import com.fosanzdev.jresources.JArray;

import java.util.ArrayList;
import java.util.List;

public class Ej1 {

    public Ej1(){
        int[] arr = JArray.genIntArray(10, 50);
        System.out.println(sepNumbers(arr));

    }

    public static List<Integer> sepNumbers(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : arr){
            if(i % 2 == 0){
                list.add(0, i);
            }
            else{
                list.add(i);
            }
        }

        return list;
    }
}
