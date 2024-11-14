package com.ps;

public class Drink extends Product{
   private String flavor;
   private String size;

   public Drink(String flavor, String size) {
      this.flavor = flavor;
      this.size = size;
   }

   public String getFlavor() {
      return flavor;
   }

   public void setFlavor(String flavor) {
      this.flavor = flavor;
   }

   public String getSize() {
      return size;
   }

   public void setSize(String size) {
      this.size = size;
   }

   @Override
   double getPrice() {
      double drinkPrice = 0.0;
      if ("small".equalsIgnoreCase(this.getSize())) {
         drinkPrice = 2.0;
      } else if ("medium".equalsIgnoreCase(this.getSize())) {
         drinkPrice = 2.50;
      } else if ("large".equalsIgnoreCase(this.getSize())){
         drinkPrice = 3.00;
      }
      return drinkPrice;
   }

   @Override
   public String toString() {
      return "Drink{" +
              "flavor='" + flavor + '\'' +
              ", size='" + size + '\'' +
              ", price='" + getPrice() +
              '}';
   }
}
