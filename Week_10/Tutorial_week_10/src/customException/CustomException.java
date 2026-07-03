package customException;

public class CustomException {
    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();

        int[] testVals = {12, -9, 0};

        for(int val : testVals) {
            try {
                processor.processNumber(val);
            } catch (NegativeNumberException e) {
                // this only runs if processNumber actually threw the exception
                System.out.println("An error caught: " + e.getMessage());
            }
        }
    }
}
