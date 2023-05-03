package com.fosanzdev.T11.Ej5Adv.ItemCore;

public enum Stackable {
    X64(64), X16(16), X1(1);

    private final int value;
    Stackable(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public static Stackable getStackable(int value){
        switch(value){
            case 64:
                return X64;
            case 16:
                return X16;
            case 1:
                return X1;
            default:
                return X1;
        }
    }

}
