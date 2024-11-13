package com.ps;

import java.util.ArrayList;
import java.util.List;


public class Order {
    private List<Product> products = new ArrayList<>();

    public double getTotal() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

