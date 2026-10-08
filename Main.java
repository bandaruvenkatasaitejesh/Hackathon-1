import java.util.*;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int n, String name, double b) {
        accountNumber = n;
        accountHolderName = name;
        balance = b;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    double checkBalance() {
        return balance;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        double b = sc.nextDouble();

        BankAccount a = new BankAccount(n, name, b);

        a.deposit(sc.nextDouble());
        a.withdraw(sc.nextDouble());

        a.displayAccount();

        sc.close();
        
    }
}