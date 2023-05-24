package com.fosanzdev.T10.hashmap;

import java.util.ArrayList;

public class MyHashMap<K, V>{
    private final ArrayList<Node>[] data;

    //Creaamos un array de tamaño 50 para almacenar ArrayLists de nodos
    public MyHashMap(){
        data = new ArrayList[50];
    }

    /**
     * Añade un nuevo nodo al array de ArrayLists
     * @param key clave
     * @param value valor
     */
    public void put(K key, V value){
        //El indice del array es el hash del objeto % tamaño del array
        int hash = Math.abs(key.hashCode());
        int index = hash % data.length;

        //Si el indice del array es null, creamos un nuevo ArrayList
        if (data[index] == null){
            data[index] = new ArrayList<Node>();
        }

        //Añadimos el nodo al ArrayList
        data[index].add(new Node(key, value));
    }

    /**
     * Obtiene el valor de un nodo a partir de su clave
     * @param key clave
     * @return valor
     */
    public V get(K key){
        // El indice del array es el hash del objeto % tamaño del array
        int hash = Math.abs(key.hashCode());
        int index = hash % data.length;

        //Si el indice del array es null, devolvemos null
        if (data[index] == null){
            return null;
        }

        //Recorremos el ArrayList y devolvemos el valor del nodo con la clave indicada
        for (Node node : data[index]){
            if (node.key == key){
                return node.value;
            }
        }

        //Si no se encuentra el nodo, devolvemos null
        return null;
    }


    /**
     * Clase interna para almacenar los datos de los nodos
     */
    public class Node{
        final K key;
        V value;

        public Node(K key, V value){
            this.key = key;
            this.value = value;
        }

    }

}
