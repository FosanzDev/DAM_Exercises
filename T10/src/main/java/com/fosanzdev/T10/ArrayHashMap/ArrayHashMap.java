package com.fosanzdev.T10.ArrayHashMap;

public class ArrayHashMap<K,V> {

    private final int DEFAULT_SIZE = 50;
    private final int GROWTH_FACTOR = 2;
    private final double LOAD_FACTOR = 0.75f;

    public int reps = 0;
    public int collisions = 0;
    public int resizes = 0;

    private Node<K, V>[] data;


    public ArrayHashMap() {
        data = new Node[DEFAULT_SIZE];
    }

    public ArrayHashMap(int size) {
        data = new Node[size];
    }

    public void put(K key, V value) {
        int hash = Math.abs(key.hashCode());
        int index = hash % data.length;

        if (search(key) != -1) {
            data[search(key)].value = value;
            reps++;
            return;
        }

        if (data[index] == null) {
            data[index] = new Node<>(key, value, 0);
        } else {
            int lastNode = index;

            while (data[index].offset != 0) {
                collisions++;
                lastNode = index;
                index = (index + data[index].offset);
            }


            for (int i = index; i < data.length; i++) {
                if (data[i] == null) {
                    data[i] = new Node<>(key, value, 0);
                    data[lastNode].offset = i - lastNode;
                    break;
                }
            }

            checkLoad();
        }
    }

    public V get(K key) {

        int index = search(key);

        if (index == -1) {
            return null;
        } else return data[index].value;
    }

    public int search(K key) {

        int hash = Math.abs(key.hashCode());
        int index = hash % data.length;

        if (data[index] == null) {
            return -1;

        } else {
            while (data[index].offset != 0) {
                if (data[index].key.equals(key)) {
                    return index;
                }

                index = (index + data[index].offset);
            }

            if (data[index].key.equals(key)) {
                return index;
            }
        }
        return -1;

    }

    private void checkLoad() {
        int count = 0;

        for (Node<K, V> node : data) {
            if (node != null) {
                count++;
            } else {
                break;
            }
        }

        if (count >= data.length * LOAD_FACTOR) {
            grow();
        }

    }

    private void grow() {
        resizes++;
        Node<K, V>[] newData = new Node[data.length * GROWTH_FACTOR];

        for (Node<K, V> d : data) {
            if (d != null) {
                int hash = Math.abs(d.key.hashCode());
                int index = hash % newData.length;

                if (newData[index] == null) {
                    newData[index] = new Node<>(d.key, d.value, 0);
                } else {
                    int lastNode = index;

                    while (newData[index].offset != 0) {
                        lastNode = index;
                        index = (index + newData[index].offset);
                    }

                    for (int i = index; i < newData.length; i++) {
                        if (newData[i] == null) {
                            newData[i] = new Node<>(d.key, d.value, 0);
                            newData[lastNode].offset = i - lastNode;
                            break;
                        }
                    }
                }
            }
        }

        data = newData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                sb.append(data[i].key).append(" : ").append(data[i].value).append("\n");
            } else {
                sb.append("null").append("\n");
            }
        }
        return sb.toString();
    }

    public String nulls(){
        int count = 0;
        for (Node<K, V> node : data) {
            if (node == null) {
                count++;
            }
        }

        return "Nulls: " + count;
    }

    public int getSize(){
        return data.length;
    }
}
