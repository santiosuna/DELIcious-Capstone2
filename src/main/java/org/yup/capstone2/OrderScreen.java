package org.yup.capstone2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
    public class OrderScreen {

        private boolean running = true;

        public void display() throws IOException {

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
            //code that adds a sandwich but includes logic that
            //builds th sandwich
            //attaches prices to every part
            //Makes a new sandwich. Maybe using different constructors???
            //Sandwich sandwich = new Sandwich(things that make a sandwich)
            //sandwich goes into order
        }
        public static void addDrink() {
            //for loop that displays the drinks??
           //they choose a drink, it goes to the order.
        }
        public static void addChips() {
            //for loop that displays the chips
            //they choose a chip, it goes into the order
        }
        public static void checkOut() {
            //sout(order)
            //souf(Order Total: %.2f, calculateTotal() )
            //sout(would you like to proceed with checkout Y/N)
            //-> if Y:
            // - sout(Would you like to pay with 1) Cash or 2)Debit ?)
            //      - if (userSelection.equals("cash").toLowerCase){
            //      sout(Swipe, Insert, or Tap your card)
            //      String payfunction = scan.nextLine().toLowerCase;
            //          if(payfunction.equals(tap) ):
            //                  sout(Approved!)
            //                  sout(Thank You for ordering from DELI-cious) }
            //                  else:
            //      sout(Enter your pin)
            //      int Pin = scan.nextInt();
            //      sout(Approved!)
            //      sout(Thank You for ordering from DELI-cious)
            //      )
            // - create a receipt ( Receipt receipt = new Receipt(things that make a receipt) )
            //sout(receipt)
            //if i want to display a receipt in the terminal i've gotta be able to read my newly created receipt file??
            //but every receipt is a new file

            //Checkout Class needs to have a calculate total method
            //exitApp()
        }

        //TODO: MAKE EXIT FUNCTION
        public void exitApp () {
            running = false;
            System.out.println("Thank You, GoodBye!");
        }
    }
