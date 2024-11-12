package com.ps;


import java.util.ArrayList;
import java.util.Scanner;

public class UserInterFace {

    private ArrayList<Sandwich> sandwiches= new ArrayList<>();
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

            int orderSelection;

            do {

                System.out.println(" Please choose an option: ");
                System.out.println("1) Add Sandwich");
                System.out.println("2) Add Drink");
                System.out.println("3) Add Chips");
                System.out.println("4) Checkout");;
                System.out.println("5) Going back to main menu");

                System.out.println("Make an selection: ");
                orderSelection = intScanner.nextInt();

                switch (orderSelection) {

                    case 1:
                        AddSandwich();
                        break;
                    case 2:
                        AddDrink();
                        break;
                    case 3:
                        AddChips();
                        break;
                    case 4:
                        Checkout();
                        break;
                    case 5:
                        System.out.println("5) Going back to main menu ");
                        break;
                    default:
                        System.out.println("Command not found, please try again...");

                }

            } while (orderSelection != 5);

    }

    private static void AddSandwich() {

        System.out.println("1) Please select your bread type:");
        System.out.println("1) White");
        System.out.println("2) Wheat");
        System.out.println("3) Rye");
        System.out.println("4) Wrap");
        String breadType = stringScanner.nextLine();



        System.out.println("2) Choose your sandwich size:");
        System.out.println("1) 4");
        System.out.println("2) 8");
        System.out.println("3) 12");
        double sandwichSize = intScanner.nextInt();



        System.out.println("3) Select your toppings:");

        System.out.println("1) Meat topping includes following: ");
        System.out.println("2) Steak");
        System.out.println("3) Ham");
        System.out.println("4) Salami");
        System.out.println("5) Roast beef");
        System.out.println("6) Chicken");
        System.out.println("7) Bacon");
        System.out.println("8) Additional charge for extra meat");
        String meats = stringScanner.nextLine();


        System.out.println("Here are the cheese options:" );
        System.out.println("1) American");
        System.out.println("2) Provolone");
        System.out.println("3) Cheddar");
        System.out.println("4) Swiss");
        String topping = stringScanner.nextLine();


        System.out.println("4) Would you like your sandwich toasted? (1 for Yes, 2 for No):");
        String isToasted = stringScanner.nextLine();

        System.out.println("Selection: ");

    }

    private static void AddDrink() {

        System.out.println("Please select a drink flavor:");
        String drinkFlavor = stringScanner.nextLine();

        System.out.println("choose an size of drink");
        String drinkSize = stringScanner.nextLine();

    }
    public static void AddChips() {
        System.out.println("Please select a chips flavor:");
        String chipsFlavor = stringScanner.nextLine();

    }
    private static void Checkout() {

    }


}