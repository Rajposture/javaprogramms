import java.util.Scanner;

public class atm1 {
    private String pin;
    private double balance;
    Scanner input = new Scanner (System.in);

    public void createpin(){ // pincode make..
        System.out.println("Create the PINCODE: ");
        pin = input.nextLine();
        System.out.println("Enter the Amount/Balance: ");
        balance = input.nextDouble();
        System.out.println("Pin sucessfully created..!");
    }
    public void changepin(){ // pincode change
        System.out.println("Enter the current PINCODE: ");
        String enterpin = input.nextLine();
        if(enterpin.equals(pin)){
            System.out.print("Enter new PINCODE: ");
            pin = input.nextLine();
            System.out.println("PINCODE changed scussfully: ");
        }else{
            System.out.println("NO CHANGING INVALID PINCODE..!");
        }

    }
    public void checkBalance() { //current balance
        System.out.print("Enter your PINCODE: ");
        String enteredPin = input.nextLine();
        if (enteredPin.equals(pin)) {
            System.out.println("Your current Balance is: " + balance);
        } else {
            System.out.println("INVALID PINCODE");
        }
    }
    public void savingaccount(){ //saving account add / check balance.
        System.out.println(" Welcome to the Saving account");
        System.out.print("Enter your PINCODE: ");
        String enteredPin = input.nextLine();
        System.out.print("Enter the $ ammount to save: ");
        double saveammount = input.nextDouble();
        System.out.println("The $ ammount added successfully :"+saveammount);
    }
    public void withdraw() { //withdraw money..
        System.out.print("Enter your pin: ");
        String enteredPin = input.nextLine();
        if (enteredPin.equals(pin)) {
            System.out.print("Enter amount to withdraw: ");
            double amount = input.nextDouble();
            input.nextLine();
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Please collect your cash. Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient $ balance !");
            }
        } else {
            System.out.println("SORRY INVALID PINCODE..!");
        }
    }
    public void menu() {
        while (true) {
            System.out.println("\n💸WELCOME TO ATM💰");
            System.out.println("Hey vetran , ATM Service Avaliable");
            System.out.println("1. Press 1 to check balance.");
            System.out.println("2. Press 2 to withdraw.");
            System.out.println("3. Press 3 to Create pin.");
            System.out.println("4. Press 4 to Change pin.");
            System.out.println("5. Press 5 to acess Saving account.");
            System.out.println("6. Enter clear.");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:checkBalance(); break;
                case 2: withdraw();; break;
                case 3:createpin();; break;
                case 4: changepin(); break;
                case 5: savingaccount();break;
                case 6: {
                    System.out.println("clear.");
                    String clear = input.next();
                }
                default: System.out.println("Invalid option !");
            }
        }
    }

    public static void main(String[] args) {
        atm1 raj = new atm1();
        raj.menu();
    }
}