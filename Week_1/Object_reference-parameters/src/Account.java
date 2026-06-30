public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void joinAccount(int amount) {
        //Add the amount to this account's balance
        this.balance += amount;
    } //there can be multiple joinAccount methods, one with an int parameter and another with an Account parameter

    public void joinAccount(Account other) {
        //Add other account's balance to this one

        this.balance += other.getBalance();

        //Set other acc balance to zero

        other.setBalance(0);
    }
}