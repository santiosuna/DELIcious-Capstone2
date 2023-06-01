package org.yup.capstone2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
    public class OrderScreen {
        private static boolean running = true;
        public static void display() throws IOException {

            while (running) {
                Scanner scan = new Scanner(System.in);
                System.out.println("════════════════════════════════════════════════");
                System.out.println("                ORDER SCREEN                    ");
                System.out.println("════════════════════════════════════════════════");
                System.out.println("Please make a selection:\n");
                System.out.println("1) Add Sandwich \n");
                System.out.println("2) Add Drink \n");
                System.out.println("3) Add Chips \n");
                System.out.println("4) Checkout \n");
                System.out.println("0) Cancel Order \n");
                System.out.println("════════════════════════════════════════════════");
                System.out.println("Enter your selection here:");

                int userSelection = scan.nextInt();

                switch (userSelection) {
                    case 1:
                        addSandwich();
                        break;
                    case 2:
                        //addDrinkMethod();
                        break;
                    case 3:
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
        public static void addSandwich() {
            //Create a new scanner object to read user input
            Scanner scanner = new Scanner(System.in);

            //Ask the user if they want the sandwich toasted
            System.out.println("Would you like the sandwich toasted (YES/NO):");
            String toastedInput = scanner.nextLine();
            boolean toasted = toastedInput.equalsIgnoreCase("yes");


            //Ask the user to select the sandwich size
            System.out.println("Select your size:");
            //Iterate over each size option and display it to the user
            for (Size size : Size.values()) {
                System.out.println(size.ordinal() + ") " + size);
            }
            //Read the user's choice for the size
            int sizeChoice = scanner.nextInt();
            // Get the corresponding size value based on the user's choice
            Size selectedSize = Size.values()[sizeChoice];


            //Ask the user to select the bread
            System.out.println("Select your bread:");
            //Iterate over each bread option and display it to the user
            for (Bread bread : Bread.values()) {
                System.out.println(bread.ordinal() + ") " + bread);
            }
            //Read the user's choice for the bread
            int breadChoice = scanner.nextInt();
            //Get the corresponding bread value based on the user's choice
            Bread selectedBread = Bread.values()[breadChoice];


            //Ask the user to select the cheese
            System.out.println("Select your cheese: ");
            // Iterate over each cheese option and display it to the user
            for (Cheese cheese : Cheese.values()) {
                System.out.println(cheese.ordinal() + ") " + cheese);
            }
            //Read the user's choice for the cheese
            int cheeseChoice = scanner.nextInt();
            // Get the corresponding cheese value based on the user's choice
            Cheese selectedCheese = Cheese.values()[cheeseChoice];


            //Ask the user to select the meats
            System.out.println("Select your meats:");
            // Iterate over each meats option and display it to the user
            for (Meats meats : Meats.values()) {
                System.out.println(meats.ordinal() + ") " + meats);
            }
            //Read the user's choice for the meats
            int meatsChoice = scanner.nextInt();
            //Get the corresponding meats value based on the user's choice
            Meats selectedMeats = Meats.values()[meatsChoice];


            //Ask the user to select the regular toppings
            System.out.println("Select your regular toppings: ");
            // Iterate over each regular toppings option and display it to the user
            for (RegularToppings regularToppings : RegularToppings.values()) {
                System.out.println(regularToppings.ordinal() + ") " + regularToppings);
            }
            //Read the user's choice for the regular toppings
            int regularToppingsChoice = scanner.nextInt();
            //Get the corresponding regular toppings value based on the user's choice
            RegularToppings selectedRegularToppings = RegularToppings.values()[regularToppingsChoice];


            //Ask the user to select the sauces
            System.out.println("Select your sauces: ");
            //Iterate over each sauces option and display it to the user
            for (Sauces sauces : Sauces.values()) {
                System.out.println(sauces.ordinal() + ") " + sauces);
            }
            //Read the user's choice for the sauces
            int saucesChoice = scanner.nextInt();
            //Get the corresponding sauces value based on the user's choice
            Sauces selectedSauces = Sauces.values()[saucesChoice];

            System.out.println("\nSandwich has been ordered successfully!\n");

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
