package com.fosanzdev.T7.EjArrayList;

public class EjArrayList {

    public EjArrayList() {
        ArrList arrList = new ArrList(10);

        for (int i = 0; i < 10; i++) {
            arrList.add(i);
        }

        for (int i = 0; i < 9; i++) {
            System.out.println("i = " + i);

            arrList.del(i);

        }

        System.out.println(arrList.get(3));

    }
}

