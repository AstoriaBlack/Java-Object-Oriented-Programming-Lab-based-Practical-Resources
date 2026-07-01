public class Cylinder extends Circle {
    private double height;

    //default constructor
    public Cylinder() {
        super();//call the superclass Circle constructor with no args
        height = 1.0;
    }

    //constructor with default radius, color but given height
    public Cylinder(double height) {
        super();
        this.height = height;
    }

    //constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius);//call the superclass constructor Circle(r) since there is one parameter
        this.height = height;
    }

    //public method to retrieve height
    public double getHeight() {
        return height;
    }

    //public method for computing the volume of cylinder
    //use superclass method getArea to get the base area
    public double getVolume() {
        return getArea()*height;
    }
    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height
                + 2 * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString()+ " height=" + height;
    }

}
