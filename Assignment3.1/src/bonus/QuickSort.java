package bonus;

public class QuickSort {
    public static void main(String[] args) {
        Integer[] arr = {5,6,4,3,2,1,16,22,0};
        System.out.print("Before sorting:");
        Quick.display(arr);
        System.out.print("After sorting:");
        Quick.sort(arr,0, 8);
        Quick.display(arr);
    }
}

class Quick {
    public static <T extends Comparable<T>> void display(T[] arr){
        for (T t :arr) {
            System.out.print(t + ",");
        }
        System.out.println();
    }
    public static <T extends Comparable<T>> int part(T[] arr , int left , int right , T point) {
        //two pointers
        int leftptr = left - 1;
        int rightptr = right;

        while(true) {
            //Start from the left and right, put the right side bigger than point, put the left side smaller than point
            while(leftptr < rightptr && arr[++leftptr].compareTo(point) < 0);
            while(leftptr < rightptr && arr[--rightptr].compareTo(point) > 0);

            if(leftptr >= rightptr) {
                break;
            } else {
                T tmp = arr[leftptr];
                arr[leftptr] = arr[rightptr];
                arr[rightptr] = tmp;
            }
        }
        //The array is split, the keyword is inserted in the middle, leftptr and rightptr are in the middle.
        T tmp = arr[leftptr];
        arr[leftptr] = arr[right];
        arr[right] = tmp;
        return leftptr;
    }

    public static <T extends Comparable<T>> void sort(T[] arr , int left , int right) {
        if (right <= left) {
            return;
        }
        else {
            T point = arr[right];
            int part = part(arr, left, right, point);
            sort(arr, left, part - 1);
            sort(arr, part + 1, right);
        }

    }
}
