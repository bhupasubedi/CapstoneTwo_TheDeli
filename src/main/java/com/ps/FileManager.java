package com.ps;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public void saveReceipt(Order order) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("receipt.csv", true))) {
            if (order instanceof Order) {
                Order ordersReceipt = (Order) order;
                String orderSaleReceipt = order.toString();
                bufferedWriter.write(orderSaleReceipt + "\n");


            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}