package tutorial05_shapecollection;

public class mainMenu {
    public static void main(String[] args) {
        //create a parking
        ShapeCollection sys = new GeometricShapeCollection(3);
        boolean exit = false;

        while (!exit) {
            exit = sys.runMenu();
        }
    }
}
