package com.ps;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Product {
    private String breadType;
    private int size;
   private boolean isToasted;
   private List<Topping> toppings;


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

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public List<Topping> getToppings() {
        if (toppings == null) {
           toppings = new ArrayList<>();
        }
        return toppings;
    }

    @Override
    double getPrice() {
        double sandwichSizePrice = 0.0;
        double totalToppingPrice = getTotalToppingPrice();
        if (4 == this.size) {
            sandwichSizePrice = 5.50;
        } else if (8 == this.size) {
            sandwichSizePrice = 7.0;
        } else if (12 == this.size) {
            sandwichSizePrice = 8.50;
        }
        return sandwichSizePrice + totalToppingPrice;
    }

    double getTotalToppingPrice() {
        double totalToppingPrice = 0.0;
        for (Topping topping: toppings) {
            totalToppingPrice += topping.getPrice();
        }
        return totalToppingPrice;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "breadType='" + breadType + '\'' +
                ", size=" + size +
                ", isToasted=" + isToasted +
                ", toppings=" + toppings +
                '}';
    }

}
