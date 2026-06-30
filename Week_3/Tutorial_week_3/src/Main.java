//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person p = new Person("Harry","Potter",29);
        p.displayName();
        System.out.println(p.getWholeName());


        p.setSurname("Wellington");

        System.out.println("Name: "+ p.getWholeName());
        System.out.println("Age: " + p.getAge());

        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " +
                c1.getArea());

        Circle c2 = new Circle(2);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " +
                c2.getArea());

        System.out.println("The color of both circle is: "+ c2.getColor());

        Circle c3 = new Circle(3.14,"Red");

        System.out.println("The Circle 3 is: "+ c3.getColor()+ " and the area is: "+ Math.round(c3.getArea()));

        System.out.println("Class with toString: "+c3.toString());
        System.out.println("Class without toString: "+c3);
        //there isn't any differences because we already call the method to print in console, we can just override it tho

    }
    }
