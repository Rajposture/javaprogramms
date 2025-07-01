import java.util.Scanner;

public class compoundintrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculating the simple intrest");
System.out.print("Enter the Principal amount: ");
int p = input.nextInt();
System.out.print("Enter the rate of intrest: ");
int r = input.nextInt();
System.out.print("Enter the time period: ");
int t = input.nextInt();
int compoundintrest = p*(1+r/100)*t;
System.out.println("The simple INTREST is :"+compoundintrest+"");
input.close();
    }
}
