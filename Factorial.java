//9
import java.util.Scanner;
public class Factorial {
    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i; // Multiply result by i at each step
        }
        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is negative
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Call the factorial method and print the result
            System.out.println("Factorial of " + number + " is " + factorial(number));
        }

        // Close the scanner object
        scanner.close();
    }
}
//Output:
Enter a number: 5
Factorial of 5 is 120
