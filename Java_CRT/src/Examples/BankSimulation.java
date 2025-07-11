package Examples;

import java.util.Scanner;

class User {

    private String UserName;
    private int pin;
    private long balance;

    public User(String userName, int pin, long balance) {
        UserName = userName;
        this.pin = pin;
        this.balance = balance;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}

class ATM {

    private int atmId;

    public ATM(int atmId) {
        this.atmId = atmId;
    }

    public int getAtmId() {
        return atmId;
    }

    public void setAtmId(int atmId) {
        this.atmId = atmId;
    }
}

class Bank {

    public void showUserDetails(User user) {
        System.out.println("Examples.User Name: " + user.getUserName());
        System.out.println("Balance: " + user.getBalance());
    }

    public void checkBalance(User user) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();
        if (pin != user.getPin()) {
            System.out.println("Invalid PIN");
            return;
        }
        System.out.println("Balance: " + user.getBalance());
    }

    public void withdraw(User user, long amount, int pin) {
        if (pin != user.getPin()) {
            System.out.println("Invalid PIN");
            return;
        }
        if (amount > user.getBalance()) {
            System.out.println("Insufficient balance");
        } else {
            user.setBalance(user.getBalance() - amount);
            System.out.println("Withdrawal of Rs. " + amount + " successful");
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        User user = new User("Ansh", 1234, 10000);
        ATM atm = new ATM(1234);
        Bank bank = new Bank();


        System.out.println("==================");
        System.out.println("Welcome to Examples.Bank");
        System.out.println("==================");
        System.out.println("Examples.User details:");
        bank.showUserDetails(user);
        System.out.println("==================");

        System.out.println("Examples.ATM ID: " + atm.getAtmId());
        bank.showUserDetails(user);

        System.out.println("Checking balance...");
        bank.checkBalance(user);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        long amount = sc.nextLong();
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();
        bank.withdraw(user, amount, pin);

        System.out.println("Examples.User details updated");
        bank.showUserDetails(user);
        sc.close();
    }
}
