import java.util.InputMismatchException;
import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Star Astric Pyramid");
        System.out.print("Enter the no. of rows you want in the pyramid: ");

        try {
           int row = input.nextInt();
            new Pyramid().operation(row);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input you Entered an Alphabate / Character..");
            System.out.println("What the hell");
            System.exit(2);
        }

            }
private void operation(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}






