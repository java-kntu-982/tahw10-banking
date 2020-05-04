package ir.ac.kntu;

import java.util.Arrays;

/**
 * @author your name
 */
public class Bank {
    private Account[] accounts;

    public Bank(Account[] accounts) {
        this.accounts = accounts;
    }

    public Account findAccountByNumber(long accountNumber) {
        for (var account : accounts) {
            if (account.getNumber().equals(accountNumber)) {
                return account;
            }
        }
        //This is an Unchecked Exception
        throw new NoSuchAccountNumberException();
    }

    public void deposit(long accountNumber, double amount) throws OperationFailedException {
        // TODO
        //this method might throw OperationFailedException
        throw new OperationFailedException("Not implemented yet!");
    }

    public void withdraw(long accountNumber, double amount) throws OperationFailedException {
        // TODO
        //this method might throw OperationFailedException
        //UnsupportedOperationException is an Unchecked Exception
        throw new UnsupportedOperationException("Delete me - withdraw in bank");
    }


    public boolean handleTransaction(double amount, long from, long to) {
        //withdraw then deposit
        // TODO this method should not throw any exceptions
        //UnsupportedOperationException is an Unchecked Exception
        throw new UnsupportedOperationException("Delete me->handleTransaction");
    }

    public void addToAccounts(Account account) {
        Account[] newAccounts = new Account[accounts.length + 1];
        for (int i = 0; i < accounts.length; i++) {
            newAccounts[i] = accounts[i];
        }
        newAccounts[accounts.length] = account;
        accounts = newAccounts;
    }

    public Account[] getAccounts() {
        Account[] copy = new Account[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            copy[i] = new Account(accounts[i].getNumber(), accounts[i].getBalance());
        }
        return copy;
    }

    public String toString() {
        return "Bank{" +
                "accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
