import java.util.Scanner;

//Write a program that accepts three numbers from the user and prints "increasing"
// if the numbers are in increasing order, "decreasing" if the numbers are
// in decreasing order, and "Neither increasing or decreasing order"
// otherwise.
// Test Data : Input first number: 1524 Input second number: 2345 Input third number: 3321 *

public class Conditional {
    public static void increasingAndDecreasing() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = input.nextInt();
        System.out.print("Input second number: ");
        int num2 = input.nextInt();
        System.out.print("Input third number: ");
        int num3 = input.nextInt();
        if (num1 < num2 && num2 < num3) {
            System.out.println("Increasing order");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
            input.close();
        }
    }


    public static void main(String[] args) {
        increasingAndDecreasing();

    }
}

