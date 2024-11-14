package com.ps;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public void saveReceipt(Order order, String fileName, String orderPerson, String dateTime) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true))) {
            String orderSaleReceipt = "order for: " + orderPerson  + "\n" + "order placed on: " + dateTime + "\n" + order.toString();
            bufferedWriter.write(orderSaleReceipt + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}