package com.data.structure.linear.stack;

import com.data.structure.linear.array.Array;

import java.util.Arrays;

public class Stack<T> {
    private T[] elements;
    private int size = 0;
    private int capacity = 10;

    @SuppressWarnings("unchecked")
    public Stack(){
        elements = (T[]) new Object[capacity];
    }

    public void push(final T element){
        if(capacity == elements.length){
            capacity = capacity * 2;
            elements = Arrays.copyOf(elements, capacity);
        }
        elements[size] = element;
        size++;
    }

    public T pop(){
        if(isEmpty()){
            return null;
        }
        --size;
        T data = elements[size];
        elements[size] = null;
        return data;
    }

    public T peek(){
        if (isEmpty()){
            return null;
        }
        return elements[size-1];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void printStack() {
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(" " + elements[i]);
        }
    }

}
