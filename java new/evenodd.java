import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to number scanner");
        System.out.print("Please enter your number: ");
        int user = input.nextInt();
        if(user %2 == 0){
        //   System.out.println("your number is even..!");
        }else{
            System.out.println("your number is odd..!");
        }
input.close();
    }
}
