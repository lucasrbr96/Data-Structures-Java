package com.data.structure.linear.array;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class Array <T>{
    private T[] array;
    private int length = 0;

    private int capacity = 1;

    public Array(){
        array = (T[]) new Object[capacity];
    }

    public int size(){
        return this.length;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void add(final T element){
        if(length + 1 >= capacity){
            increasesArray();
        }

        array[length] = element;
        length++;
    }

    public T get(final int index){
        if(index < 0 && index > length){
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }

    public T removeAt(final int index){
        if(index < 0 && index > length){
            throw new ArrayIndexOutOfBoundsException();
        }

        capacity = capacity - 1;
        length = length - 1;
        T element = array[index];

        T[] arrayAux = (T[]) new Object[capacity];

        for(int i =0, j = 0; j<length; i++, j++){
            if (i == index){
                j++;
            }
            arrayAux[i] = array[j];
        }

        array = arrayAux;
        return element;
    }

    public int indexOf(final T element){
        for (int i = 0; i < length; i++){
            if(array[i] == element){
                return i;
            }
        }
        return -1;
    }

    public T remove(final T element){
        int index = indexOf(element);
        return removeAt(index);
    }

    public void set(final T element, final int index){
        array[index] = element;
    }

    public void clear(){
        array = (T[]) new Object[capacity];
        length = 0;
        capacity = 1;
    }

    public boolean contains(T element){
        return indexOf(element) > -1;
    }

    private void increasesArray(){
        capacity = capacity + 1;
        T[] arrayAux = (T[]) new Object[capacity];
        for (int i = 0; i < length; i++){
            arrayAux[i] = array[i];
        }

        array = arrayAux;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
