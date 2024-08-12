import java.util.Scanner;

public class Power{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();
        int ans=1;
        for(int i=1;i<=power;i++){
            ans = ans*number;
        }
        System.out.println(ans);
    }
}