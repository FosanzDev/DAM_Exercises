package com.fosanzdev.T10.ArrayHashMap;

import com.fosanzdev.T10.hashmap.MyHashMap;
import com.github.javafaker.Faker;

public class ArrayHashMapTest {

    public static void main(String[] args) {
        ArrayHashMap<String, String> test = new ArrayHashMap<>();
        Faker faker = new Faker();

        //Generate 1000 random keys and values
        //Also calculate the time ellapsed

        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++){
            String key = faker.name().firstName();
            String value = faker.name().lastName();
            test.put(key, value);
        }
        long endTime = System.nanoTime();

        System.out.println("Time ellapsed in insertion: " + (endTime - startTime)/1000000 + "ms");

        //Search for 1000 random keys
        //Also calculate the time ellapsed

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++){
            String key = faker.name().firstName();
            test.get(key);
        }
        endTime = System.nanoTime();

        System.out.println("Time ellapsed in search: " + (endTime - startTime)/1000000 + "ms");
        System.out.println("Number of nulls: " + test.nulls());
        System.out.println("Final size: " + test.getSize());
        System.out.println("Number of reps: " + test.reps);
        System.out.println("Number of collisions: " + test.collisions);
        System.out.println("Number of resizes: " + test.resizes);
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");

        //Generate 1000 random keys and values
        //Now we're used not optimized HashMap

        MyHashMap<String, String> test2 = new MyHashMap<>();
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++){
            String key = faker.name().firstName();
            String value = faker.name().lastName();
            test2.put(key, value);
        }
        endTime = System.nanoTime();

        System.out.println("Time ellapsed in insertion: " + (endTime - startTime)/1000000 + "ms");

        //Search for 1000 random keys
        //Also calculate the time ellapsed

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++){
            String key = faker.name().firstName();
            test2.get(key);
        }
        endTime = System.nanoTime();

        System.out.println("Time ellapsed in search: " + (endTime - startTime)/1000000 + "ms");
    }
}
