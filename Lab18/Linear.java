
import java.util.Scanner;

public class Linear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");

        int size = sc.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index "+i+": ");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter value to be searched");
        int value = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (a[i] == value) {
                System.out.println("Value found at " + i);
            }
        }

    }
}
