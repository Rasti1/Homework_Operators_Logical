package app;
import java.util.Scanner;
public class Main {
    static double tax;
    static double income;
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Input your income: ");
       income = sc.nextDouble();
       if (income <= 10000){
           tax = income * 0.025;
       }
       else if (income > 10000 && income <= 25000 ){
           tax = income * 0.043;
       }
       else {
           tax = income * 0.067;
       }
       System.out.printf("Tax: %.2f%n", tax);
    }
}
