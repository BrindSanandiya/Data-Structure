import java.util.Scanner;

public class Avg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        long sum=0;
        for(int i=1;i<=number;i++){
            sum += i;
        }
        double avg;
        avg = sum/number;
        System.out.println("Avg. is "+avg);
        
    }
}