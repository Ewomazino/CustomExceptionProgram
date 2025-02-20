import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Step 1: Define the Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Step 2: Implement Exception Handling with Logging & Storing Valid Ages
public class CustomExceptionDemo {
    private static List<Integer> validAges = new ArrayList<>();  // Stores valid ages
    private static final String LOG_FILE = "error_log.txt";  // Error log file

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older. Provided age: " + age);
        }
        validAges.add(age);  // Store valid age
        System.out.println("✅ Age " + age + " is valid. Access granted.");
    }

    public static void logError(String errorMessage) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {  // Append to log file
            writer.write(errorMessage + "\n");
        } catch (IOException e) {
            System.out.println("⚠️ Could not write to log file.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Loop to retry input if needed
            try {
                System.out.print("\n🔢 Enter your age (or -1 to exit): ");
                int age = scanner.nextInt();

                if (age == -1) {  // Allow user to exit
                    System.out.println("🚪 Exiting program.");
                    break;
                }

                checkAge(age);  // Check age validity

            } catch (InvalidAgeException e) {
                System.out.println("❌ Error: " + e.getMessage() + " Try again.");
                logError("InvalidAgeException: " + e.getMessage());  // Log error
            } catch (Exception e) {
                System.out.println("⚠️ Invalid input! Please enter a number.");
                logError("InputException: Invalid non-numeric input.");  // Log error
                scanner.next(); // Clear invalid input
            }
        }

        scanner.close();  // Close scanner

        // Display stored valid ages
        System.out.println("\n📋 List of Valid Ages Entered: " + validAges);
        System.out.println("✅ Program ended. Errors (if any) saved in 'error_log.txt'.");
    }
}