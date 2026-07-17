package librarycentre_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WestminsterLibraryManager implements LibraryManager{
    public ArrayList<Item>  itemList;
    public int item_limit;

    public WestminsterLibraryManager(int maxItemNumber){
        itemList = new ArrayList<Item>();
        item_limit = maxItemNumber;
    }

    public boolean runMenu() {
        boolean exit = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("\n-- WESTMINSTER LIBRARY MANAGER CONSOLE MENU--");

        System.out.println("To save and exit, press 0");

        System.out.println("To Add a new item, press 1");

        System.out.println("To Display the list of item press 2");

        System.out.println("To Open GUI, press 3");

        System.out.println("To Change the Title, press 4");

        int choice = sc.nextInt();

        switch (choice) {
            case 0:
                exit = true;
                break;
            case 1:
                this.addItem();
                break;
            case 2:
                this.displayItems();
                break;
            case 3:
                this.runGUI();
                break;
            case 4:
                this.editTitleItem();
                break;
        }
        return exit;
    }

    public void addItem() {
        Scanner sc = new Scanner(System.in);

        if (itemList.size() < item_limit) {
            System.out.println("Press 1 if you want to add a Book");
            System.out.println("Press 2 if you want to add a DVD");
            System.out.println("Press 3 if you want to add a Magazine");

            int choice = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the title: ");
            String title = sc.nextLine();
            System.out.println("Enter the ISBN: ");
            String isbn = sc.nextLine();
            System.out.println("Enter the publication year: ");
            int year = sc.nextInt();
            sc.nextLine();

            //checking if the items are different classes
            switch (choice) {
                case 1:
                    System.out.println("Enter the name of the author: ");
                    String author = sc.nextLine();

                    Book book = new Book(title,isbn);
                    book.setAuthor(author);
                    book.setPublicationYear(year);

                    this.addItemToList(book);
                    break;

                case 2:
                    System.out.println("Add the genre: ");
                    String genre = sc.nextLine();
                    System.out.println("Add the name of the director: ");
                    String director = sc.nextLine();

                    DVD dvd = new DVD(title,isbn);
                    dvd.setPublicationYear(year);
                    dvd.setDirector(director);
                    dvd.setGenre(genre);

                    this.addItemToList(dvd);
                    break;

                case 3:
                    System.out.println("Add the issue number : ");
                    int issuenum = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Add the editor's name: ");
                    String editor = sc.nextLine();
                    System.out.println("Add the publication frequency (eg: weekly/monthly): ");
                    String freq = sc.nextLine();

                    Magazine magazine  = new Magazine(title,isbn);
                    magazine.setPublicationYear(year);
                    magazine.setEditor(editor);
                    magazine.setPublicationFrequency(freq);
                    magazine.setIssueNumber(issuenum);

                    this.addItemToList(magazine);
                    break;
            }
            System.out.println("Item added successfully!");
        }else {
            System.out.println("No more spaces to add!");
        }
    }

    public void addItemToList(Item item) {
        if (itemList.size() < item_limit) {
            itemList.add(item);
        }else {
            System.out.println("No more spaces left");
        }
    }

    public void displayItems() {
        if (!itemList.isEmpty()) {
            Collections.sort(itemList);

            for (Item item : itemList) {
                if (item instanceof Book) {
                    System.out.print("BOOK - ");
                } else if (item instanceof DVD) {
                    System.out.print("DVD - ");
                }else if (item instanceof Magazine){
                    System.out.print("MAGAZINE - ");
                }
                System.out.println(item.toString());
            }
        } else {
            System.out.println("There are no items to print");
        }
    }

//    public void editTitleItem() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the ISBN number of the title to be edited: ");
//        String isbn = sc.nextLine();
//
//        if (!itemList.isEmpty()) {
//            for (Item item : itemList) {
//                if (item.getISBN().equals(isbn)) {
//                    System.out.println("Title: " + item.getTitle());
//                    System.out.println("Publication Year: " + item.getPublicationYear());
//                    if (item instanceof Book) {
//                        System.out.println("Type: BOOK");
//                    } else if (item instanceof DVD) {
//                        System.out.println("Type: DVD");
//                    } else if (item instanceof Magazine) {
//                        System.out.println("Type: MAGAZINE");
//                    }
//
//                    System.out.println("Enter the new Title: ");
//                    String title = sc.nextLine();
//
//                    item.setTitle(title);
//                    System.out.println("title Updated successfully!");
//                } else {
//                    System.out.println ("Item not found.");
//                }
//            }
//        }
//    }
    public void editTitleItem() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the ISBN to change the title: ");
        String isbn = sc.nextLine();

        Item found = null;
        for(Item item : itemList) {
            if(isbn.equals(item.getISBN())){
                found = item;
                break;
            }
        }
        if (found != null) {
            System.out.println ("Current Title: "+ found.getTitle());
            System.out.println("Publication year: " + found.getPublicationYear());
            if (found instanceof Book) System.out.println("Type - BOOK");
            else if (found instanceof DVD) System.out.println("Type - DVD");
            else if (found instanceof Magazine) System.out.println("Type - MAGAZINE");

            System.out.println("Enter the new title: ");
            String newTitle = sc.nextLine();

            found.setTitle(newTitle);
            System.out.println("Title updated successfully!");
        } else {
            System.out.println("Item not found");
        }
    }

    public void runGUI() {
        ItemTableGUI table = new ItemTableGUI(itemList);
        table.setVisible(true);

    }
}
