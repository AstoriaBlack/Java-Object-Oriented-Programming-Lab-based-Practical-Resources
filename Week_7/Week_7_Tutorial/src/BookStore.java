import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BookStore {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("Welcome to Astoria's Bookstore!");
            System.out.println("Press 1 to add a book");
            System.out.println("Press 2 to print out all the books");
            System.out.println("Press 3 to exit the program");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter the name of the book: ");
//                    scan.nextLine();   // clear newline
                    String name = scan.nextLine();

                    System.out.println("Enter the author of the book: ");
//                    scan.nextLine();   // clear newline
                    String author = scan.nextLine();

                    System.out.println("Enter the price of the book: ");
                    double price = scan.nextDouble();

                    System.out.println("Enter the date of the book ");
                    System.out.println("Enter publication Day: ");
                    int day = scan.nextInt();

                    System.out.println("Enter publication Month: ");
                    int month = scan.nextInt();

                    System.out.println("Enter publication Year: ");
                    int year = scan.nextInt();

                    Date date = new Date(day, month, year);

                    //creating the book object and storing it
                    Book book = new Book(name,price,date,author);
                    books.add(book);
                    System.out.println("Book added Successfully!\n");

                    break;

                case 2:
                    if(books.isEmpty()) {
                        System.out.println("There are no books in the system\n");
                    } else {
                        for (Book b : books) {
                            System.out.println(b);
                        }
                    }
                    break;

                case 3:
                    exit = true;
                    System.out.println("Program exited!");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        scan.close();
    }
}