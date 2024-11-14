package com.ps;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterFace {

    private ArrayList<Sandwich> sandwiches = new ArrayList<>();
    private static Scanner intScanner = new Scanner(System.in);
    private static Scanner stringScanner = new Scanner(System.in);

    public static void display() {

        int choice;
        do {

            System.out.println("Welcome to the Delicious Sandwich Shop! Start a new order now! ");
            System.out.println("1) New Order");
            System.out.println("0) Exit");

            System.out.print("Command: ");
            choice = intScanner.nextInt();

            switch (choice) {
                case 1:
                    createNewOrder();
                    break;
                case 0:
                    System.out.println("Exiting ..");
                    break;
                default:
                    System.out.println("Command not found, please try again...");

            }
        } while (choice != 0);
    }

    private static void createNewOrder() {
        Order order = new Order();
        int orderSelection;

        do {

            System.out.println("Please choose an option: ");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("5) Going back to main menu");


            orderSelection = intScanner.nextInt();

            switch (orderSelection) {

                case 1:
                    AddSandwich(order);
                    break;
                case 2:
                    AddDrink(order);
                    break;
                case 3:
                    AddChips(order);
                    break;
                case 4:
                    Checkout(order);
                    break;
                case 5:
                    System.out.println("5) Going back to main menu ");
                    break;
                default:
                    System.out.println("Command not found, please try again...");
                    break;
            }

        } while (orderSelection != 5);

    }

    private static void AddSandwich(Order order) {
        System.out.println("What is your name?");
        String name = stringScanner.nextLine();

        System.out.println("What kind of bread would you like?");
        System.out.println("1) White");
        System.out.println("2) Wheat");
        System.out.println("3) Rye");
        System.out.println("4) Wrap");
        int breadTypeChoice = intScanner.nextInt();
        String sandwichBreadType = "";
        if (1 == breadTypeChoice) {
            sandwichBreadType = "White";
        } else if (2 == breadTypeChoice) {
            sandwichBreadType = "Wheat";
        } else if (3 == breadTypeChoice) {
            sandwichBreadType = "Rye";
        } else if (4 == breadTypeChoice) {
            sandwichBreadType = "Wrap";
        }


        System.out.println("What size sandwich would you like?");
        System.out.println("1) 4");
        System.out.println("2) 8");
        System.out.println("3) 12");
        int sandwichSizeChoice = intScanner.nextInt();
        int sandwichSize = 0;
        if (1 == sandwichSizeChoice) {
            sandwichSize = 4;
        } else if (2 == sandwichSizeChoice) {
            sandwichSize = 8;
        } else if (3 == sandwichSizeChoice) {
            sandwichSize = 12;
        }

        List<Topping> toppingList = new ArrayList<>();
        System.out.println("What kind of meat topping would you like to add? ");
        System.out.println("1) Steak");
        System.out.println("2) Ham");
        System.out.println("3) Salami");
        System.out.println("4) Roast beef");
        System.out.println("5) Chicken");
        System.out.println("6) Bacon");
        int meatsToppingChoice = intScanner.nextInt();
        System.out.println(" Would you like to add extra meat for (.50 for 4'', 1.00 for 8'', 3.00 for 12'') Type 1. Yes 2. No");
        int extraMeat = intScanner.nextInt();

        String topping = "";
        if (1 == meatsToppingChoice) {
            topping = "Steak";
        } else if (2 == meatsToppingChoice) {
            topping = "Ham";
        }
        else if (3 == meatsToppingChoice) {
            topping = "Salami";
        }
        else if (4 == meatsToppingChoice) {
            topping = " Roast beef";
        }
        else if (5 == meatsToppingChoice) {
            topping = "Chicken";
        }
        else if (6 == meatsToppingChoice) {
            topping = " Bacon";
        }
        Topping meatTopping = new Topping(topping, "Meats", "Premium", calculateToppingPrice("Meats", sandwichSize));
        Topping extraMeatTopping = null;
        if (1 == extraMeat) {
            extraMeatTopping = new Topping(topping, "ExtraMeat", "Premium", calculateToppingPrice("ExtraMeat", sandwichSize));
            toppingList.add(extraMeatTopping);
        }
        toppingList.add(meatTopping);

        System.out.println("Here are the cheese options. Which one would you like?");
        System.out.println("1) American");
        System.out.println("2) Provolone");
        System.out.println("3) Cheddar");
        System.out.println("4) Swiss");
        int cheeseToppingChoice = intScanner.nextInt();
        System.out.println(" Would you like to add extra Cheese for (.30 for 4'', .60 for 8'', .90 for 12'') Type 1. Yes 2. No");
        int extraCheese = intScanner.nextInt();

        String cheeseToppings = "";
        if (1== cheeseToppingChoice){
            cheeseToppings = "American";

        } else if (2== extraCheese) {
            cheeseToppings = "Provolone";
        }
        else if (3== cheeseToppingChoice) {
            cheeseToppings = "Cheddar";
        }
        else if(4== cheeseToppingChoice) {
            cheeseToppings = "Swiss";
        }
        Topping cheeseTopping = new Topping(cheeseToppings, "Cheese", "Premium", calculateToppingPrice("Cheese", sandwichSize));
        Topping extraCheeseTopping = null;
        if (1 == extraCheese) {
            extraCheeseTopping = new Topping(cheeseToppings, "ExtraCheese", "Premium", calculateToppingPrice("ExtraCheese", sandwichSize));
            toppingList.add(extraCheeseTopping);
        }
        toppingList.add(cheeseTopping);


        int regularToppingChoice;
        do {
            Topping regularTopping = null;
            System.out.println("Please choose from the following regular toppings:");
            System.out.println("1) Lettuce");
            System.out.println("2) Peppers");
            System.out.println("3) Onions");
            System.out.println("4) Tomatoes");
            System.out.println("5) Jalapenos");
            System.out.println("6) Cucumbers");
            System.out.println("7) Pickles");
            System.out.println("8) Guacamole");
            System.out.println("9) Mushrooms");
            System.out.println("10) Done with toppings");
            regularToppingChoice = intScanner.nextInt();

            switch (regularToppingChoice) {

                case 1:
                    regularTopping = new Topping("Lettuce", "Regular", "Regular", 0.0);
                    toppingList.add(regularTopping);
                    break;
                case 2:
                    regularTopping = new Topping("Peppers", "Regular", "Regular", 0.0);
                    toppingList.add(regularTopping);
                    break;
                case 3:
                    regularTopping = new Topping("Onions", "Regular", "Regular", 0.0);
                    toppingList.add(regularTopping);
                    break;
                case 4:
                    regularTopping = new Topping("Tomatoes", "Regular", "Regular", 0.0);
                    toppingList.add(regularTopping);
                    break;
                case 5:
                    regularTopping = new Topping("Jalapenos", "Regular", "Regular", 0.0);
                    toppingList.add(regularTopping);
                    break;
                case 6:
                    regularTopping = new Topping("Cucumbers", "Regular", "Regular", 0.0);
                    toppingList.add(regularTopping);
                    break;
                case 7:
                    regularTopping = new Topping("Pickles", "Regular", "Regular", 0.0);
                    toppingList.add(regularTopping);
                    break;
                case 8:
                    regularTopping = new Topping("Guacamole", "Regular", "Regular", 0.0);
                    toppingList.add(regularTopping);
                    break;
                case 9:
                    regularTopping = new Topping("Mushrooms", "Regular", "Regular", 0.0);
                    toppingList.add(regularTopping);
                    break;

            }
        } while (regularToppingChoice != 10);

        int saucesType;

        do {
            Topping sauce = null;

            System.out.println("What kind of sauces do you want?");
            System.out.println("1) Mayo");
            System.out.println("2) Mustard");
            System.out.println("3) Ketchup");
            System.out.println("4) Ranch");
            System.out.println("5) Thousand islands");
            System.out.println("6) Vinaigrette");
            System.out.println("7) Au jus");
            System.out.println("8) No more sauce");
            saucesType = intScanner.nextInt();

            switch (saucesType) {
                case 1:
                    sauce = new Topping("Mayo", "Regular", "Sauces", 0.0);
                    toppingList.add(sauce);
                    break;
                case 2:
                    sauce = new Topping("Mustard", "Regular", "Sauces", 0.0);
                    toppingList.add(sauce);
                    break;
                case 3:
                    sauce = new Topping("Ketchup", "Regular", "Sauces", 0.0);
                    toppingList.add(sauce);
                    break;
                case 4:
                    sauce = new Topping("Ranch", "Regular", "Sauces", 0.0);
                    toppingList.add(sauce);
                    break;
                case 5:
                    sauce = new Topping("Thousand islands", "Regular", "Sauces", 0.0);
                    toppingList.add(sauce);
                    break;
                case 6:
                    sauce = new Topping("Vinaigrette", "Regular", "Sauces", 0.0);
                    toppingList.add(sauce);
                    break;
                case 7:
                    sauce = new Topping("Au jus", "Regular", "Sauces", 0.0);
                    toppingList.add(sauce);
                    break;

            }


        } while (saucesType != 8) ;

        System.out.println("4) Would you like your sandwich toasted? (1 for Yes, 2 for No):");
        int isToastedChoice = intScanner.nextInt();
        boolean isToasted = false;
        if (1 == isToastedChoice) {
            isToasted = true;
        } else if (2 == isToastedChoice) {
            isToasted = false;
        }
        Product sandwich = new Sandwich(sandwichBreadType, sandwichSize, isToasted);
    }

    private static void AddDrink(Order order) {

        System.out.println("Please select a drink flavor:");
        String drinkFlavor = stringScanner.nextLine();

        System.out.println("choose an size of drink");
        int drinkSize = intScanner.nextInt();

    }

    public static void AddChips(Order order) {
        System.out.println("Please select a chips flavor:");
        int chipsFlavor = intScanner.nextInt();

    }

    private static void Checkout(Order order) {

        System.out.println("Thank you for visiting Delicious Sandwich Shop! Would you like to confirm your order?");
        int checkOutChoice;

        do {
            System.out.println("1) Press 1 to confirm the order");
            System.out.println("2) press 2 to cancel the order");
            System.out.println("0) Press 0 to go back to main menu");

            System.out.println("Command:");
            checkOutChoice = intScanner.nextInt();

            switch (checkOutChoice) {
                case 1:
                    confirmOrder();
                    break;
                case 2:
                    cancelOrder();
                    break;
                case 0:
                    System.out.println("Going back to main menu");
                    break;
                default:
                    System.out.println("Command not found, please try again");

            }
        } while (checkOutChoice != 0);

    }

    private static void confirmOrder() {

    }

    private static void cancelOrder() {
    }

    private static double calculateToppingPrice(String toppingType, int sandwichSize) {
        double toppingPrice = 0.0;
        if ("Meats".equalsIgnoreCase(toppingType)) {
            if (4 == sandwichSize) {
                toppingPrice = 1.00;
            } else if (8 == sandwichSize) {
                toppingPrice = 2.00;
            } else if (12 == sandwichSize) {
                toppingPrice = 3.00;
            }
        } else if ("Cheese".equalsIgnoreCase(toppingType)) {
            if (4 == sandwichSize) {
                toppingPrice = .75;
            } else if (8 == sandwichSize) {
                toppingPrice = 1.50;
            } else if (12 == sandwichSize) {
                toppingPrice = 2.25;
            }
        } else if ("ExtraCheese".equalsIgnoreCase(toppingType)) {
            if (4 == sandwichSize) {
                toppingPrice = .30;
            } else if (8 == sandwichSize) {
                toppingPrice = .60;
            } else if (12 == sandwichSize) {
                toppingPrice = .90;
            }
        } else if ("ExtraMeat".equalsIgnoreCase(toppingType)) {
            if (4 == sandwichSize) {
                toppingPrice = .50;
            } else if (8 == sandwichSize) {
                toppingPrice = 1.00;
            } else if (12 == sandwichSize) {
                toppingPrice = 1.50;
            }
        }
        return toppingPrice;
    }

}