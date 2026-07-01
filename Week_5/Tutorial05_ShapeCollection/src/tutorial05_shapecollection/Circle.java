/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial05_shapecollection;

/**
 *
 * @author Barbara
 */
public class Circle extends GeometricObject {

    protected double radius;
    
    public Circle(){
        colour = "blue";
        filled = false;
        radius = 1;
    }
    
    public Circle(double radius){
        colour = "blue";
        filled = false;
        this.radius = radius;
    }
    
    public Circle(double radius, String colour, boolean filled){
        this.colour = colour;
        this.filled = filled;
        this.radius = radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public  String getShape() {
        return "Circle";
    }

    public String toString(){
       return "Color = " + colour + ", Filled = " + filled + ", Radius = " + radius;
    }
    
}


