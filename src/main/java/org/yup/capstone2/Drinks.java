package org.yup.capstone2;

public class Drinks extends Product {

    private DrinkSizes drinkSizes;
    private DrinkFlavor drinkFlavor;

    public Drinks(String name, double totalPrice, DrinkSizes drinkSizes, DrinkFlavor drinkFlavor) {
        super(name, totalPrice);
        this.drinkSizes = drinkSizes;
        this.drinkFlavor = drinkFlavor;
    }

    public DrinkSizes getSize() {
        return drinkSizes;

    }

    public void setSize(DrinkSizes drinkSizes) {
        this.drinkSizes = drinkSizes;
    }
}


