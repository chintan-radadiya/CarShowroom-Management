import java.util.Scanner;
import java.util.UUID;


public class Employee implements Main.User_Facility {
    Scanner sc = new Scanner(System.in);
    UUID uuid = UUID.randomUUID();

    int Employee_id;
    String Employee_name;
    int Employee_Age;
    String Employee_Department;
    String Employee_Showroom;
    int Employee_Salary;

    @Override
    public void get_details() {
        System.out.println("Enter Employee ID:");
        System.out.println("Enter Employee name:");
        System.out.println("Enter Employee Age:");
        System.out.println("Enter Employee Department:");
        System.out.println("Enter Employee Showroom");
        System.out.println("Enter Employee Salary:");
    }

    public void set_details() {

        System.out.println("==================================: Enter Details of Employee :====================================================== ");
        System.out.print("Employee ID:" + Employee_id);
        Employee_id = sc.nextInt();

        System.out.print("Employee name:"+Employee_name);
        Employee_name = sc.nextLine();

        System.out.print("Employee Age:" + Employee_Age);
        Employee_Age = sc.nextInt();

        System.out.print("Employee Department:" + Employee_Department);
        Employee_Department = sc.nextLine();

        System.out.print("Employee Showroom" + Employee_Showroom);
        Employee_Showroom = sc.nextLine();

        System.out.print("Enter Employee Salary:" + Employee_Salary);
        Employee_Salary = sc.nextInt();
    }
}
