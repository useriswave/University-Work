package practice;

public class Item {
    private final long itemId;
    private final String itemName;
    private double itemPrice;

    public Item(String itemName, long itemId, double itemPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public double getDiscountedPrice(double discountPercentage) {
         return this.itemPrice * (discountPercentage / 100);
    }
}
