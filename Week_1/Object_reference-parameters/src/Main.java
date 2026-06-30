public class Main {

    public static void changePrimitive(int number) {
        number = 100;
    }

    public static void changeObject(Account account) {
        account. setBalance(999); //this changes the object's internal state
        account = new Account(1000); //This reassignment doesn't affect the caller because the reassignment is local to the method.
    }

    public static void main(String[] args) {
        //part 1: object reference

        Account acc1 = new Account(200);
        Account acc2 = new Account(100);

        System.out.println("Before joinAccount:");
        System.out.println("acc1 balance: " + acc1.getBalance());
        System.out.println("acc2 balance: " + acc2.getBalance());

        acc1.joinAccount(acc2);

        System.out.println("After joinAccount:");
        System.out.println("acc1 balance: " + acc1.getBalance()); // Should be 300
        System.out.println("acc2 balance: " + acc2.getBalance()); // Should be 0

        // Part 2: Object reference passed to method
        //Account is actually a new type, not a primitive type
        //we can say Account is a user defined type
        Account acc3 = new Account(50);
        changeObject(acc3);

        System.out.println("After changeObject:");
        System.out.println("acc3 balance: " + acc3.getBalance()); // Should be 999, NOT 1000

        // Part 3: Primitive value
        int number = 10;
        changePrimitive(number);
        System.out.println("After changePrimitive:");
        System.out.println("number: " + number); // Still 10




    }
}
