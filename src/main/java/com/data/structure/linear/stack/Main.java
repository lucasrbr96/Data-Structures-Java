package com.data.structure.linear.stack;


public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.printStack();

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        stack.push(1);
        stack.printStack();
    }
}