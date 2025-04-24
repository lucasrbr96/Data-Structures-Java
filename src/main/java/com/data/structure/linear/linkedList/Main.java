package com.data.structure.linear.linkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.print();

        list.add(1);
        list.remove(1);
        list.print();

        list.add(2);
        list.add(3);
        list.print();
        System.out.println("Size : " + list.size());

        list.remove(2);
        list.print();
        System.out.println("Size : " + list.size());
        System.out.println("Contains 3: " + list.contains(3));
        list.clean();
        list.print();
        System.out.println("Size : " + list.size());
        System.out.println("Contains 3: " + list.contains(3));
    }
}