import java.util.Scanner;

public class Showroom implements Main.User_Facility {
    String Showroom_name;
    String Showroom_Location;
    String Showroom_Manager;
    int Employee_count;
    int car_capacity;


    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);

        System.out.println("==================================: Enter Details of Showroom :====================================================== ");
        System.out.print("Enter Showroom name:");
         Showroom_name = sc.nextLine();

        System.out.print("Enter Showroom location:");
        Showroom_Location = sc.nextLine();

        System.out.print("Enter Manager name:");
        Showroom_Manager = sc.nextLine();

        System.out.print("Enter Employee Strength:");
        Employee_count = sc.nextInt();

        System.out.print("Enter Car Capacity:");
        car_capacity = sc.nextInt();
        sc.close();
    }

    @Override
    public void get_details() {
        System.out.println("Showroom name:"+Showroom_name);
        System.out.println("Showroom location:" + Showroom_Location);
        System.out.println("Manager name:" + Showroom_Manager);
        System.out.println("Employee Strength:" + Employee_count);
        System.out.println("Car Capacity:" + car_capacity);
    }
}
