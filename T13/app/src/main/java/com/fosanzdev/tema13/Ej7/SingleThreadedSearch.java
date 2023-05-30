package com.fosanzdev.tema13.Ej7;

public class SingleThreadedSearch{

    /**
     * Searches for an integer in an array
     * @param array The array to search in
     * @param obj The integer to search for
     * @return true if the integer is in the array, false otherwise
     */
    public static boolean contains(int[] array, int obj){
        for(int i = 0; i < array.length; i++){
            if(array[i] == obj){
                return true;
            }
        }
        return false;
    }    

    /**
     * Searches for a byte in an array
     * @param array The array to search in
     * @param obj The byte to search for
     * @return true if the byte is in the array, false otherwise
     */
    public static boolean contains(byte[] array, byte obj){
        for(int i = 0; i < array.length; i++){
            if(array[i] == obj){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Searches for a short in an array
     * @param array The array to search in
     * @param obj The short to search for
     * @return true if the short is in the array, false otherwise
     */
    public static boolean contains(short[] array, short obj){
        for(int i = 0; i < array.length; i++){
            if(array[i] == obj){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Searches for a long in an array
     * @param array The array to search in
     * @param obj The long to search for
     * @return true if the long is in the array, false otherwise
     */
    public static boolean contains(long[] array, long obj){
        for(int i = 0; i < array.length; i++){
            if(array[i] == obj){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Searches for a float in an array
     * @param array The array to search in
     * @param obj The float to search for
     * @return true if the float is in the array, false otherwise
     */
    public static boolean contains(float[] array, float obj){
        for(int i = 0; i < array.length; i++){
            if(array[i] == obj){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Searches for a double in an array
     * @param array The array to search in
     * @param obj The double to search for
     * @return true if the double is in the array, false otherwise
     */
    public static boolean contains(double[] array, double obj){
        for(int i = 0; i < array.length; i++){
            if(array[i] == obj){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Searches for a char in an array
     * @param array The array to search in
     * @param obj The char to search for
     * @return true if the char is in the array, false otherwise
     */
    public static boolean contains(char[] array, char obj){
        for(int i = 0; i < array.length; i++){
            if(array[i] == obj){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Searches for a boolean in an array
     * @param array The array to search in
     * @param obj The boolean to search for
     * @return true if the boolean is in the array, false otherwise
     */
    public static boolean contains(boolean[] array, boolean obj){
        for(int i = 0; i < array.length; i++){
            if(array[i] == obj){
                return true;
            }
        }
        return false;
    }
    
}