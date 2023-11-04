package app;

import java.util.Scanner;
public class Main {

    static double taxRate;
    static double tax;
    static double income;

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("Input your income: ");
       income = sc.nextDouble();
       if (income < 0){
          System.out.println("Wrong income!");
       } else if (income <= 10000){
           taxRate = 2.5;
           tax = income * taxRate / 100;
       } else if (income > 10000 && income <= 25000 ){
           taxRate = 4.7;
           tax = income * taxRate / 100;
       } else {
           taxRate = 6.7;
           tax = income * taxRate / 100;
       }
       System.out.printf("Tax: %.2f%n", tax);

    }
}
