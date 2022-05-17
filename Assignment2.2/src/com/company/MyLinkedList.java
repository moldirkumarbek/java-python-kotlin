package com.company;

public class MyLinkedList<T> {
    public MyNode<T> head;
    private MyNode<T> tail;
    private int size;
    private static class MyNode<E>{
        E data;
        MyNode<E> next;
        MyNode(E data){
            this.data = data;
        }
    }
    public T get(int index){
        MyNode<T> current = head;
        for(int i =0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }
    public int getSize(){
        return size;
    }
    public void append(T newItem){
        MyNode<T> newNode = new MyNode<>(newItem);
        if ( head == null){
            head = tail = newNode;
        } else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    //Home work
    public void add(T newItem, int index){
        MyNode<T> newNode = new MyNode<>(newItem);
        if (index == size){
            tail.next = newNode;
            tail = newNode;
        } else{
            MyNode<T> currentNode = head;
            for(int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
        size++;
    }
    public int find(T keyItem){
        MyNode<T> currentNode = head;
        for(int i = 0; i < size; i++) {
            if(currentNode.data == keyItem){
                return i;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }
    public void remove(int index){
        if(index == 0) {
            head = head.next;
        }else{
            MyNode<T> currentNode = head;
            for(int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
        }
        size--;
    }
    public MyNode<T> reverse(MyNode<T> head) {
        MyNode<T> first;
        if (head==null || head.next == null)
            return head;
        first = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return first;
    }

    public void output(){
        for(int i =0; i < size; i++){
            System.out.print(get(i) + " ");
        }
        System.out.println(" ");
    }
}