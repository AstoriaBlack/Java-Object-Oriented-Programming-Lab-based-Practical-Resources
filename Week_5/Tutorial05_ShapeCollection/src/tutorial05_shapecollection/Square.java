package tutorial05_shapecollection;

public class Square extends GeometricObject{

    protected double side;

    public Square() {
        colour = "blue";
        filled = false;
        side = 1.0;
    }

    public Square(double side) {
        colour = "blue";
        filled = false;
        this.side = side;
    }

    public Square(double side, String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    public String getShape() {
        return "Square";
    }

    public String toString() {
        return "Color = " + colour + ", Filled = " + filled + ", Side = " + side;
    }
}
