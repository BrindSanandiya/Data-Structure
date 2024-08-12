import java.util.Scanner;
public class CircleArea{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter radius of the circle");
        Double r = sc.nextDouble();
        Double area = Math.PI*r*r;
        System.out.println(area);

    }
}