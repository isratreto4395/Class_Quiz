//Write a Java program that takes two numbers as input and display the product of two numbers. Test Data:Input first number: 25 Input second number: 5 Expected Output : 25 x 5 = 125
import java.util.Scanner;

public class ProductOf2Numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num = input.nextInt();
        System.out.print("Input Second number: ");
        int num1 = input.nextInt();
        System.out.print(num + " x " + num1 + " = " + (num * num1));

        input.close();
    }
}