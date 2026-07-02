import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BookStore {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        HashMap<Book,Integer> hMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("Welcome to Astoria's Bookstore!");
            System.out.println("Press 1 to add a book");
            System.out.println("Press 2 to print out all the books");
            System.out.println("Press 3 to print out the books by the title");
            System.out.println("Press 4 to map all books into shelves");
            System.out.println("Press 5 to print all books in a shelf");
            System.out.println("Press 6 to exit the program");

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
                    System.out.println("\n--- All Books ---");
                    if(books.isEmpty()) {
                        System.out.println("There are no books in the system\n");
                    } else {
                        for (Book b : books) {
                            System.out.println(b);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n--- Books By the Year ---");
                    if(books.isEmpty()) {
                        System.out.println("There are no books in the system\n");
                    } else {
                        //create a copy of the list to sort
                        ArrayList<Book> booksByYear = new ArrayList<>(books);

                        Collections.sort(booksByYear);
                        for (Book b: booksByYear) {
                            System.out.println(b);
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n--- Map Books to Shelves ---");
                    if (books.isEmpty()) {
                        System.out.println("There are no books to map.");
                        break;
                    }
                    //loop through each book to see which map it belongs to
                    for (Book b : books) {
                         System.out.println("Enter shelf number for: " + b.getTitle());
                         int shelf = scan.nextInt();
                         hMap.put(b,shelf);
                    }

                    System.out.println("\n--- Current Shelf Mapping ---");
                    //entrySet() gives all key-value pairs so we can print them
                    for(Map.Entry<Book, Integer> entry : hMap.entrySet()) {
                        System.out.println("Shelf " + entry.getValue()
                        + " --> " + entry.getKey().getTitle());
                    }
                    System.out.println("\n-----------\n");
                    break;

                case 5:
                    System.out.println("Insert the number of the shelf");
                    int selectedShelf = scan.nextInt();
                    System.out.println("The books in shelf " + selectedShelf + " are: ");

                    for (Map.Entry<Book, Integer> entry : hMap.entrySet()) {
                        if(entry.getValue().equals(selectedShelf)) {
                            System.out.println(entry.getKey());
                        }
                    }
                    break;

                case 6:
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