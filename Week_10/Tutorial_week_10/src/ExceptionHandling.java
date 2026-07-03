import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExceptionHandling {
    public static void main(String[] args) {
        //exercise 1
        try {
            int myArray[] = new int[5];
            //trying to print element 5
            System.out.println(myArray[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The element "+ e.getMessage() + " doesn't exist!");
        }

        //exercise 2
        Scanner input = new Scanner(System.in);
        int value = 0;
        System.out.println("enter an integer: ");

        //initialize try catch block
        try {
            value = input.nextInt();
            System.out.println("Value: " + value);
        } catch (InputMismatchException e) {
            System.out.println("Error! Please enter numbers only. " + "Error message: " +  e.getMessage());
        }
        input.close();
    }
}