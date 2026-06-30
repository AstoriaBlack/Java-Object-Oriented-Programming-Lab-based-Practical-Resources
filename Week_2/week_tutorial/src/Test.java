//A test class for director class

public class Test {
    public static void main(String[] args) {
        //Test constructor
        Director director = new Director("James", "Cameron");

        //Test setters and getters

        //first create an object date to represent the dob
        Date dob = new Date(16,8,1954);
        director.setDob(dob);

        director.setMovienum(23);

        System.out.println(director); //toString()
        System.out.println("name is: " + director.getName());
        System.out.println("surname is: " + director.getSurname());
        System.out.println("dob is: " + director.getDob());
        System.out.println("number of directed movies is: " + director.getMovienum());


    }
}
