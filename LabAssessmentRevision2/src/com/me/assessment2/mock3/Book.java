package com.me.assessment2.mock3;

public class Book extends Product implements Shippable {
    private String author;
    private int numPages;

    public Book(String author, int numPages, String name, double price) {
        super(name, price);
        this.author = author;
        this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumPages() {
        return numPages;
    }

    @Override
    public String toString() {
        return super.toString() + ", author: " + author + ", number of pages: " + numPages;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null || getClass() != o.getClass()) return false;
        return this.getName().equals(((Book) o).getName()) && getAuthor().equals(((Book) o).getAuthor());
    }

    @Override
    public double getShippingCost() {
        return numPages * 0.01;
    }

    @Override
    public double getFinalPrice() {
        return getPrice() + getShippingCost();
    }
}
