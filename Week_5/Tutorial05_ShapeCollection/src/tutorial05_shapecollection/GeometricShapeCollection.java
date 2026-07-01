package tutorial05_shapecollection;

import java.util.Locale;
import java.util.Scanner;

public class GeometricShapeCollection implements ShapeCollection {
    private GeometricObject[] shapelist;
    private int maxNumShape;
    private static int totalNumShape = 0;

    public GeometricShapeCollection(int listLength) {
        this.maxNumShape = listLength;
        shapelist = new GeometricObject[maxNumShape];
    }

    @Override
    public void addShape(GeometricObject shape) {
        //check if there are spaces and add the shape to the list
        if(totalNumShape < maxNumShape ) {
            shapelist[totalNumShape] = shape;
            totalNumShape++;
        }
        else {
            System.out.println("No more spaces in the List");
        }
    }

    @Override
    public void printShapeList() {
        for (int i = 0; i < totalNumShape; i++) {
            //if(shapelist[i].getShape().equals("Circle"))
            //.equals() measures if it is the exact string, if we use instanceof
                // The instanceof keyword checks whether an object is an instance of a specific class or an interface.
                //Here, Java checks the actual object type, not a string
//            if(shapelist[i] instanceof Circle)
//                {
//                System.out.println("Shape = Circle, Area = "+ shapelist[i].getArea()
//                + " Perimeter = "+ shapelist[i].getPerimeter());
//            }

            //since we had already overriden getShape on each class
            System.out.println(
                    "Shape = " + shapelist[i].getShape()
                            + ", Area = " + shapelist[i].getArea()
                            + ", Perimeter = " + shapelist[i].getPerimeter()
            );
        }
    }
    //runmenu for users to interact with a console menu

    @Override
    public boolean runMenu() {
        boolean exit = false;

        System.out.println("To add a new shape press 1");
        System.out.println("To print the list of the shapes press 2");
        System.out.println("To exit press 3");

        Scanner scan = new Scanner (System.in);
        int choice = scan.nextInt();

        switch(choice) {
            case 1:
                //check if there is more space in the system to add a new geometric object
                if(GeometricShapeCollection.totalNumShape < maxNumShape) {
                    System.out.println("Press 1 if you want to add a Circle");
                    System.out.println("Press 2 if you want to add a Rectangle");
                    System.out.println("Press 3 if you want to add a Square");

                    int choice2 = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Enter the color of your shape: ");
                    String colour = scan.nextLine();

//                    System.out.println("Is it filled? (y/n) ");
                    String isFilled = scan.nextLine().toLowerCase(Locale.ROOT);
                    boolean filled = false;

//                    if (isFilled.equals("y")) {
//                        filled = true;
//                    } else if (isFilled.equals("n")) {
//                        filled = false;
//                    }else {
//                        filled = false; //false by default
//                    }
                    //better validation
                    while (true) {

                        System.out.print("Is it filled? (y/n): ");
                        String input = scan.nextLine().trim().toLowerCase();

                        if (input.equals("y")) {
                            filled = true;
                            break;
                        }

                        if (input.equals("n")) {
                            filled = false;
                            break;
                        }

                        System.out.println("Invalid input! Please enter y or n.");

                    }
                    switch (choice2) {
                        case 1:
                            //it is a circle
                            System.out.println("Insert the radius");
                            int radius = scan.nextInt();
                            Circle c = new Circle(radius,"Red",filled);
                            this.addShape(c);
                            break;
                        case 2:
                            //Rectangle
                            System.out.println("Insert the height");
                            int height = scan.nextInt();
                            System.out.println("Insert the width");
                            int width = scan.nextInt();
                            Rectangle r = new Rectangle(height,width,"Green",false);
                            this.addShape(r);
                            break;
                        case 3:
                            System.out.println("Insert the side length");
                            int side = scan.nextInt();
                            Square s = new Square(side,"Purple",filled);
                            this.addShape(s);
                            break;

                    }
                }
                break;
                case 2:
                    this.printShapeList();
                    break;

                case 3:
                    exit = true;
                    break;
            }
            return exit;
        }
}
