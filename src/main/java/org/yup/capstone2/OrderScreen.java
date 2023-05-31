package org.yup.capstone2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
    public class OrderScreen {

        private static boolean running = true;

        public static void display() throws IOException {

            while (running) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Welcome to the DELI-cious app!");
                System.out.println("1) Add Sandwich \n");
                System.out.println("2) Add Drink \n");
                System.out.println("3) Add Chips \n");
                System.out.println("4) Checkout \n");
                System.out.println("0) Cancel Order \n");
                int userSelection = scan.nextInt();

                switch (userSelection) {
                    case 1:
                        //addSandwichMethod();
                        //
                        break;
                    case 2:
                        //addDrinkMethod();
                        break;
                    case 3:
                        //addChipsMethod();
                        break;
                    case 4:
                        //if they have empty order -> sout(Your cart is empty.)
                        //else :
                        //checkoutOrderMethod();
                        break;
                    case 0:
                        //cancelOrderMethod();
                        break;
                    default:
                        System.out.println("Sorry but that wasn't a valid selection");
                }
            }

        }

        //the Processes
        public static void addSandwich() {


        }
        public static void addDrink() {
            //for loop that displays the drinks??
           //they choose a drink, it goes to the order.
        }
        public static void addChips() {
            //for loop that displays the chips
            //they choose a chip, it goes into the order
        }

        //TODO: MAKE EXIT FUNCTION
        public void exitApp () {
            running = false;
            System.out.println("Thank You, GoodBye!");
        }
    }
