import java.util.Scanner;

interface BankOperations {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class Account implements BankOperations {
    private String name;
    private String accountNumber;
    private double balance;
    
    public Account(String name, String accountNumber, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! Current Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient funds. Current Balance: " + balance);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Current Balance: " + balance);
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Create Account:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Account Number: ");
        String accountNumber = scanner.nextLine();
        
        System.out.print("Initial Balance: ");
        double initialBalance = scanner.nextDouble();
        
        Account account = new Account(name, accountNumber, initialBalance);
        
        System.out.print("Deposit Amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        
        System.out.print("Withdraw Amount: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
        
        scanner.close();
    }
}
