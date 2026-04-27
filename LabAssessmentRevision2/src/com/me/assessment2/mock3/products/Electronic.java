package com.me.assessment2.mock3.products;

import com.me.assessment2.mock3.interfaces.Shippable;
import com.me.assessment2.mock3.interfaces.Taxable;

public class Electronic extends Product implements Taxable, Shippable {
    private String brand;
    private double weight;

    public Electronic(String name, double price, String  brand, double weight) {
        super(name, price);
        this.brand = brand;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return super.toString() + " brand: " + brand + ", weight: " + weight;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null || o.getClass() != getClass()) return false;
        return this.getName().equals(((Electronic)o).getName()) &&
                this.brand.equals(((Electronic)o).getBrand());
    }

    @Override
    public double getTax() {
        return this.getPrice() * TAX_RATE;
    }

    @Override
    public double getShippingCost() {
        return this.getWeight() * 2;
    }

    @Override
    public double getFinalPrice() {
        return getPrice() + getTax() + getShippingCost();
    }
}
