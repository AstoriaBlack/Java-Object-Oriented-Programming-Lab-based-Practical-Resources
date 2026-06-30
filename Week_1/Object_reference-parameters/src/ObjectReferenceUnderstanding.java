public class ObjectReferenceUnderstanding {

    /*Java always uses "call-by-value" for parameter passing.
    For primitives, the value itself is copied. For objects, the reference (memory address) is copied,
    not the object itself.  Example:
    For primitives: Changing the parameter inside the method does not affect the original variable.
    For objects: The reference is copied, so both the method and the caller refer to the same object.
    Changing the object's state inside the method affects the original object.*/

    // File: src/CallByValueDemo.java

        public static void changePrimitive(int x) {
            x = 42; // Only changes the local copy
        }

        public static void changeObject(Account acc) {
            acc.setBalance(999); // Changes the original object's state
            acc = new Account(1000); // Only changes the local reference. doesn't affect the original reference
        }

        public static void main(String[] args) {
            int num = 10;
            changePrimitive(num);
            System.out.println("num after changePrimitive: " + num); // 10

            Account myAcc = new Account(100);
            changeObject(myAcc);
            System.out.println("myAcc balance after changeObject: " + myAcc.getBalance()); // 999
        }

        //num is unchanged because only a copy was passed.
    //myAcc's balance is changed because the method modified the object via the copied reference.
    // However, reassigning acc inside the method does not affect myAcc in main.


}
