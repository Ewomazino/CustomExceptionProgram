## Custom Exception Program - Part 1 (Work in Progress) 🚀

📜 About This Project

This is the first part of the Java program that demonstrates how to create and use a custom exception.
The goal of this part is to:
✔️ Define a custom exception (InvalidAgeException)
✔️ Use a method to validate an age
✔️ Implement a try-catch block to handle exceptions properly


## 💡 How It Works

1️⃣ Custom Exception (InvalidAgeException)
	•	This exception is triggered when an age is less than 18.
	•	The exception carries a message describing the error.

2️⃣ Age Validation Method (checkAge(int age))
	•	Takes an integer age as input.
	•	Throws InvalidAgeException if the age is less than 18.
	•	Otherwise, it prints a success message.

3️⃣ Main Method (main)
	•	Calls checkAge(16), which is invalid.
	•	Uses a try-catch block to catch and display the error message.


  ##  📌 Next Steps

This is only the first part of the program. The final version will include:
✅ User input (instead of a hardcoded value)
✅ Loop to retry input if the age is invalid
✅ Logging errors to a file
✅ Storing valid ages in a list


🚀 Improvements Over the Work-in-Progress Version

✅ Added User Input Support → No more hardcoded values.
✅ Handles Non-Numeric Inputs → Prevents crashes due to invalid input.
✅ More Detailed Error Messages → Helps users understand what went wrong.
✅ Structured Code → Exception handling is separated for clarity.
