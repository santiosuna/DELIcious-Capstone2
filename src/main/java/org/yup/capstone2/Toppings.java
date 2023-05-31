package org.yup.capstone2;
import java.util.ArrayList;

public class Toppings {
    private ArrayList<Meats> meats;
    private ArrayList<Cheese> cheeses;
    private ArrayList<Sauces> sauces;
    private ArrayList<RegularToppings> regularToppings;
    private ArrayList<Toppings> allToppings;



    public Toppings(ArrayList<Meats> meats, ArrayList<Cheese> cheeses, ArrayList<Sauces> sauces, ArrayList<RegularToppings> regularToppings,
                    ArrayList<Toppings> allToppings) {
        this.meats = meats;
        this.cheeses = cheeses;
        this.sauces = sauces;
        this.regularToppings = regularToppings;
        this.allToppings = allToppings;

    }

    public ArrayList<Meats> getMeats() {
        return meats;
    }

    public void setMeats(ArrayList<Meats> meats) {
        this.meats = meats;
    }

    public ArrayList<Cheese> getCheeses() {
        return cheeses;
    }

    public void setCheeses(ArrayList<Cheese> cheeses) {
        this.cheeses = cheeses;
    }

    public ArrayList<Sauces> getSauces() {
        return sauces;
    }

    public void setSauces(ArrayList<Sauces> sauces) {
        this.sauces = sauces;
    }

    public ArrayList<RegularToppings> getRegularToppings() {
        return regularToppings;
    }

    public void setRegularToppings(ArrayList<RegularToppings> regularToppings) {
        this.regularToppings = regularToppings;
    }

    public ArrayList<Toppings> getAllToppings() {
        return allToppings;
    }

    public void setAllToppings(ArrayList<Toppings> allToppings) {
        this.allToppings = allToppings;
    }

    public void addCheese(ArrayList<Cheese>cheeseToppings) {
        cheeseToppings.add(Cheese.CHEDDAR);
        cheeseToppings.add(Cheese.PROVOLONE);
        cheeseToppings.add(Cheese.SWISS);
        cheeseToppings.add(Cheese.AMERICAN);

    }
    public void addMeats(ArrayList<Meats>meatsToppings) {
        meatsToppings.add(Meats.STEAK);
        meatsToppings.add(Meats.HAM);
        meatsToppings.add(Meats.BACON);
        meatsToppings.add(Meats.SALAMI);
        meatsToppings.add(Meats.CHICKEN);
        meatsToppings.add(Meats.ROAST_BEEF);

    }

    public void addSauces(ArrayList<Sauces>saucesToppings) {
        saucesToppings.add(Sauces.MUSTARD);
        saucesToppings.add(Sauces.MAYO);
        saucesToppings.add(Sauces.VINAIGRETTE);
        saucesToppings.add(Sauces.THOUSAND_ISLANDS);
        saucesToppings.add(Sauces.RANCH);
        saucesToppings.add(Sauces.KETCHUP);
    }

    public void addRegularToppings(ArrayList<RegularToppings>regularToppings) {
        regularToppings.add(RegularToppings.JALAPENOS);
        regularToppings.add(RegularToppings.LETTUCE);
        regularToppings.add(RegularToppings.TOMATOES);
        regularToppings.add(RegularToppings.GUACAMOLE);
        regularToppings.add(RegularToppings.PICKLES);
        regularToppings.add(RegularToppings.ONIONS);
        regularToppings.add(RegularToppings.MUSHROOMS);
        regularToppings.add(RegularToppings.CUCUMBERS);
        regularToppings.add(RegularToppings.PEPPERS);
    }
}