package org.yup.capstone2;

import java.util.List;

public class Drinks extends Product {

    private String size;
    private DrinkFlavor myDrinks;

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

    public enum Size {
        SMALL ("S"),
        MEDIUM ("M"),
        LARGE ("L");

        private final String displayName;

        Size(String displayName){
            this.displayName = displayName;
        }
        public String getDisplayName() {
            return displayName;
        }
    }
}

