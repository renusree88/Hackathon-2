import java.util.Scanner;

class BankAccount {
    
    String accountNumber;
    String accountHolderName;
    double balance;

        BankAccount(String accNum, String accName, double initialBalance) {
        accountNumber = accNum;
        accountHolderName = accName;
        balance = initialBalance;
    }

       void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (amount > 0) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

        double checkBalance() {
        return balance;
    }

        void displayAccount() {
        System.out.println("\n--- Account Summary ---");
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Final Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                System.out.print("Enter account number: ");
        String accNum = sc.nextLine();

        System.out.print("Enter holder name: ");
        String accName = sc.nextLine();

        System.out.print("Enter starting balance: ");
        double balance = sc.nextDouble();

        
        BankAccount account = new BankAccount(accNum, accName, balance);

        
        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        account.deposit(dep);

                System.out.print("Enter withdrawal amount: ");
        double wdraw = sc.nextDouble();
        account.withdraw(wdraw);

        
        account.displayAccount();

        sc.close();
    }
}