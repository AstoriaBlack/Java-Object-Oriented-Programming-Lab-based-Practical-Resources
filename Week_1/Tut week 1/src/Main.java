//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //declare am instance of circle class called circle1
        //invoke the default constructor
        Circle circle1 = new Circle();

        //invoke public methods
        System.out.println("The circle has radius of "+circle1.getRadius()+ "and area of " + circle1.getArea());

        //declare am instance of circle class called circle2
        //invoke the default constructor
        Circle circle2 =  new Circle(8);

        //invoke public methods

        System.out.println("The circle has radius of " + circle2.getRadius() + " and area of " +
                circle2.getArea());

        //declare am instance of circle class called circle2
        //invoke the default constructor

        Circle circle3 = new Circle(5,"Red");
        //invoke public methods

        System.out.println("The circle has radius of " + circle3.getRadius() + " and area of " +
                circle3.getArea()+" Colour of "+ circle3.getColour());

        //assigning new values

        circle3.setColour("Green");
        circle3.setRadius(21);

        //invoke public methods

        System.out.println("The circle has radius of " + circle3.getRadius() + " and area of " +
                circle3.getArea()+" Colour of "+ circle3.getColour());

        //System.out.println(circle3); shows Circle@66a29884 without toString
        System.out.println(circle3);
        System.out.println(circle3.toString());

        //----.equal() method checking with Dog class
        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Rex");

        System.out.println("dog1 equals dog2: " + dog1.equals(dog2));//since I hadn't overriden it yet, the result appears false
        //after overriding it says true because i modified it to compare the names of the dogs as well as same instances

    }

}