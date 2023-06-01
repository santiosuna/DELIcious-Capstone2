package org.yup.capstone2;

public class Drinks extends Product {

    private String size;

    public Drinks(String name, double totalPrice, String size) {
        super(name, totalPrice);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public enum drinkFlavor {
        PINEAPPLEMANGO,
    }
}

