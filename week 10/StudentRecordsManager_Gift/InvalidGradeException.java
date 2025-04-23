/**
 * Custom exception class for handling invalid grade values.
 * This demonstrates how to create a custom exception in Java.
 * 
 * Custom exceptions allow you to create application-specific error types
 * that provide more meaningful error handling than generic exceptions.
 */
public class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);  // Pass the message to the parent Exception class
    }

}