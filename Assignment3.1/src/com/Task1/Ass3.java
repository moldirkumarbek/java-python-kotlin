package com.Task1;

public class Ass3<T extends Comparable<T>> {
    public int firstIndexOf(T[] array, T item) { //1
        return binarySearchFirstIndexOf(array, item, 0, array.length - 1);
    }

    private int binarySearchFirstIndexOf(T[] array, T item, int start, int end) {
        var temp = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            int cmp = array[mid].compareTo(item);
            if (cmp == 0) {
                temp = mid;
                end = mid - 1;
            } else if (cmp > 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return temp;
    }
    public int secondIndexOf(T[] array, T item) { // 2

        return binarySearchSecondIndexOf(array, item, 0, array.length - 1);
    }

    private int binarySearchSecondIndexOf(T[] array, T item, int start, int end) {
        int i = 0;
        var temp1 = 0;
        var temp = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            int cmp = array[mid].compareTo(item);
            if (cmp == 0) {
                i++;
                if (i == 2 && temp1 == temp) {
                    temp = mid;
                } else if (i == 1) {
                    temp1 = mid;
                }
                end = mid - 1;
            } else if (cmp > 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return temp1;
    }
    public int lastIndexOf(T[] array, T item) { // 3
        return binarySearchLastIndexOf(array, item, 0, array.length - 1);
    }

    private int binarySearchLastIndexOf(T[] array, T item, int start, int end) {
        var temp = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int cmp = array[mid].compareTo(item);
            if (cmp == 0) {
                temp = mid;
                start = mid + 1;
            } else if (cmp > 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return temp;
    }
    public boolean has(T[] array, T key) { // 4
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int adding = add(array[i], (array[j]));
                int sum = (Integer) key;
                if (adding == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    public int add(T[] arr, int i, int j) {
        return add(arr[i], arr[j]);
    }

    private int add(T i1, T i2) {
        var count = 0;
        int k = (Integer) i1;
        int y = (Integer) i2;
        for (int i = 0; i < k + y; i++) {
            count++;
        }
        return count;
    }
    public boolean hasTriple(T[] array, T key) { // 5
        for (int i = 0; i < array.length - 2; i++) {

            for (int j = i + 1; j < array.length - 1; j++) {

                for (int o = j + 1; o < array.length; o++) {
                    int adding = add(array[i], array[j], array[o]);
                    int sum = (Integer) key;
                    if (adding == sum) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

    public int add(T[] arr, int i, int j, int p) {
        return add(arr[i], arr[j], arr[p]);

    }

    private int add(T i1, T i2, T i3){
        var count = 0;
        int k =  (Integer)i1;
        int y = (Integer)i2;
        int h = (Integer)i3;
        for (int i = 0; i < k + y + h; i++) {
            count++;
        }
        return count;
    }

}