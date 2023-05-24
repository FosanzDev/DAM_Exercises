package com.fosanzdev.T10.hashmap;

public class HashmapTest {

    public static void main(String[] args) {
        MyHashMap<String, String> map = new MyHashMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("Aa", "value4");
        map.put("BB", "value5");

        System.out.println(map.get("key1"));
        System.out.println(map.get("key2"));
        System.out.println(map.get("key3"));

        //Probando con varios valores con el mismo hash
        System.out.println(map.get("Aa"));
        System.out.println(map.get("BB"));
    }
}
