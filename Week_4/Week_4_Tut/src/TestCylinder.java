public class TestCylinder {
    public static void main(String[] args) {
        //declare and allocate a new instance of cylinder
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                        + " radius=" + c1.getRadius()
                        + " height=" + c1.getHeight()
                        + " base area=" + c1.getArea()
                        + " volume=" + c1.getVolume());

        //declare and allocate a new instance of cylinder, specifically height
        Cylinder c2 = new Cylinder(5.0);
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume());

        //declare and allocate a new instance of cylinder specifying radius and height
        Cylinder c3 = new Cylinder(5,10);

        System.out.println(c3);

        Circle circle = new Circle(5);

        System.out.println();

        System.out.println("Circle Area = " + circle.getArea());

        System.out.println("Cylinder Surface Area = "
                + c3.getArea());



    }
}
