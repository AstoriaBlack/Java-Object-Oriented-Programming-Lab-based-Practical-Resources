public class Test_2_var {
    public static void main(String[] args) {
        IdentifyVariables var = new IdentifyVariables();
        IdentifyVariables var2 = new IdentifyVariables();

        var.y = 3;
        var2.y = 4;
        //y static variable make copy for each instance so only the same instance can change it
        var.x = 8;
        System.out.println("var.x = " + var.x);
        //since it is a class variable everytime someone changes it, it changes for the whole class
        //even when it is different instances

        var2.x = 9;
        //both are similar to IdentifyVariables.x = value

        System.out.println("var.y = " + var.y);
        System.out.println("var2.y = " + var2.y);
        System.out.println("var.x = " + var.x);
        System.out.println("var2.x = " + var.x);
        System.out.println("IdentifyVariables.x = " + IdentifyVariables.x);
    }
}
