package librarycentre_package;

public abstract class Item implements Comparable<Item> {
    private String title;
    private String ISBN;
    private int publicationYear;

    //constructor
    public Item(String title, String ISBN) {
        this.title = title;
        this.ISBN = ISBN;
    }

    //getters and setters

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    @Override
//    public int compareTo(Item other) {
//        return this.getPublicationYear() - other.getPublicationYear();
//    }
    public int compareTo(Item other) {
        return this.getTitle().compareTo(other.getTitle());
    }

    @Override
    public String toString() {
        return "Title: " + title + " , ISBN: "  + ISBN +
                " , Publication year: " + publicationYear;
    }

}
