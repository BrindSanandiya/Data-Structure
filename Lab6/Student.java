import java.util.Scanner;

public class Student{
    public static void main(String[] args) {
        
    }
}
class Student_Detail{
    int enrollment;
    String name;
    int sem;
    int CPI;
    private int Student_Detail;
    private String designation;
    private double salary;

    public void Student_Detail() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Enrollment: ");
        this.Student_Detail = sc.nextInt();
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter designation: ");
        this.designation = sc.nextLine();
        System.out.print("Enter salary: ");
        this.salary = sc.nextDouble();
    }
}
