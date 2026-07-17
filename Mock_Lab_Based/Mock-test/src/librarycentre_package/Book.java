package librarycentre_package;

public class Book extends Item{

    private String author;

    public Book(String title, String ISBN) {
        super(title,ISBN);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return super.toString() + ", Author: " + author;
    }
}
