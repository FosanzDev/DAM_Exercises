package com.fosanzdev.tema13.Ej6;

import java.util.concurrent.atomic.AtomicInteger;

public class Ej6Thread implements Runnable{
    

    Integer count;


    public Ej6Thread(int count){
        this.count = count;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + count);
        count++;
    }
}
