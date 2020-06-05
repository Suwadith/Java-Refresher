package com.suwadith;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Principal: ");
        double principal = sc.nextDouble();

        System.out.println("Annual Interest Rate: ");
        double annualInterestRate = sc.nextDouble();

        System.out.println("Period (Years): ");
        int years = sc.nextInt();

        double monthlyInterestRate = (annualInterestRate/1200);
        int months = years*12;

        double mortgage = ((principal*monthlyInterestRate) * Math.pow((1+monthlyInterestRate), months)) / (Math.pow((1+monthlyInterestRate), months) - 1);

        System.out.println("Mortage: " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(mortgage));

    }
}
