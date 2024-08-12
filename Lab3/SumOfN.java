import java.util.Scanner;

public class SumOfN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int m = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int n = sc.nextInt();
        long sum=0;
        for(int i=m;i<=n;i++){
            sum += i;
        }
        System.out.println("The sum form m to n numbers is "+sum);
    }
}