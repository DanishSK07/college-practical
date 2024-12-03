//8th
import java.util.Scanner;

public class MethodOverloading {
        public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create an object of MethodOverloadingExample
        MethodOverloading obj = new MethodOverloading();

        // Take user input for two integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Call the method to add two integers
        System.out.println("Sum of 2 integers: " + obj.add(num1, num2));

        // Take user input for three integers
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        // Call the overloaded method to add three integers
        System.out.println("Sum of 3 integers: " + obj.add(num1, num2, num3));

        // Close the scanner object
        scanner.close();
    }
}
// Output:
// Enter the first integer: 10
// Enter the second integer: 9
// Sum of 2 integers: 19
// Enter the third integer: 11
// Sum of 3 integers: 30
