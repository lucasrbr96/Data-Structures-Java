package com.data.structure.linear.array;

public class Main {
    public static void main(String[] args) {
        Array<Integer> array = new Array<>();
        array.add(1);
        array.add(2);
        array.add(3);
        System.out.println(array);
        System.out.println(array.size());
        array.remove(3);
        System.out.println(array);
        array.add(4);
        System.out.println(array);
        System.out.println(array.size());
        System.out.println(array.get(0));
        array.clear();
        array.add(1);
        System.out.println(array);
        System.out.println(array.size());
    }
}