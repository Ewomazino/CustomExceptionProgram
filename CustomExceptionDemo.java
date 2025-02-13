// Step 1: Define a custom exception for invalid age
class InvalidAgeException extends Exception {
    // Constructor that takes an error message
    public InvalidAgeException(String message) {
        super(message); // Pass message to the Exception class
    }
}

// Step 2: Implement a basic program to check age validity
public class CustomExceptionDemo {
    
    // Method to validate age
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) { // If age is less than 18, it's invalid
            throw new InvalidAgeException("Age must be 18 or older. Provided age: " + age);
        }
        System.out.println("✅ Age " + age + " is valid."); // If valid, print success message
    }

    public static void main(String[] args) {
        int age = 16; // Example input (invalid age)

        try {
            checkAge(age); // Attempt to check age (may throw exception)
        } catch (InvalidAgeException e) { // Catch custom exception
            System.out.println("❌ Error: " + e.getMessage()); // Print error message
        }
    }
}