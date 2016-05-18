package com.james;

import java.util.Scanner;

/**
 * Created by jamesyburr on 5/18/16.
 */
public class User {
    String name;
    String option;
    String amount;

    public void chooseName() throws Exception {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        if (!name.isEmpty()) {
            System.out.println("Hello " + name);
        } else {
            throw new Exception("Invalid Entry");
        }

    }
    public void chooseOption() {
        System.out.println("What would you like to do? [Check my balance, Withdraw funds, Cancel]");
        String option = Main.scanner.nextLine();

        if (option.equalsIgnoreCase("check my balance")) {
            System.out.println("Your balance is 100");
        } else if (option.equalsIgnoreCase("cancel")) {
            System.out.println("Thank you and please come again!");
        } else if (option.equalsIgnoreCase("withdraw funds")) {
            System.out.println("How much would you like?");
        }
    }

    public void chooseAmount() throws Exception {

        String amount = Main.scanner.nextLine();
        int num = Integer.valueOf(amount);

        if (num <= 100) {
            System.out.println("Please collect your money");
            System.out.println("Have a nice day!");
        } else if (num > 100) {
            throw new Exception("Insufficient funds");
        }
    }
}

