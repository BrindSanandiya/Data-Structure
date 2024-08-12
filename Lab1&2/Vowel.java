import java.util.Scanner;

public class Vowel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any alphabet: ");
        char a = sc.next().charAt(0);
        a = Character.toLowerCase(a);
        if(a=='a' || a=='e' || a=='i' || a=='o'||a=='u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Not a vowel");
        }
    }
}