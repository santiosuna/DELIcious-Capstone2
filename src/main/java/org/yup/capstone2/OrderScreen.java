package org.yup.capstone2;
import java.io.IOException;
import java.util.*;

public class OrderScreen {
        private static boolean running = true;
        private static ArrayList<Product> orderCart = new ArrayList<>();
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
                        //TODO: add addSandwich to cart
                        //ex. myCart.add( addSandwich() )
                        break;
                    case 2:
                        addDrink();
                        //TODO: add addDrink to cart
                        orderCart.add(addDrink());
                        //ex. myCart.add( addDrink() )
                        break;
                    case 3:
                        addChips();
                        //TODO: add addChips to cart
                        //ex. myCart.add( addChips() )
                        orderCart.add(addChips());
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
            for (SandwichSizes size : SandwichSizes.values()) {
                System.out.println(size.ordinal() + ") " + size);
            }
            //Read the user's choice for the size
            int sizeChoice = scanner.nextInt();
            // Get the corresponding size value based on the user's choice
            SandwichSizes selectedSize = SandwichSizes.values()[sizeChoice];


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

            //TODO:ADD SANDWICH TO CART

        }
        public static Drinks addDrink() {
            Scanner scanner = new Scanner(System.in);

            double drinkPrice = 0;

            DrinkFlavor drinkFlavor = null;
            DrinkSizes size = null;
            int sizeCount = 1;
            int flavorCount = 1;

            ArrayList<DrinkFlavor> drinkInventory = new ArrayList<>();
            drinkInventory.addAll(Arrays.asList(DrinkFlavor.values()));
            Collections.sort(drinkInventory);


            ArrayList<DrinkSizes> drinkSizes = new ArrayList<>();
            drinkSizes.addAll(Arrays.asList(DrinkSizes.values()));
            Collections.sort(drinkSizes);

            System.out.println("Select your cup size: (Number) ");

            for (DrinkSizes drinkDrinkSizes : drinkSizes) {
                System.out.println(sizeCount + ") " + drinkDrinkSizes.name());
                sizeCount++;
            }

            int drinkSizeChoice = scanner.nextInt();

            if (drinkSizeChoice == 1) {
                size = DrinkSizes.SMALL;
                drinkPrice = 2.00;
            } else if (drinkSizeChoice == 2) {
                size = DrinkSizes.MEDIUM;
                drinkPrice = 2.50;
            } else if (drinkSizeChoice == 3) {
                size = DrinkSizes.LARGE;
                drinkPrice = 3.00;
            }

            System.out.println("Type your drink name:");

            for (DrinkFlavor flavors : drinkInventory) {
                System.out.println(flavorCount + ") " + flavors.name());
                flavorCount++;
            }

            scanner.nextLine();
            String flavorChoice = scanner.nextLine().toUpperCase();

            if (flavorChoice.equals("PINEAPPLEMANGO")) {
                drinkFlavor = DrinkFlavor.PINEAPPLEMANGO;
            } else if (flavorChoice.equals("ORANGE")) {
                drinkFlavor = DrinkFlavor.ORANGE;
            } else if (flavorChoice.equals("RASPBERRY")) {
                drinkFlavor = DrinkFlavor.RASPBERRY;
            } else if (flavorChoice.equals("LEMONWATER")) {
                drinkFlavor = DrinkFlavor.LEMONWATER;
            }

            Drinks drinks = new Drinks(flavorChoice,drinkPrice,size,drinkFlavor);

            System.out.println("Your " + drinkFlavor + " drink has successfully been added to your order!");

            return drinks;
        }
        public static Chips addChips() {
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

            //TODO:CHANGE CHIP PRICE
            Chips chips = new Chips(userChoice,1.50,chipFlavors);

            System.out.println("Your " + chipFlavors + " chips has successfully been added to your order!");

            return chips;

//            System.out.println(chips.getChipFlavors() + "\t\t$" + chips.getTotalPrice());
        }

        //TODO: MAKE EXIT FUNCTION
        public void exitApp () {
            running = false;
            System.out.println("Thank You, GoodBye!");
            
        }
    }
