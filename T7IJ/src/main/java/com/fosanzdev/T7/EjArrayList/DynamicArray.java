package com.fosanzdev.T7.EjArrayList;

public class DynamicArray {
    private final static float GROW_FACTOR = 2f;
    private int[] data;
    private int size;

    public DynamicArray(int initialCapacity) {
        data = new int[initialCapacity];
        size = 0;
    }

    public DynamicArray() {
        this(10);
    }

    public int get(int index) {
        return data[index];
    }

    private void moveToRight(int index) {
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        size++;
    }

    public boolean add(int value) {
        if (size >= data.length)
            data = resize();

        data[size] = value;
        size++;
        return true;
    }

    public boolean add(int index, int value) {
        if (size >= data.length)
            data = resize();
        moveToRight(index);
        data[index] = value;
        return true;
    }

    public boolean set(int index, int value) {
        if (index >= size)
            return false;

        data[index] = value;
        return true;
    }


    private int[] resize() {
        int[] newData = new int[(int) (data.length * GROW_FACTOR)];
        System.arraycopy(data, 0, newData, 0, data.length);
        return newData;
    }


}
