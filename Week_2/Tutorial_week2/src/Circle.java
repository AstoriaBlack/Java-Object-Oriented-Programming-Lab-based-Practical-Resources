public class Circle {
    private double radius;
    private String color ;

    //constructer with no args
    public Circle() {
        radius = 0.0;
        color = "Blue";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "Blue";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }


}
