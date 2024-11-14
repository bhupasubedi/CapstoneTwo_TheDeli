package com.ps;

import java.util.ArrayList;
import java.util.List;


public class Order {
    private List<Product> products;

    public List<Product> getProducts() {
        if (products == null) {
            products = new ArrayList<>();
        }
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotal() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "total: $" + getTotal() +
                ", products=" + products +
                '}';
    }
}

