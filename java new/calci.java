import java.util.Scanner;

public class calci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Raj's calculator");
        double result;

        System.out.print("Enter the 1st operand: ");
        int num1 = input.nextInt();

        System.out.println("Enter any Arithematic Operator Given below: ");
        System.out.print(" + , - , * , / , %: ");
        char operator = input.next().charAt(0);

        System.out.print("Enter the 2nd operand: ");
        int num2 = input.nextInt();

        switch(operator){
            case '+':
            result = num1 + num2;
            System.out.print("Result = " +result);
            break;
            case'-':
            result  = num1 - num2;
            System.out.print("Result: "+result);
            break; 
            case'*':
            result  = num1 * num2;
            System.out.print("Result: "+result);
            break;
            case'/':
            result  = num1 / num2;
            System.out.print("Result: "+result);
            break;
            case'%':
            result  = num1 % num2;
            System.out.print("Result: "+result);
            break;
            default:
            System.out.println("invalid operator");
            input.close();

        }
    }
}
