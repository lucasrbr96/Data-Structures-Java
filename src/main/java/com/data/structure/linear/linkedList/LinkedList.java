package com.data.structure.linear.linkedList;

import java.util.NoSuchElementException;

public class LinkedList<T> {
    private Node<T> head;
    private int size = 0;

    public void add(final T data){
        if(head == null){
            head = new Node<>(data);
        }else {
            Node<T> temp = new Node<>(data);
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public T remove(final T data){
        if(head == null){
            throw new NoSuchElementException("Not found element: " + data);
        }else{
            if(head.data == data){
                if(head.next != null) {
                    head = head.next;
                }else {
                    head = null;
                }
                size--;
                return data;
            }
        }

        Node<T> temp = head;
        while (temp.next != null){
            if(temp.next.data == data){
                if(temp.next.next == null){
                    temp.next = null;
                }else {
                    temp.next = temp.next.next;
                }
                size--;
                return data;
            }
            temp = temp.next;
        }
        throw new NoSuchElementException("Not found element: " + data);
    }

    public void print() {
        Node<T> temp = head;
        System.out.print("[ ");
        while (temp !=null){
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println(" ]");
    }

    public int size(){
        return size;
    }

    public void clean(){
        head = null;
        size = 0;
    }

    public boolean contains(final T data){
        Node<T> temp = head;

        while (temp != null){
            if(temp.data == data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    private static class Node<T>{
        private final T data;
        private Node<T> next;

        public Node(final T data){
            this.data = data;
        }
    }
}
