package com.fosanzdev.T11.Ej4;

public enum Consumo {
    A('A'), B('B'), C('C'), D('D'), E('E'), F('F');

    char value;
    Consumo(char c){
        value = c;
    }

    char getValue(){
        return value;
    }
}
