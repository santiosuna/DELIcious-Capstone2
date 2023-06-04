package org.yup.capstone2;
import java.io.IOException;
import java.util.Scanner;
class HomeScreen {

    public static void homeScreenDisplay() throws IOException {
        boolean validChoice = false;
        Scanner scanner = new Scanner(System.in);

        while (!validChoice) {
            System.out.println("════════════════════════════════════════════════");
            System.out.println("                ◩ HOME SCREEN ◪                 ");
            System.out.println("════════════════════════════════════════════════");
            System.out.println("Please make a selection:");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.println("════════════════════════════════════════════════");
            System.out.println("Enter your selection here:");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Code to handle new order
                    OrderScreen.display();
                    break;
                case 0:
                    System.out.println("\n◢◤◢◤◢◤◢◤◢◤◢◤◢◤ Exiting App. Goodbye! ◢◤◢◤◢◤◢◤◢◤◢◤◢◤\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again!");

            }
        }
    }
}

