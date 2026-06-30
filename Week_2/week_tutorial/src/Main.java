//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Date dob = new Date(16, 8, 1954);

        //first create a director instance to create the movie instance
        Director d1 = new Director("James", "Cameron",24,dob);

        System.out.println(d1); //directors toString

        //now test Movie constructor
        Movie movie = new Movie("Avatar", "Fantasy", d1);
        //testing setters and getters
        movie.setNumAward(25);

        System.out.println(movie);//movie's toString

        System.out.println(movie);
        System.out.println("Title: "+movie.getTitle());
        System.out.println("Category: "+ movie.getCategory());
        System.out.println("Director name: "+movie.getDirector().getWholeName());
        System.out.println("number of awards is: "+movie.getNumAward());


    }

}