
import java.util.Scanner;

public class Main {

    public interface User_Facility {
        public void get_details();

        public void set_details();
    }

    static void Main_menu() {
        //Main Menu:

        System.out.println("==================================: Welcome to Car Management system :======================================== ");
        System.out.println();
        System.out.println("========================================: Enter Your Choice:==================================================");
        System.out.println();
        System.out.println(" 1.) Add new Showroom \t\t\t 2.) Add new Employee \t\t\t 3.) Add New Car");
        System.out.println();
        System.out.println(" 4.) Get Showroom     \t\t\t 5.) Get Employee Detail\t\t 6.) Get Car Details");
        System.out.println();
        System.out.println("==============================================================================================================");
        System.out.println("Press your Choice...");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Showroom[] showroom = new Showroom[3];
        Employee[] employee = new Employee[3];
        Cars[] car = new Cars[3];

        int Showroom_counter = 0;
        int Employee_counter = 0;
        int Cars_counter = 0;


        int choice = 50;

        while (choice != 0) {

            Main_menu();
            choice = sc.nextInt();

            while (choice != 0 && choice != 9) {

                //Logic for the choice pressed by the user.
                switch (choice) {
                    case 1:
                        showroom[Showroom_counter] = new Showroom();
                        showroom[Showroom_counter].set_details();
                        Showroom_counter++;

                        System.out.println();
                        System.out.println("1.) Add new Showroom");
                        System.out.println("9.) Go back to Main Menu");
                        if (Showroom_counter > showroom.length - 1) {
                            System.out.println("You cannot add more than " + showroom.length + " Showrooms.");
                            break;
                        } else {
                            choice = sc.nextInt();
                            break;
                        }

                    case 2:
                        employee[Employee_counter] = new Employee();
                        employee[Employee_counter].set_details();
                        System.out.println();
                        System.out.println("2.) Add new Employee");
                        System.out.println("9.) Go back to Main Menu");
                        if (Employee_counter > employee.length - 1) {
                            System.out.println("You cannot add more than " + employee.length + " Employee.");
                            break;
                        } else {
                            choice = sc.nextInt();
                            break;
                        }

                    case 3:
                        car[Cars_counter] = new Cars();
                        car[Cars_counter].set_details();
                        System.out.println();
                        System.out.println("3.) Add anew Car");
                        System.out.println("9.) Go Back to Main Menu");
                        if (Cars_counter > car.length - 1) {
                            System.out.println("You cannot add more than " + car.length + " Cars.");
                            break;
                        } else {
                            choice = sc.nextInt();
                            break;
                        }

                    case 4:
                        for (int i = 0; i < Showroom_counter; i++) {
                            showroom[Showroom_counter].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9.) Go Back to Main Menu");
                        System.out.println("0.) Exit From Application");
                        choice = sc.nextInt();
                        break;

                    case 5:
                        for (int j = 0; j < Employee_counter; j++) {
                            employee[Employee_counter].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        employee[Employee_counter].get_details();
                        System.out.println();
                        System.out.println("9.) Go Back to Main Menu");
                        System.out.println("0.) Exit From Application");
                        choice = sc.nextInt();
                        break;

                    case 6:
                        for (int k = 0; k < Cars_counter; k++) {
                            car[Cars_counter].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        car[Cars_counter].get_details();
                        System.out.println();
                        System.out.println("9.) Go Back to Main Menu");
                        System.out.println("0.) Exit From Application");
                        choice = sc.nextInt();
                        break;

                    default:
                        System.out.println("Your Input is INVALID!!!");
                        break;


                }

            }
        }
        sc.close();


    }
}
