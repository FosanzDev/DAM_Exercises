package com.fosanzdev.T7.EjArrayList;

public class NoNextItemException extends IndexOutOfBoundsException {
    public NoNextItemException(String message) {
        super(message);
    }

    public NoNextItemException() {
        super("No hay más elementos en la cola");
    }
}
