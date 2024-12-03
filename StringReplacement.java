//11
import java.util.Scanner;

public class StringReplacement {

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Take the input string from the user
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        // Take the target string to replace
        System.out.print("Enter the substring to replace: ");
        String target = scanner.nextLine();

        // Take the replacement string
        System.out.print("Enter the replacement string: ");
        String replacement = scanner.nextLine();

        // Replace the target string with the replacement string
        String resultString = originalString.replace(target, replacement);

        // Display the result
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + resultString);

        // Close the scanner
        scanner.close();
    }
}
Output:
Enter a string: BJ Danish
Enter the substring to replace: BJ
Enter the replacement string: Sheikh
Original String: BJ Danish
Modified String: Sheikh Danish
