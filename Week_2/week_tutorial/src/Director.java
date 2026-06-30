public class Director {
    private String name;
    private String surname;
    private int movienum;
    private Date dob;

    public Director(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Director(String name, String surname, int movienum, Date dob) {
        this.name = name;
        this.surname = surname;
        this.movienum = movienum;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getWholeName() {
        return name + " " + surname;
    }
    public int getMovienum() {
        return movienum;
    }
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    public void setMovienum(int movienum) {
        this.movienum = movienum;
    }

    @Override
    public String toString() {
        return "Director [name=" + name + ", surname=" + surname + ", Date of Birth= " + dob.getDate() +  ", Number of Movies=" + movienum;
    }

}
