package org.yup.capstone2;
import java.util.ArrayList;
import java.util.List;
class Sandwich {
    private Bread bread;
    private SandwichSizes size;
    private List<String> toppings;
    private List<String> meats;
    private List<String> cheeses;
    private List<String> sauces;
    private boolean toasted;

    public Sandwich(Bread bread, SandwichSizes size, ArrayList<String> toppings, boolean toasted) {
        this.bread = bread;
        this.size = size;
        this.toppings = new ArrayList<>();
        meats = new ArrayList<>();
        cheeses = new ArrayList<>();
        sauces = new ArrayList<>();
        this.toasted = false;
    }

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public SandwichSizes getSize() {
        return size;
    }

    public void setSize(SandwichSizes size) {
        this.size = size;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public List<String> getMeats() {
        return meats;
    }

    public void setMeats(List<String> meats) {
        this.meats = meats;
    }
}