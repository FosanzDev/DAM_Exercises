package com.fosanzdev.tema13.Ej6;

public class Ej6 {

    public int count;
    

    public Ej6(int numThreads, int maxNum){

        Thread[] threads = new Thread[numThreads];

        while(count < maxNum){
            for(int i = 0; i < numThreads; i++){
                threads[i] = new Thread(new Runnable(){
                    public void run(){
                        if(count < maxNum){
                            System.out.println(Thread.currentThread().getName() + " " + count);
                            count++;
                        }
                    }
                });
                threads[i].start();
            }
        }

    }
}
