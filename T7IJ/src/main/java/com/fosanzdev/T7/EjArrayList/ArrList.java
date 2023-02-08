package com.fosanzdev.T7.EjArrayList;

public class ArrList {

    private static final int GROW_FACTOR = 2;


    private int[] array;
    private Object[] arrays;
    private int count;
    private int arraysCount;

    public ArrList(int size) {
        this.array = new int[size];
        this.arrays = new Object[10];
        this.count = 0;
        this.arraysCount = 0;
        arrays[arraysCount] = array;
    }

    public void add(int value) {
        if (count == array.length) {
            arraysCount++;
            if (arraysCount == arrays.length) {
                Object[] newArrays = new Object[arrays.length * GROW_FACTOR];
                System.arraycopy(arrays, 0, newArrays, 0, arrays.length);
                arrays = newArrays;
                System.out.println("Resized arrays");
                System.out.println("arrays.length = " + arrays.length);
            }

            arrays[arraysCount] = new int[50];
            count = 0;
        }

        ((int[]) arrays[arraysCount])[count] = value;
        count++;
    }

    public int get(int index) throws IndexOutOfBoundsException {
        if (index > (arraysCount * 10) + count || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        int arraysIndex = index / 10;
        int arrayIndex = index % 10;

        return ((int[]) arrays[arraysIndex])[arrayIndex];
    }

    public void del(int index) {
        if (index > (arraysCount * 10) + count || index < 0) {
            return;
        }

        int arraysIndex = index / 10;
        int arrayIndex = index % 10;

        ((int[]) arrays[arraysIndex])[arrayIndex] = this.get((arraysCount * 10) + count - 1);
        count--;
        if (count < 0) {
            arraysCount--;
            count = 9;
        }
    }
}
