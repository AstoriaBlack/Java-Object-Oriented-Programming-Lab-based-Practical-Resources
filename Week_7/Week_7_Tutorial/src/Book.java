public class Book implements Comparable<Book> {
    //here this means u compare a Book with another Book
    private String title;
    private double price;
    private Date date;
    private String author;

    public Book(String title, double price, Date date, String author) {
        this.title = title;
        this.price = price;
        this.date = date;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    public Date getDate() {
        return date;
    }
    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

//    @Override
//    public int compareTo(Book b) {
//        return this.getDate().getYear() - b.getDate().getYear();
//    }
    @Override
    public int compareTo(Book b) {
        return this.title.compareTo(b.getTitle());
    }

    @Override
    public String toString() {
        return "Book name: " + title + ", price: $" + price + ", date: " + date + ", author: " + author;
    }
}
