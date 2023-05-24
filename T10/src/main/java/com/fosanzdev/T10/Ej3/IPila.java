package com.fosanzdev.T10.Ej3;

public interface IPila<E> {
    E push(E e);
    E pop();
    int size();
    E top();
    boolean isEmpty();
}
