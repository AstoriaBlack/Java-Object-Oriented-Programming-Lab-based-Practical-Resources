package customException;

public class NegativeNumberException extends Exception {

    public NegativeNumberException(String message) {
        super(message); // hands the message up to Exception's own constructor
    }
}
