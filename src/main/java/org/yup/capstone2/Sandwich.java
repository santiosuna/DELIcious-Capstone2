package org.yup.capstone2;
import java.util.ArrayList;
import java.util.List;

class Sandwich {
    private String bread;
    private String size;
    private List<String> toppings;
    private List<String> meats;
    private List<String> cheeses;
    private List<String> sauces;
    private boolean toasted;

    public Sandwich(String bread, String size) {
        this.bread = bread;
        this.size = size;
        toppings = new ArrayList<>();
        meats = new ArrayList<>();
        cheeses = new ArrayList<>();
        sauces = new ArrayList<>();
        toasted = false;
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

    public List<String> getCheeses() {
        return cheeses;
    }

    public void setCheeses(List<String> cheeses) {
        this.cheeses = cheeses;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public void setSauces(List<String> sauces) {
        this.sauces = sauces;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public void addMeat(String meat) {
        meats.add(meat);
    }

    public void addCheese(String cheese) {
        cheeses.add(cheese);
    }

    public void addSauce(String sauce) {
        sauces.add(sauce);
    }

    // Implement additional methods as needed
}


}
