package com.fosanzdev.T7.EjArrayList;

public class EjGenericStack {

    public EjGenericStack() {
        //Checking on strings
        GenericStack<String> stack = new GenericStack<>();
        stack.push("Hola");
        stack.push("Mundo");
        stack.push("!");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //Checking on integers
        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.peek());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());

        //Checking on doubles
        GenericStack<Double> stack3 = new GenericStack<>();
        stack3.push(1.1);
        stack3.push(2.2);
        stack3.push(3.3);
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());
        System.out.println(stack3.peek());
        System.out.println(stack3.pop());
        System.out.println(stack3.pop());

        //Checking if resize works
        GenericStack<Boolean> stack4 = new GenericStack<>();
        for (int i = 0; i < 100; i++) {
            stack4.push(true);
        }
        System.out.println(stack4.isFull());
        stack4.push(false);
        System.out.println(stack4.isFull());

    }


}
