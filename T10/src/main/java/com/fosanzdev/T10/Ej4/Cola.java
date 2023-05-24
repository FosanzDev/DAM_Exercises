package com.fosanzdev.T10.Ej4;

import java.util.ArrayList;
import java.util.Queue;

public class Cola<E> implements ICola<E> {

    private final ArrayList<E> cola;

    public Cola() {
        cola = new ArrayList<>();
    }

    @Override
    public boolean add(Object e) {
        return cola.add((E) e);
    }

    @Override
    public E remove() {
        E res = peek();
        cola.remove(0);
        return res;
    }

    @Override
    public int size() {
        return cola.size();
    }

    @Override
    public E peek() {
        return cola.get(0);
    }

    @Override
    public boolean isEmpty() {
        return cola.isEmpty();
    }
}
