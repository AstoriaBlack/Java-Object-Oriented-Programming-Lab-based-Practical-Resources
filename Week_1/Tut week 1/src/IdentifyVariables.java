public class IdentifyVariables {
    public static int x = 7;
    public int y = 3;


    public static void main(String[] args) {
        IdentifyVariables a = new IdentifyVariables();
        IdentifyVariables b = new IdentifyVariables();

        a.y = 5; // This modifies the instance variable y of object a
        b.y = 6;
        a.x = 1;
        b.x = 2;
        //IdentifyVariables.x = 3; // This modifies the static variable x of the class all a.x, b.x will be 3

        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("IdentifyVariables.x = " + IdentifyVariables.x);

    }
}

