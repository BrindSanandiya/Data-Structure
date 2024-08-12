
import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {
        Employee_Detail emp1 = new Employee_Detail();
        emp1.Employee_Detail();
        emp1.Display();
    }

  
}

class Employee_Detail {

    int Employee_ID;
    String name;
    String designation;
    double salary;

    public void Employee_Detail() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        this.Employee_ID = sc.nextInt();
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter designation: ");
        this.designation = sc.nextLine();
        System.out.print("Enter salary: ");
        this.salary = sc.nextDouble();
    }
    public void Display(){
        System.out.println(this.Employee_ID);
        System.out.println(this.name);
        System.out.println(this.designation);
        System.out.println(this.salary);
    }

}