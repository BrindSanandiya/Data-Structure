import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int Factorial=1;
    for(int i=1;i<=number;i++){
        Factorial=Factorial*i;
    }
    System.out.println(Factorial);
    }
}

    