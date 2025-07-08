import java.util.*;

class BankAccount {
    private String accowner;
    private String accountnum;
    private double balance;
    private List<String> transactionHistory;

    public BankAccount(String accowner, String accountnum) {
        this.accowner = accowner;
        this.accountnum = accountnum;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }
    public String getAccountNumber() {
        return accountnum;
    }

    public String getAccountHolder() {
        return accowner;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited Amount: " + amount);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactionHistory.add("Withdrew Amount: " + amount);
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Invalid withdrawal or insufficient balance.");
        }
    }

    public void TransactionHistory() {
        System.out.println("Transaction History for " + accowner+ ":");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}

public class bank {
    private static Map<String, BankAccount> accounts = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            showMenu();
            option = scanner.nextInt();
            scanner.nextLine();  

            switch (option) {
                case 1 -> createAccount();
                case 2 -> depositMoney();
                case 3 -> withdrawMoney();
                case 4 -> checkBalance();
                case 5 -> showTransactions();
                case 6 -> System.out.println("Exiting system. Thank you!");
                default -> System.out.println("Invalid option. Please try again.");
            }
        } while (option != 6);
    }

    private static void showMenu() {
        System.out.println("\n==RAJ RESERVE BANK OF INDIA==");
        System.out.println("==Bank services==");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Balance");
        System.out.println("5. Show Transaction History");
        System.out.println("6. Exit");
        System.out.print("Select an option: ");
    }

    private static void createAccount() {
        System.out.print("Enter Your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your Phone NO.: ");
        String phone = scanner.nextLine();
        System.out.print("Enter Your AGE: ");
        int age = scanner .nextInt();
        String accountNumber = String.format("%05d",new Random().nextInt(10000));
        BankAccount account = new BankAccount(name, accountNumber);
        accounts.put(accountNumber, account);
        System.out.println("Account created! Account Number: " + accountNumber);
    }

    private static BankAccount findAccount() {
        System.out.print("Enter account number: ");
        String accNum = scanner.nextLine();
        BankAccount account = accounts.get(accNum);
        if (account == null) {
            System.out.println("Account not found.");
        }
        return account;
    }

    private static void depositMoney() {
        BankAccount account = findAccount();
        if (account != null) {
            System.out.print("Enter deposit amount: ");
            double amount = scanner.nextDouble();
            account.deposit(amount);
        }
    }

    private static void withdrawMoney() {
        BankAccount account = findAccount();
        if (account != null) {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        }
    }

    private static void checkBalance() {
        BankAccount account = findAccount();
        if (account != null) {
            System.out.println("Current balance: " + account.getBalance());
        }
    }

    private static void showTransactions() {
        BankAccount account = findAccount();
        if (account != null) {
            account.TransactionHistory();
        }
    }
}
