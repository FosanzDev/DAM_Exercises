package com.fosanzdev.tema13.Ej7;

public class SearchThread extends Thread {
    
    private Object[] array;
    private Object obj;
    private int start;
    private int end;
    private ISearchListeners listenerClass;

    private int[] indexes = new int[end-start + 1];
    private int count = 0;

    public SearchThread(Object[] array, Object obj, int start, int end, ISearchListeners listenerClass){
        this.array = array;
        this.obj = obj;
        this.start = start;
        this.end = end;
        this.listenerClass = listenerClass;
    }

    public SearchThread(Object[] array, Object obj, ISearchListeners listenerClass){
        this(array, obj, 0, array.length, listenerClass);
    }

    @Override
    public void run(){
        for(int i = start; i < end; i++){
            //System.out.println("Thread: " + Thread.currentThread().getName() + " searching at index: " + i);
            if(array[i].equals(obj)){
                listenerClass.foundListener(i);
                indexes[count] = i;
                count++;
            }
        }
        listenerClass.countListener(indexes, count);
    }
}
