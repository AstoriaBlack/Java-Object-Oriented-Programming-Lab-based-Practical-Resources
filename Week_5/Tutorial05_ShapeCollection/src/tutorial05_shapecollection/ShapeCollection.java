/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial05_shapecollection;


public interface ShapeCollection {
    public abstract void addShape(GeometricObject shape); 
    public abstract void printShapeList();
    public abstract boolean runMenu();
}