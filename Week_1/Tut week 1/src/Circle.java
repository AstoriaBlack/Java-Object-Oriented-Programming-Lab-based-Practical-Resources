public class Circle {

    private String colour;
    private double radius;

    //default constructor with no arguments
    public Circle() {
        this.radius = 1;
        this.colour = "Blue";
    }

    //second constructor takes as argument the radius but has default colour
    public Circle(double r) {
        this.radius = r;
        this.colour = "Blue";
    }

    //Third constructor

    public Circle(double r, String c){
        this.radius = r;
        this.colour = c;
    }

    //public method to retrieve the radius

    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

    //Setters
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public void setColour(String newColour){
        this.colour = newColour;
    }

    //public method to compute and returm the area of circle

    public double getArea() {
        return radius*radius*Math.PI;}

    //toString method
    public String toString() {
        return "Circle[radius= "+ radius + ", colour= " + colour + "]";    }


}
