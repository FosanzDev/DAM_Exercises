package com.fosanzdev.tema13.Ej7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.fosanzdev.tema13.Ej7.SingleThreadedSearch.*;


public class Search{

    private static final int MAX_THREADS = Runtime.getRuntime().availableProcessors();
    private static final int THRESHOLD = 1000;


    //ALL METHODS RELATED TO CONTAINS

    public static boolean contains(Object[] array, Object obj){
        if(array.length < THRESHOLD){
            return LightSearch.contains(array, obj);
        }else{
            return HeavySearch.contains(array, obj);
        }
    }

    public static boolean contains(int[] array, int obj){
        if (array.length < THRESHOLD){
            return SingleThreadedSearch.contains(array, obj);
        } else {
            return LightSearch.contains(array, obj);
        }
    }

    public static boolean contains(boolean[] array, boolean obj){
        if (array.length < THRESHOLD){
            return SingleThreadedSearch.contains(array, obj);
        } else {
            return LightSearch.contains(array, obj);
        }
    }

    public static boolean contains(byte[] array, byte obj){
        if (array.length < THRESHOLD){
            return SingleThreadedSearch.contains(array, obj);
        } else {
            return LightSearch.contains(array, obj);
        }
    }

    public static boolean contains(char[] array, char obj){
        if (array.length < THRESHOLD){
            return SingleThreadedSearch.contains(array, obj);
        } else {
            return LightSearch.contains(array, obj);
        }
    }

    public static boolean contains(short[] array, short obj){
        if (array.length < THRESHOLD){
            return SingleThreadedSearch.contains(array, obj);
        } else {
            return LightSearch.contains(array, obj);
        }
    }

    public static boolean contains(long[] array, long obj){
        if (array.length < THRESHOLD){
            return SingleThreadedSearch.contains(array, obj);
        } else {
            return LightSearch.contains(array, obj);
        }
    }

    public static boolean contains(float[] array, float obj){
        if (array.length < THRESHOLD){
            return SingleThreadedSearch.contains(array, obj);
        } else {
            return LightSearch.contains(array, obj);
        }
    }

    public static boolean contains(double[] array, double obj){
        if (array.length < THRESHOLD){
            return SingleThreadedSearch.contains(array, obj);
        } else {
            return LightSearch.contains(array, obj);
        }
    }

}