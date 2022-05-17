package com.company;

public class MyArrayList<T> {
    private Object[] array;
    private int size = 0;
    private int capacity = 5;
    public MyArrayList(){
        array = new Object[capacity];
    }
    public T get(int index){
        return (T) array[index];
    }
    public void increaseBuffer(){
        capacity = (int) (2*capacity);
        Object[] array2 = new Object[capacity];
        for(int i =0; i < size; i++){
            array2[i] = array[i];
        }
        array = array2;
    }
    public int getSize(){
        return size;
    }
    public void append(T newItem){
        if (size==capacity){
            increaseBuffer();
        }
        array[size++] = newItem;
    }
    //Home work
    public void add(T newItem, int index){
        if (size==capacity){
            increaseBuffer();
        }
        for(int i = size; i >= index;i--){
            array[i+1]=array[i];
        }
        array[index] = newItem;
        size++;
    }
    public int find(T keyItem){
        for(int i = 0; i <= size;i++){
            if(array[i]==keyItem){
                return i;
            }
        }
        return -1;
    }
    public void remove(int index){
        for(int i = index; i < size;i++){
            array[i]=array[i+1];
        }
        size--;
    }
    public void reverse(){
        for(int i =0; i <size/2;i++){
            Object temp = array[i];
            array[i] = array[size-i-1];
            array[size-i-1] = temp;
        }
    }
    public void output(){
        for(int i =0; i < size; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }
}