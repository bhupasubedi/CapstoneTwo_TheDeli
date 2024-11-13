package com.ps;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Product {
    private String breadType;
    private int size;
   private boolean isToasted;
   private List<Topping> toppings = new ArrayList<>();


    public Sandwich(String breadType, int size, boolean isToasted) {
        this.breadType = breadType;
        this.size = size;
        this.isToasted = isToasted;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    @Override
    double getPrice() {
        double sandwichSizePrice = 0.0;
        double totalToppingPrice = getTotalToppingPrice();
        if (4 == this.size) {
            sandwichSizePrice = 5.50;
        } else if (8 == this.size) {
            sandwichSizePrice = 7.0;
        } else {
            sandwichSizePrice = 8.50;
        }
        return sandwichSizePrice + totalToppingPrice;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    double getTotalToppingPrice() {
        double totalToppingPrice = 0.0;
        for (Topping topping: toppings) {
            totalToppingPrice += topping.getPrice();
        }
        return totalToppingPrice;
    }
}
