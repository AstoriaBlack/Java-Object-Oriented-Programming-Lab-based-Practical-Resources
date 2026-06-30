public class Account {
    private double balance = 0;

    public Account(double balance) {
        this.balance = balance;
    }
// The synchronized method will ensure that only one class
//can access the data at one time, other operations have to
//wait until the first operation finishes

    public synchronized void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Can't deposit.");
        }
        else {
            this.balance += amount;
            System.out.println("Deposit " + amount + " in thread "
                    + Thread.currentThread().getId() + ", balance is " + balance); //.currentThread().getId() returns the ID of the current running thread
        }
    }

    public synchronized void withdraw(double amount) {
        if (amount < 0 || amount > this.balance) {
            System.out.println("Can't withdraw.");
        }
        else {
            this.balance -= amount;
            System.out.println("Withdraw " + amount + " in thread "
                    + Thread.currentThread().getId() + ", balance is " + balance);
        }
    }
}
