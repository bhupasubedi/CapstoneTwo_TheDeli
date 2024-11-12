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


            System.out.println(" Please choose an option : ");
            System.out.println("1) New Order");
            System.out.println("2) Exit");

            System.out.print("Command: ");
            choice = intScanner.nextInt();

            switch (choice) {
                case 1:
                    createNewOrder();
                case 0:
                    System.out.println(" Exiting .. ");
                default:
                    System.out.println("Command not found, please try again...");

            }
        } while (choice != 0);
    }

        private static void createNewOrder() {

            int orderSelection;

            do {

                System.out.println("Welcome to the Sandwich shop : ");
                System.out.println("1) Add Sandwich");
                System.out.println("2) Add Drink");
                System.out.println("3) Add Chips");
                System.out.println("4) Checkout");
                System.out.println("0) Cancel Order");

                System.out.println(" Make an selection: ");
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
                        System.out.println(" Cancel Order");
                        break;
                    default:
                        System.out.println("Command not found, please try again...");

                }

            } while (orderSelection != 0);

    }

    private static void AddSandwich() {

        System.out.println("Please select your bread type:");
        System.out.println("Choose your sandwich size:");
        System.out.println("Select your toppings:");
        System.out.println("Would you like your sandwich toasted? (1 for Yes, 2 for No):");


        System.out.println("Selection: ");

    }

    private static void AddDrink() {
    }
    public static void AddChips() {

    }
    private static void Checkout() {
    }


}