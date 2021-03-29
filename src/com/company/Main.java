package com.company;

import java.awt.*;
import java.sql.SQLOutput;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        String message = " Hello \"World\"";
//        System.out.println(message.trim());
//        byte age = 30;
//        long viewsCount = 3_123_456_789L;
//        float price = 10.99F;
//        char letter = 'A';
//        boolean isEligible = false;

//        Date now = new Date();
//        System.out.println(now);

//        Point point1 = new Point(1, 1);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);

//        int[][] numbers = { { 1, 2, 3}, { 4, 5, 6} };
//        numbers[0][0] = 1;

//        Arrays.sort(numbers);

//        final float pi = 3.14F;

//        int x = 1;
//        int y = 1;
//        y = x++;
//        System.out.println(y);
        // Implicit casting
//        String x = "1";
//        int y = Integer.parseInt(x) + 2;
//        System.out.println(y);

//        int result = (int) (Math.random() * 100);
//        System.out.println(result);


//        String result = NumberFormat.getPercentInstance().format( 0.1);
//        System.out.println(result);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
////        byte age = scanner.nextByte();
//        String name = scanner.nextLine().trim();
//        System.out.println("My name is " + name);
//        Math.pow()

//        int temp = 15;
//        if (temp > 30) {
//            System.out.println("It's a hot day");
//            System.out.println("Drink water");
//        }
//        else if (temp > 20)
//            System.out.println("It's a nice day");
//        else
//            System.out.println("Cold day");

//        int income = 120_000;
//        String className = income > 100_000 ? "First" : "Economy";

//        boolean hashHighIncome = (income > 100_000);
//        System.out.println(className);

//        String role = "admin";
//
//        switch (role) {
//            case "admin":
//                System.out.println("You re an admin");
//                break;
//
//            case "moderator":
//                System.out.println("You are a moderator");
//                break;
//
//            default:
//                System.out.println("You are a guest");
//        }

//        if(role == "admin")
//            System.out.println("You re an admin");
//        else if (role == "moderator")
//            System.out.println("You are a moderator");
//        else
//            System.out.println("You are a guest");

        // buzz fizz app practice

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Number: ");
//        int number = scanner.nextInt();
//
//
//        if (number % 5 == 0){
//            if (number % 3 == 0)
//                System.out.println("FizzBuzz");
//            else
//                System.out.println("Fizz")
//        }
//        else if (number % 3 == 0)
//            System.out.println("Buzz");
//        else
//            System.out.println(number);

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello World");
//        }

//        int i = 5;
//        while (i > 0) {
//            System.out.println("Hello World");
//            i--;
//        }

//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (true) {
//            System.out.println("Input: ");
//            input = scanner.next().toLowerCase();
//            if (input.equals("pass"))
//                continue;
//            if (input.equals("quit"))
//                break;
//            System.out.println(input);
//        }

//        do {
//            System.out.println("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        } while (!input.equals("quit"))

//        String[] fruits = { "Apple", "Mango", "Orange" };
//
//        for (int i = 0; i < fruits.length; i++)
//            System.out.println(i);
//
//        for (String fruit : fruits)
//            System.out.println(fruit);



//        Mortgage calculator app
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthlyRate = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value bwtween 1000 and 1000000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualRate = scanner.nextFloat();
            if (annualRate >= 1 && annualRate <= 30) {
                monthlyRate = annualRate / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }


        while (true) {
            System.out.print("Period (Years): ");
            short years = scanner.nextShort();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        double mortgage = principal
                * (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments))
                / (Math.pow(1 + monthlyRate, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
