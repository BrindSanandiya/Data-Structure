
import java.util.Scanner;

public class MatrixAdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter element a[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter element b[" + i + "][" + j + "]: ");
                b[i][j] = sc.nextInt();
            }
        }
        int c[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("");
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");

            }
        }
    }
} 
