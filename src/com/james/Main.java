package com.james;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static User user = new User ();

    public static void main(String[] args) throws Exception{
        System.out.println("Hello, What is your name?");

        User user = new User ();

        user.chooseName();
        user.chooseOption();
        user.chooseAmount();
    }


}



