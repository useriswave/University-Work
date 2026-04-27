package com.me.assessment2.mock3.tests;

import com.me.assessment2.mock3.products.Book;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class BookTest {
    @Test
    public void testCalculateShippingCost() {
        Book b1 = new Book("Harold", 60, "Harry Potter", 64.99);
        double expected = 0.6;
        assertEquals(expected, b1.getShippingCost(), 0.01);
    }

    @Test
    public void testGetFinalPrice() {
        Book b1 = new Book("Harold", 60, "Harry Potter", 64.99);
        assertEquals(65.59, b1.getFinalPrice(), 0.01);
    }

    @Test
    public void testBooksWithSameNameAndAuthorEquals() {
        Book b1 = new Book("Harold", 60, "Harry Potter", 64.99);
        Book b2 = new Book("Harold", 39, "Harry Potter", 84.23);

        assertEquals(true, b1.equals(b2));
    }

    @Test
    public void testBooksWithSameNameButDifferentAuthorsNotEquals() {
        Book b1 = new Book("Harold", 60, "Harry Potter", 64.99);
        Book b2 = new Book("Jerry", 39, "Harry Potter", 84.23);

        assertEquals(false, b1.equals(b2));
    }

    @Test
    public void testToString() {
        Book b1 = new Book("Harold", 60, "Harry Potter", 64.99);
        String expected = "name: Harry Potter, price: 64.99, author: Harold, number of pages: 60";

        assertEquals(expected, b1.toString());
    }
}