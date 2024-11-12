package com.ps;

public class BagOfChips implements Product{
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
}
