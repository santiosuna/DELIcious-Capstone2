package org.yup.capstone2;

import java.util.ArrayList;
import java.util.Scanner;

public class Chips extends Product{

    private ChipFlavors chipFlavors;

    public Chips(String name, double totalPrice, ChipFlavors chipFlavors) {
        super(name, totalPrice);
        this.chipFlavors = chipFlavors;
    }

    public ChipFlavors getChipFlavors() {
        return chipFlavors;
    }

    public void setChipFlavors(ChipFlavors chipFlavors) {
        this.chipFlavors = chipFlavors;
    }


}
