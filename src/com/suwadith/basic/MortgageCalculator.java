package com.suwadith.basic;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double principal = 0;
        double annualInterestRate = 0;
        int years = 0;

        while(true) {
            System.out.println("Principal ($1K - $1M): ");
            principal = sc.nextDouble();
            if(principal >= 1000 && principal <= 1_000_000) {
                break;
            } else {
                System.out.println("Please enter a number between 1,000 and 1,000,000");
            }
        }

        while(true) {
            System.out.println("Annual Interest Rate: ");
            annualInterestRate = sc.nextDouble();
            if(annualInterestRate > 0 && annualInterestRate <= 30) {
                break;
            } else {
                System.out.println("Please enter a value greater than 0 or less than or equal to 30");
            }
        }

        while(true) {
            System.out.println("Period (Years): ");
            years = sc.nextInt();
            if(years >= 1 && years <= 30) {
                break;
            } else {
                System.out.println("Please enter a value between 1 and 30");
            }
        }


        double monthlyInterestRate = (annualInterestRate/1200);
        int months = years*12;

        double mortgage = ((principal*monthlyInterestRate) * Math.pow((1+monthlyInterestRate), months)) / (Math.pow((1+monthlyInterestRate), months) - 1);

        System.out.println("Mortage: " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(mortgage));

    }
}
