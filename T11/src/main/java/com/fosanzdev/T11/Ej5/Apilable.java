package com.fosanzdev.T11.Ej5;

public enum Apilable {
    X64(64), X16(16), X1(1);

    private final int value;

    Apilable(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
