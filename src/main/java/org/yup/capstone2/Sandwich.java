package org.yup.capstone2;
import java.util.ArrayList;
import java.util.List;
class Sandwich extends Product {
    private String bread;
    private String size;
    private List<String> toppings;
    private List<String> meats;
    private List<String> cheeses;
    private List<String> sauces;
    private boolean toasted;

    public Sandwich(String name, double totalPrice, String bread, String size, List<String> toppings, List<String> cheeses, List<String> sauces, boolean toasted) {
        super(name, totalPrice);
        this.bread = bread;
        this.size = size;
        this.toppings = toppings;
        this.cheeses = cheeses;
        this.sauces = sauces;
        this.toasted = toasted;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
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