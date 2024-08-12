
import java.util.Scanner;

public class QueueIns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter size of queue: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\n");

        System.out.print("Enter no. elements to be inserted: ");
        int n = sc.nextInt();     

        int[] queue = new int[n + 1];
        for (int i = 0; i < size; i++) {
            queue[i] = a[i];
        }

        queue[size] = n;

        System.out.println("Final Queue-> ");
        for (int i = 0; i < size + 1; i++) {
            System.out.println(queue[i] + " ");
        }
    }
}
