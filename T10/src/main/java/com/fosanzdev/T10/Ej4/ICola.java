package com.fosanzdev.T10.Ej4;

public interface ICola<E> {
    boolean add(E e);
    E remove();
    int size();
    E peek();
    boolean isEmpty();
}
