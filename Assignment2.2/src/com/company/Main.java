package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arr = new MyArrayList<>();
        arr.append(1);
        arr.append(2);
        arr.append(3);
        arr.append(4);
        arr.append(5);
        arr.append(6);
        arr.append(7);
        arr.output();
        // Task 1
        arr.add(0,2);
        arr.output();
        // Task 2
        System.out.println(arr.find(7));
        // Task 3
        arr.remove(2);
        arr.output();
        // Task 4
        arr.reverse();
        arr.output();

        System.out.println("\n\n");

        MyLinkedList<Integer> arr2 = new MyLinkedList<>();
        arr2.append(5);
        arr2.append(4);
        arr2.append(3);
        arr2.append(2);
        arr2.append(1);
        arr2.output();
        // Task 1
        arr2.add(0,2);
        arr2.output();
        // Task 2
        System.out.println(arr2.find(3));
        // Task 3
        arr2.remove(2);
        arr2.output();
        // Task 4
        arr2.head = arr2.reverse(arr2.head);
        arr2.output();
    }
}
