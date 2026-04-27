package com.me.assessment2.mock1;

public class Main {
    public static void main(String[] args) {
        FoodItem foodItem1 = new FoodItem("Apple", 30.99);
        FoodItem foodItem2 = new FoodItem("Meat", 82.99);
        FoodItem foodItem3 = new FoodItem("Chicken", 29.32);
        DiscountFoodItem discountFoodItem1 = new DiscountFoodItem(30,"Coffee", 4.32);
        DiscountFoodItem discountFoodItem2 = new DiscountFoodItem(30,"Turkey", 8.43);
        DiscountFoodItem discountFoodItem3 = new DiscountFoodItem(30,"Coffee", 9.95);

        FoodItem[] order = {foodItem1, foodItem2, foodItem3, discountFoodItem1, discountFoodItem2, discountFoodItem3};

        double total = 0;
        for(FoodItem item : order) {
            total += item.getBill();
        }

        int count = 0;
        for(FoodItem item : order) {
            if(item instanceof DiscountFoodItem) count++;
        }

        System.out.println(foodItem1.equals(foodItem2));
    }
}