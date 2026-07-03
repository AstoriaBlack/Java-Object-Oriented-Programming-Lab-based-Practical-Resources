package customException;

public class NumberProcessor {
    public void processNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative number is not allowed: " + number);
        }
        // if we get here, the number was valid — process it normally
        System.out.println("Processing number: " + number);
    }
}
