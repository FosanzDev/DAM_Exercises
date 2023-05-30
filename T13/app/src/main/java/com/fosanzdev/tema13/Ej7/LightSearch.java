package com.fosanzdev.tema13.Ej7;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

public class LightSearch implements ISearchListeners{

    boolean found = false;
    int[] indexes;
    int count = 0;
    ExecutorService executor;
    ArrayList<Future<?>> futures = new ArrayList<Future<?>>();

    public static final int DEFAULT_THREADS = Runtime.getRuntime().availableProcessors();

    public LightSearch(){
        this.executor = Executors.newFixedThreadPool(DEFAULT_THREADS, r -> {
            Thread t = Executors.defaultThreadFactory().newThread(r);
            t.setDaemon(true);
            return t;
        });
    }

    public boolean contains(Object[] array, Object obj){

        int chunkSize = array.length / DEFAULT_THREADS;
        int startIndexes[] = new int[DEFAULT_THREADS];

        for(int i = 0; i < DEFAULT_THREADS; i++){
            startIndexes[i] = i * chunkSize;
        }
        startIndexes[DEFAULT_THREADS-1] = (DEFAULT_THREADS-1) * chunkSize; // fix for last chunk

        for(int i = 0; i < DEFAULT_THREADS-1; i++){ // iterate until the second to last chunk
            int start = startIndexes[i];
            int end = startIndexes[i+1];

            executor.execute(new SearchThread(array, obj, start, end, this));
        }
        // last chunk
        int start = startIndexes[DEFAULT_THREADS-1];
        int end = array.length;

        try{
            futures.add(executor.submit(new SearchThread(array, obj, start, end, this)));
        } catch (RejectedExecutionException e){
            for (Future<?> future : futures) {
                future.cancel(true);
            }
        }
        

        while(!executor.isTerminated()){
            // wait
        }

        return found;
    }

    public static void main(String[] args) {
        String array[] = new String[10000000];

        for (int i = 0; i < array.length; i++) {
            String randomString = "";
            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            int length = 5;

            for (int j = 0; j < length; j++) {
                int index = (int) (Math.random() * characters.length());
                randomString += characters.charAt(index);
            }

            array[i] = randomString;
        }

        array[array.length-1] = "a234s";

        LightSearch ls = new LightSearch();
        System.out.println(ls.contains(array, "a234s"));
        System.out.println(ls.contains(array, "a234s"));
    }

    @Override
    public void foundListener(int index) {
        found = true;
        System.out.println("Found at index: " + index);
        for (Future<?> future : futures) {
            future.cancel(true);
        }
        futures.clear();
    }

    @Override
    public void countListener(int[] indexes, int count) {
        this.indexes = indexes;
        this.count = count;
    }

}
