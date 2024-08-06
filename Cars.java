import java.util.Scanner;

public class Cars implements Main.User_Facility{

    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission_type;


    Scanner sc =new Scanner(System.in);

    @Override
    public void get_details() {

        System.out.println("Car name:"+car_name);
        System.out.println("Car color:");
        System.out.println("Car fuel Type:");
        System.out.println("Car price:");
        System.out.println("Car Type:");
        System.out.println("Car transmission:");
    }

    @Override
    public void set_details() {

        System.out.println("==================================: Enter Details of Cars :====================================================== ");
        System.out.print("Enter Car name:");
        car_name = sc.nextLine();

        System.out.print("Enter Car color:");
        car_color = sc.nextLine();

        System.out.print("Enter Car fuel Type [Petrol/Diesel]:");
        car_fuel_type = sc.nextLine();

        System.out.print("Enter Car price:");
        car_price = sc.nextInt();

        System.out.print("Enter Car Type [Chotu/Sedan/SUV]:");
        car_type = sc.nextLine();

        System.out.print("Enter Car transmission [Auto/Manual]:");
        car_transmission_type = sc.nextLine();

    }
}
