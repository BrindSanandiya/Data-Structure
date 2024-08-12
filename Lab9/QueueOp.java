
import java.util.Scanner;

public class QueueOp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of queue: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter index: ");
        int ind = sc.nextInt();
        int ans[] = new int[size];
        for (int i = 0; i < ind; i++) {
            ans[i] = a[i];
            System.out.println(ans[i]);
        }
        for (int i = ind + 1; i < ans.length; i++) {
            ans[i] = a[i];
            System.out.print(ans[i]);
        }

    }
}
