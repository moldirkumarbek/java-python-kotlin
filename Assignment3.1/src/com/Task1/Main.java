package com.Task1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Comparable[] a = {1,3,5,5,7,8,8,8,9,11,12,12,15};

        Ass3 ass3 = new Ass3();

        System.out.println(ass3.firstIndexOf(a, 8)); // Apply Binary search to find index of first occurrence

        System.out.println(ass3.secondIndexOf(a, 8)); // Apply Binary search to find index of second occurrence

        System.out.println(ass3.lastIndexOf(a,8)); // Apply Binary search to find index of last occurrence

        System.out.println(ass3.has(a, 23)); // Does the array have two elements with the given sum

        System.out.println(ass3.hasTriple(a,35)); // Does the array have three elements with the given sum

    }
}
