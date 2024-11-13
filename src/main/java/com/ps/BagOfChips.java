package com.ps;

public class BagOfChips extends Product{
   private String flavor;

   public BagOfChips(String flavor) {
      this.flavor = flavor;
   }

   public String getFlavor() {
      return flavor;
   }

   public void setFlavor(String flavor) {
      this.flavor = flavor;
   }

   @Override
   double getPrice() {
      return 1.50;
   }
}
