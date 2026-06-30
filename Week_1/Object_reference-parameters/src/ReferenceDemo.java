// File: src/ReferenceDemo.java
public class ReferenceDemo {
    public static void main(String[] args) {
        Account a = new Account(500);
        Account b = a; // b references the same object as a

        System.out.println("a balance: " + a.getBalance()); // 500
        System.out.println("b balance: " + b.getBalance()); // 500

        b.setBalance(300); // Change via b

        System.out.println("After b.setBalance(300):");
        System.out.println("a balance: " + a.getBalance()); // 300
        System.out.println("b balance: " + b.getBalance()); // 300

        // a goes out of scope after this block, but object still exists via b
        {
            Account c = b;
            c.setBalance(100);
            System.out.println("c balance: " + c.getBalance()); // 100
        } // c goes out of scope here

        System.out.println("After c goes out of scope:");
        System.out.println("b balance: " + b.getBalance()); // 100

        a = null; // Remove a's reference Default value if variable not initialised.
        // Object still exists because b references it

        b = null; // Now no references, object can be garbage collected
        //Garbage is automatically collected by JVM.
        //like a is null, b is also null now, so the object is eligible for garbage collection
    }
}