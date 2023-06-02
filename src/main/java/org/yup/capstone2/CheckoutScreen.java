//package org.yup.capstone2;
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;
//
//public class CheckoutScreen {
//    //needs an order List??
//
//    private List<Product> cart;
//    private List<String> order;
//    private List<Product> products;
//    private boolean isCheckingOut = true;
//
//    public CheckoutScreen(List<String> order) {
//        this.order = order;
//    }
//
//    //Checkout Class needs to have a calculate total method - CHECK
//    public double calculateTotal() {
//        double totalPrice = 0;
//        totalPrice = calculateSubtotal() + calculateSalesTax();
//
//        return totalPrice;
//    }
//    public double calculateSubtotal() {
//        double subtotal;
//        subtotal = sandwich.getPrice() + drink.getPrice() + chips.getPrice();
//
//        return subtotal;
//    }
//    public double calculateSalesTax() {
//       final double taxPercentage = .06;
//       double salesTax;
//
//        salesTax = calculateSubtotal() * taxPercentage;
//
//        return salesTax;
//    }
//    public void checkout() throws IOException {
//        while (isCheckingOut) {
//            Scanner scan = new Scanner(System.in);
//
//            //sout(order)
//            System.out.println(order); //can break this up further. Order list that uses
//            //for loop to get the name of the sandwich.
//
//            //souf(Order Total: %.2f, calculateTotal() )
//            System.out.printf("Order Total: %.2f", calculateTotal());
//
//            //sout(would you like to proceed with checkout Y/N)
//            System.out.println("Would you like to proceed with checkout? Y/N");
//            String selection = scan.nextLine().toUpperCase();
//
//            switch (selection) {
//                //-> if Y:
//                case "Y":
//                    // - sout(Would you like to pay with 1) Cash or 2)Debit ?)
//                    System.out.println("How would you like to pay?");
//                    System.out.println("1) Cash");
//                    System.out.println("2) Debit");
//                    int paymentMethod = scan.nextInt();
//
//                    if (paymentMethod == 1) {
//                        System.out.println("Thank You for ordering from DELI-cious!");
//
//                    } else if (paymentMethod == 2) {
//                        System.out.println("1) Swipe, 2) Insert, or 3) Tap your card");
//                        int payFunction = scan.nextInt();
//                        if (payFunction == 3) {
//                            System.out.println("Approved!\n");
//                            System.out.println("Thank You for ordering from DELI-cious!");
//                        } else {
//                            System.out.println("Enter your pin");
//                            int pin = scan.nextInt();
//                            System.out.println("Approved!\n");
//                            System.out.println("Thank You for ordering from DELI-cious!");
//
//                            //TODO: end the program
//                            exitApp();
//                        }
//                    } else {
//                        System.out.println("Please enter a valid selection.");
//                    }
//                    break;
//                case "N":
//                    //loop back into checkout start
//                    break;
//                default:
//                    System.out.println("Please enter a valid selection");
//            }
//        }
//    }
//
//    public void exitApp() {
//        isCheckingOut = false;
//    }
//
//    public String itemString() {
//        String itemDescription = null;
//
//        for (Product productLine : products) {
//            if (productLine instanceof Sandwich) {
//                itemDescription = String.format("%s on %s %s\t\t%.2f", sandwich.getMeat, sandwich.getBread, sandwich.getSize,sandwich.getTotalPrice);
//            } else if (!(productLine instanceof Product)) {//May have to make a drink Class and pass Drink flavors into it.
//                itemDescription = String.format("%s %s\t\t%.2f",drink.getSize,drink.getFlavor,drink.getTotalPrice);
//            } else if (productLine instanceof Chips) {
//                if (order.contains(Chips instanceof Chips))
//                itemDescription = String.format("%s\t\t%.2f", chips.getFlavor,chips.getTotalPrice);
//            }
//        }
//        return itemDescription;
//    }
//
//    public String fileNameGenerator() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your name: ");
//        String file = scanner.nextLine().toUpperCase();
//
//        return file;
//    }
//
//    public void createReceipt(List<String> order) throws IOException {//probably writing to file
//        FileWriter myWriter = new FileWriter(fileNameGenerator() + "'s receipt.txt" ,true);
//
//        myWriter.write(String.format("DELI-icious!\n" +
//                "Cashier: Bo Boberts\n" +
//                "Thank you for shopping with us!\n" +
//                "%s\n" +
//                "\"Subtotal\t\t%.2f\n" +
//                "tax (6%)\t\t%.2f" +
//                "Total Price\t\t%.2f",
//                itemString(),
//                calculateSubtotal(),
//                calculateSalesTax(),
//                calculateTotal()));
//        myWriter.close();
//    }
//
//    public void printReceipt() throws IOException {
//        FileReader fileReader = new FileReader(fileNameGenerator() + "s' receipt.txt");
//        BufferedReader myReader = new BufferedReader(fileReader);
//        String line;
//
//        myReader.readLine();
//
//        while ( (line = myReader.readLine()) != null) {
//            String[] receiptPieces = line.split("\\|");
//
//            String name =
//        }
//    }
//
//
//
//}
////     - create a receipt ( Receipt receipt = new Receipt(things that make a receipt) )
////    sout(receipt)
////    if i want to display a receipt in the terminal i've gotta be able to read my newly created receipt file??
////    but every receipt is a new file
////
////    gonna be a receipt folder where the receipts get saved in
////    each new order is a receipt
////    in filewriter figure out how to get it to generate a new filename
////    receipt is txt not csv-+-+-+-+-+
//
//
