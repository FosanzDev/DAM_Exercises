package com.fosanzdev.T7.EjArrayList;

public class Cola {

    private static final int DEFAULT_SIZE = 100;
    private static final double DEFAULT_RESIZE = 2;
    private double[] cola;
    public int addPointer;
    public int dataPointer;

    public Cola(int size) {
        cola = new double[size];
        addPointer = 0;
        dataPointer = 0;
    }

    public Cola() {
        this(DEFAULT_SIZE);
    }

    public void add(int value) {
        cola[addPointer] = value;
        addPointer++;

        if (addPointer == cola.length) {
            addPointer = 0;
        }

        if (addPointer == dataPointer) {
            cola = resize();
        }
    }

    public double peek() throws NoNextItemException {
        if (dataPointer == addPointer) {
            throw new NoNextItemException();

        } else {
            if (dataPointer == cola.length)
                dataPointer = 0;

            return cola[dataPointer];
        }
    }

    public double next() {
        double value = peek();
        dataPointer++;
        return value;
    }


    public double[] resize() {
        double[] cola2 = new double[cola.length * 2];
        int idx = 0;
        for (int i = dataPointer; i < cola.length; i++) {
            cola2[idx] = cola[i];
            idx++;
        }
        for (int i = 0; i < dataPointer; i++) {
            cola2[idx] = cola[i];
            idx++;
        }

        return cola2;
    }
}
