package com.fosanzdev.T8.calculator;

public class Calculator {

    public enum State{
        OFF, INIT, OP1, OP1_DECIMAL, BEGIN_OP2, OP2, OP2_DECIMAL, ERROR
    }

    private double op1;
    private double op2;
    private char operator;
    private State state;
    private final StringBuilder buffer;

    public Calculator(){
        op1 = 0;
        op2 = 0;
        state = State.INIT;
        buffer = new StringBuilder();
    }

    public void turnOn(){
        state = State.INIT;
    }

    public void turnOff(){
        state = State.OFF;
        buffer.setLength(0);
    }

    public String getDisplay(){
        return buffer.toString();
    }

    public String addSymbol(char c){

        if (c == 'c' && state != State.OFF){
            buffer.setLength(0);
            op1=0;
            op2=0;
            return getDisplay();
        } else if (c == 'f') {
            turnOff();
            return getDisplay();
        } else {
        switch(state) {

            case OFF:
                if (c == 'o'){
                    reset();
                }
                break;


            case INIT:
                if (Character.isDigit(c)) {
                    buffer.append(c);
                    state = State.OP1;
                } else if (c == '.') {
                    buffer.append("0.");
                    state = State.OP1_DECIMAL;
                }
                break;

            case OP1:
                if (Character.isDigit(c)) {
                    buffer.append(c);

                } else if (c == '.') {
                    buffer.append(c);
                    state = State.OP1_DECIMAL;

                } else if (isOperator(c)) {
                    parseOp1();
                } else if (isReset(c)) {
                    reset();
                }
                break;

            case OP1_DECIMAL:
                if (Character.isDigit(c)) {
                    buffer.append(c);
                } else if (isOperator(c)) {
                    parseOp1();
                } else if (isReset(c)) {
                    reset();
                } else if (isReset(c)) {
                    reset();
                } else {
                    error();
                }
                break;

            case BEGIN_OP2:
                if (Character.isDigit(c)) {
                    buffer.append(c);
                    state = State.OP2;
                } else if (c == '.') {
                    buffer.append("0.");
                    state = State.OP2_DECIMAL;
                } else if (isReset(c)) {
                    reset();
                } else {
                    error();
                }
                break;

            case OP2:
                if (Character.isDigit(c)){
                    buffer.append(c);
                } else if (c == '.'){
                    buffer.append("0.");
                    state = State.OP2_DECIMAL;
                } else if (isOperator(c) ){
                    parseOperation();
                    state = State.BEGIN_OP2;
                    operator = c;
                } else if (isReset(c)) {
                    reset();
                } else if (c == '='){
                    parseOperation();
                    state = State.INIT;
                } else {
                    error();
                }
                break;

            case OP2_DECIMAL:
                if (Character.isDigit(c)){
                    buffer.append(c);
                } else if (isOperator(c)){
                    parseOperation();
                    state = State.BEGIN_OP2;
                    operator = c;
                } else if (isReset(c)){
                    reset();
                } else {
                    error();
                }

                case ERROR:
                    if (isReset(c)){
                        reset();
                    }
                    break;
            }
        }
        return buffer.toString();

    }

    private void parseOperation() {
            op2 = Double.parseDouble(buffer.toString());
            switch (operator) {
                case '+' -> op1 += op2;
                case '-' -> op1 -= op2;
                case '*' -> op1 *= op2;
                case '/' -> {
                    if (op2 == 0) {
                        error();
                    } else {
                        op1 /= op2;
                    }
                }
                case '%' -> op1 %= op2;
            }

        buffer.append(op1);
    }

    private boolean isOperator(char c){
        final String OPERATORS = "+-*/%";
        return OPERATORS.contains(String.valueOf(c));
    }

    private void error(){
        buffer.setLength(0);
        buffer.append("ERROR");
        state = State.ERROR;
    }

    void reset(){
        buffer.setLength(0);
        state = State.INIT;
    }

    private boolean isReset(char c){
        return c == 'C';
    }

    private void parseOp1(){
        op1 = Double.parseDouble(buffer.toString());
        buffer.setLength(0);
        state = State.BEGIN_OP2;
    }

    public void addDigit(char c){
        switch (state){
            case OFF:
                break;

            case INIT:
            case OP1:
            case OP2:
                buffer.append(c);
                break;

        }
    }

}
