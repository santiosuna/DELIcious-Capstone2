package org.yup.capstone2;

import java.util.List;

public class Drinks extends Product {

    private Size size;
    private DrinkFlavor drinkFlavor;

    public Drinks(String name, double totalPrice, Size size, DrinkFlavor drinkFlavor) {
        super(name, totalPrice);
        this.size = size;
        this.drinkFlavor = drinkFlavor;
    }

    public Size getSize() {
        return size;

    }

    public void setSize(Size size) {
        this.size = size;
    }
}


