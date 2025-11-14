
import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();

            System.out.print("Enter denominator: ");
            int den = sc.nextInt();

            int result = num / den;
            System.out.println("Result: " + result);

          
            if (result < 0) {
                throw new ArithmeticException("Result cannot be negative!");
            }

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e);
        } finally {
           
            System.out.println("Finally block executed (resource cleanup).");
            sc.close();
        }

        System.out.println("Program continues after exception handling...");
    }
}

