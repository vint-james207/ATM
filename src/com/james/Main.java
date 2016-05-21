package com.james;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    //
    static HashMap<String, User> users = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        while (true) {
            System.out.println("Hello, What is your name?");


            String name = scanner.nextLine();

            if (!users.containsKey(name)) {
                System.out.println("User does not exist, would you like to create an account? [y/n]");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("y")) {
                    users.put(name, new User(name, 100.0));
                }
            }

            User user = users.get(name);

            if (user != null) {


                while (true) {
                    System.out.println("What would you like to do? [Check my balance[1], Withdraw funds[2], Cancel[3], Remove account[4]]");
                    String option = Main.scanner.nextLine();

                    if (option.equalsIgnoreCase("1")) {
                        System.out.println("Your balance is " + user.getBalance());
                    } else if (option.equalsIgnoreCase("2")) {
                        System.out.println("How much would you like?");
                        String input = scanner.nextLine();
                        double inputNum = Double.valueOf(input);

                        if (!(inputNum < 0) && !(inputNum > user.getBalance())) {
                            double remainder = user.changeBalance(inputNum);
                            System.out.println("Your balance is " + remainder);
                            System.out.println("Please collect your money");
                        } else {
                            System.out.println("Invalid entry");
                        }

                    } else if (option.equalsIgnoreCase("3")) {
                        System.out.println("Are you sure? [y/n]");
                        String input = scanner.nextLine();

                        if (input.equalsIgnoreCase("y")) {
                            System.out.println("Thank you come again!");
                            break;
                        }
                    } else if (option.equalsIgnoreCase("4")) {
                        //remove account
                        System.out.println("Are you sure [y/n]");
                        String input = scanner.nextLine();

                        if (input.equalsIgnoreCase("y")) {
                            users.remove(user.getName());
                            break;
                        }
                    }
                }

            }
        }
    }
}



