package com.me.assessment2.mock3;

/**
 * Represents a product in a store.
 * A product has a name and a price. and can change the name and price, and calculate the final price.
 */
public abstract class Product implements Comparable<Product> {
    private String name;
    private double price;

    /**
     * Initializes a Product object with a name and a price
     * @param name
     * @param price
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Gives the name of the Product object.
     * @return the String name associated with the Product object.
     */
    public String getName() {
        return name;
    }

    /**
     * Gives the price of the Product object.
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     *  sets the price variable of the Product object to a new value.
     * @param p
     */
    public void setPrice(double p) {
        price = p;
    }

    /**
     * Creates a string representation of the Product object by returning its name and price in a formatted structure.
     * @return a String representation of the object
     */
    @Override
    public String toString() {
        return "name: " + name + ", price: " + price;
    }

    /**
     * Calculates the final price of a Product object.
     * @return double of final price
     */
    public abstract double getFinalPrice();

    /**
     * Checks if two Product objects have the same name
     * @param o
     * @return true if names are equal to each other. Otherwise, false
     */
    @Override
    public boolean equals(Object o) {
        if(o == null || getClass() != o.getClass()) return false;
        return this.name.equals(((Product)o).getName());
    }

    /**
     * Compares two Product objects based on their price.
     * @param p
     * @return -1 if the object's price is less than the passed in object.
     * 1 if the object's price is greater than the passed in object.
     * 0 if the prices are equal to each other.
     */
    @Override
    public int compareTo(Product p) {
        return Integer.compare((int) this.price, (int) p.price);
    }
}
