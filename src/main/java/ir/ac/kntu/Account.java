package ir.ac.kntu;

/**
 * @author your name
 */
public class Account {
    private Long number;
    private Double balance;

    //Constructor has been created for you
    public Account(long number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    void deposit(double amount) {
        //delete this line of code and write the body required for this method
        throw new UnsupportedOperationException("Delete this line - deposit");
    }

    void withdraw(double amount) {
        //delete this line of code and write the body required for this method
        throw new UnsupportedOperationException("Delete this line - withdraw");
    }

    public Long getNumber() {
        return number;
    }

    public Double getBalance() {
        return balance;
    }

    // Don't mind the following method, you will learn about it in the next week
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", balance=" + balance +
                '}';
    }
}
