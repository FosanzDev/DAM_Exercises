package com.fosanzdev.T10.Ej3;

import java.util.Stack;

public class Pila<E> implements IPila<E>{

    // Atributos
    private final Stack<E> stack;

    // Constructor
    public Pila() {
        this.stack = new Stack<>();
    }

    // Implementación de la interfaz IPila

    // Expulsa el elemento que está en la cima de la pila.
    @Override
    public E pop() {
        return stack.pop();
    }

    // Añade un elemento a la cima de la pila.
    @Override
    public E push(E e) {
        stack.push(e);
        return e;
    }

    // Devuelve el número de elementos de la pila.
    @Override
    public int size() {
        return stack.size();
    }

    // Devuelve el elemento que está en la cima de la pila sin expulsarlo.
    @Override
    public E top() {
        return stack.peek();
    }

    // Devuelve true si la pila no tiene elementos.
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
