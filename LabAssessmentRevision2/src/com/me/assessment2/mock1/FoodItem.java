package com.me.assessment2.mock1;

public class FoodItem {
    private String name;
    private double price;

    public FoodItem(String n, double p) {
        this.name = n;
        this.price = p;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getBill() {
        return price;
    }

    public void setPrice(double p) {
        this.price = p;
    }

    public void setName(String n) {
        this.name = n;
    }

    @Override
    public String toString() {
        return "name: " + name + "price: " + price;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null || o.getClass() != this.getClass()) return false;

        FoodItem fo = (FoodItem)o;
        return this.name.equals(fo.name) && this.price == fo.price;
    }
}