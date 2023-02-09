package com.fosanzdev.T7.EjArrayList;

public class Pila {

    private static final int DEFAULT_SIZE = 100;
    private static final double DEFAULT_RESIZE = 2;
    private double[] pila;
    public int pointer;

    public Pila(int size) {
        pila = new double[size];
        pointer = 0;
    }

    public Pila() {
        this(DEFAULT_SIZE);
    }

    public void add(int value) {
        pila[pointer] = value;
        pointer++;

        if (pointer == pila.length) {
            pila = resize();
        }
    }

    public double peek() throws NoNextItemException {
        if (pointer == 0) {
            throw new NoNextItemException();

        } else {
            return pila[pointer - 1];
        }
    }

    public double next() {
        double value = peek();
        pointer--;
        return value;
    }

    public double[] resize() {
        double[] pila2 = new double[(int) (pila.length * DEFAULT_RESIZE)];
        int idx = 0;
        for (double v : pila) {
            pila2[idx] = v;
            idx++;
        }

        return pila2;
    }
}
