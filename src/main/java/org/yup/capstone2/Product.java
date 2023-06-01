package org.yup.capstone2;
public class Product {
    private String name;
    private double totalPrice;

    public Product(String name, double totalPrice) {
        this.name = name;
        this.totalPrice = totalPrice;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
