package com.me.assessment2.mock1;

public class DiscountFoodItem extends FoodItem {
   private double discount;

   public DiscountFoodItem(double d, String n, double p) {
       super(n, p);
       this.discount = d;
   }

   public double getDiscount() {
       return discount;
    }

    public void setDiscount(double d) {
       this.discount = d;
    }

    @Override
    public double getBill() {
       return this.getPrice() * (1 - (discount /100));
    }

    @Override
    public String toString() {
       return super.toString() + ", discount: " + discount;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null || o.getClass() == this.getClass()) return true;
        DiscountFoodItem dfo = (DiscountFoodItem)o;
        return super.equals(dfo) && this.discount == dfo.discount;
    }
}
