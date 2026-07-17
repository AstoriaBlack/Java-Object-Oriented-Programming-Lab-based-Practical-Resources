package librarycentre_package;

public class DVD extends Item{

    private String genre;
    private String director;

    public DVD (String title, String ISBN) {
        super(title,ISBN);
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return super.toString() + " , Genre: " + genre +
                " , Director: " + director;
    }
}
