
import java.util.*;

public class MergeSort {

    public static void divide(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int middle = (high + low)/ 2;  

        divide(arr, low, middle);
        divide(arr, middle + 1, high);
        conquer(arr, low, middle, high);
    }

    public static void conquer(int arr[], int low, int middle, int high) {

        int[] merge = new int[high - low + 1];  
        int index1 = low;
        int index2 = middle + 1;
        int x = 0;

        while (index1 <= middle && index2 <= high) {

            if (arr[index1] <= arr[index2]) {
                merge[x++] = arr[index1++];
            } 
            else {
                merge[x++] = arr[index2++];
            }
        }

        while (index1 <= middle) {
            merge[x++] = arr[index1++];
        }

        while (index2 <= high) {
            merge[x++] = arr[index2++];
        }

        for (int i = 0; i < merge.length; i++) {
            arr[low + i] = merge[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        divide(arr, 0, size - 1);

        System.out.println("Sorting Complete");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
