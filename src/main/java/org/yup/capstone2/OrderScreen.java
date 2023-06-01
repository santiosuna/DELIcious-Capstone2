package org.yup.capstone2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

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
                        addChips();
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
            Scanner scanner = new Scanner(System.in);

            ChipFlavors chipFlavors = null;
            int count = 1;

            ArrayList<ChipFlavors> chipInventory = new ArrayList<>();
            chipInventory.addAll(Arrays.asList(ChipFlavors.values()));
            Collections.sort(chipInventory);


            System.out.println("Choose your chips: ");

            for (ChipFlavors myChips : chipInventory ) {

                System.out.println(count + ") " + myChips.name());
                count++;
            }

            String userChoice = scanner.nextLine().toUpperCase();

            if (userChoice.equals("HOTFRIES")) {
                chipFlavors = ChipFlavors.HOTFRIES;
            } else if (userChoice.equals("RANCHDORITOS")) {
                chipFlavors = ChipFlavors.RANCHDORITOS;
            } else if (userChoice.equals("SPICYNACHODORITOS")) {
                chipFlavors = ChipFlavors.SPICYNACHODORITOS;
            } else if (userChoice.equals("RUFFLES")) {
                chipFlavors = ChipFlavors.RUFFLES;
            }

            Chips chips = new Chips(userChoice,2.25,chipFlavors);

            //TODO:ADD CHIPS TO CART

            System.out.println(chips.getChipFlavors() + "\t\t$" + chips.getTotalPrice());
        }

        //TODO: MAKE EXIT FUNCTION
        public void exitApp () {
            running = false;
            System.out.println("Thank You, GoodBye!");
        }
    }
