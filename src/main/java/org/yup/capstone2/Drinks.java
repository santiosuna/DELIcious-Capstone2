package org.yup.capstone2;

import java.util.List;

public class Drinks extends Product {

    private Size size;
    private DrinkFlavor myDrinks;

    public Drinks(String name, double totalPrice, Size size) {
        super(name, totalPrice);
        this.size = size;
    }

    public Size getSize() {
        return size;

    }

    public void setSize(Size size) {
        this.size = size;
    }
}


