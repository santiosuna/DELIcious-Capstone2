package org.yup.capstone2;
import java.io.IOException;
import java.util.Scanner;
class HomeScreen {
    public static void homeScreenDisplay() throws IOException {

        System.out.println("\nWelcome to the DELI-cious app!");
        System.out.println("════════════════════════════════════════════════");
        System.out.println("                HOME SCREEN                     ");
        System.out.println("════════════════════════════════════════════════");
        System.out.println("Please make a selection:");
        System.out.println("1) New Order");
        System.out.println("0) Exit");
        System.out.println("════════════════════════════════════════════════");
        System.out.println("Enter your selection here:");

        //creates a new Scanner object called scanner that reads input from the standard input stream (System.in)
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        //Check the user's choice using a switch statement
        switch (choice) {
            //if choice is 1 call the display() method from the OrderScreen class
            case 1:
                OrderScreen.display();
                break;
            //if choice is 2 display exit message and terminate the app
            case 0:
                System.out.println("\n◢◤◢◤◢◤◢◤◢◤◢◤◢◤ Exiting App. Goodbye! ◢◤◢◤◢◤◢◤◢◤◢◤◢◤\n");
                System.exit(0);
                break;
            //if the choice is neither 1 nor 0 display an error message
            default:
                System.out.println("Invalid choice. Please try again!");
        }
    }
}

