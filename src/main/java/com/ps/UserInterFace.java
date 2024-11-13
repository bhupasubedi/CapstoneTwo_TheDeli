package com.ps;


import java.util.ArrayList;
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
       int breadType = intScanner.nextInt();


        System.out.println("What size sandwich would you like?");
        System.out.println("1) 4");
        System.out.println("2) 8");
        System.out.println("3) 12");
       int sandwichSize = intScanner.nextInt();


        System.out.println("What kind of meat topping would you like to add? ");
        System.out.println("1) Steak");
        System.out.println("2) Ham");
        System.out.println("3) Salami");
        System.out.println("4) Roast beef");
        System.out.println("5) Chicken");
        System.out.println("6) Bacon");
        System.out.println(" *Additional charge for extra meat*");
       int meatsTopping = intScanner.nextInt();


        System.out.println("Here are the cheese options. Which one would you like?");
        System.out.println("1) American");
        System.out.println("2) Provolone");
        System.out.println("3) Cheddar");
        System.out.println("4) Swiss");
        System.out.println("*Additional charge for extra Cheese*");
        int cheeseTopping = intScanner.nextInt();


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
       int regularTopping = intScanner.nextInt();


        System.out.println("What kind of sauces do you want?");
        System.out.println("1) Mayo");
        System.out.println("2) Mustard");
        System.out.println("3) Ketchup");
        System.out.println("4) Ranch");
        System.out.println("5) Thousand islands");
        System.out.println("6) Vinaigrette");
        System.out.println("7) Au jus");
        int saucesType = intScanner.nextInt();


        System.out.println("4) Would you like your sandwich toasted? (1 for Yes, 2 for No):");
        String isToasted = stringScanner.nextLine();


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

}