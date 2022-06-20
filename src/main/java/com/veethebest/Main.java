package com.veethebest;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte monthsInAYear = 12;
        final byte percent = 100;

        int principal = 0;
        float monthlyRate = 0;
        float numberOfPayments = 0;
                Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal ($1k - $1m): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            else System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        float rate = 0;
        while (true) {
            System.out.print("Annual Interest Rate: ");
            rate = scanner.nextInt();
            if (rate >= 1 && rate <= 30) {
                monthlyRate = (rate / percent) / monthsInAYear;
                break;
            }
            else
                System.out.println("Enter a number graater than 1 and less than 30.");
        }


        byte years = 0;
        while (true) {
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = (years * monthsInAYear);
                break;
            }
            else
                System.out.println("Enter a number between 1 and 30.");
        }



        double numerator = monthlyRate * Math.pow ((1 + monthlyRate), numberOfPayments);


        double denominator = (Math.pow((1 + monthlyRate), numberOfPayments)) - 1;

        double mortgage = principal * ( numerator / denominator );
        System.out.println("Mortgage per month: " + mortgage);

        Locale locale = new Locale("en", "US");
        NumberFormat currency = NumberFormat.getCurrencyInstance(locale);
        String mortgageFormatted =  currency.format(mortgage);
        System.out.println("Mortgage per month: " + mortgageFormatted);


        Car benz = new Car("michelin");

        benz.iMove();
    }
}