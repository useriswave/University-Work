package practice;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @org.junit.jupiter.api.Test
    void getDiscountedPriceTest() {
        var item1 = new Item("Green apple", 132498229, 34.99);
        assertEquals(17.495, item1.getDiscountedPrice(50));
    }
}