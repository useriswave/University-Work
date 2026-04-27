package com.me.assessment2.mock3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProductTest {

    @Test
    public void testEquals() {
        Product p1 = new Book("John", 312, "Harry Potter", 64.5);
        Product p2 = new Book("Harold", 438, "Diary of wimpy kid", 23.48);

        assertEquals(false, p1.equals(p2));
    }
}