package exceptionhandling;

public class InvalidCountryException extends Exception {
    public InvalidCountryException(String message) {
        super(message);
    }
}
