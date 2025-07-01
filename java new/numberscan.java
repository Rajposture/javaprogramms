import java.util.Scanner;

public class numberscan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE NUMBER SCANNER \n");
        System.out.print("Please enter your number: ");
        int usernum = input.nextInt();
         
        if(usernum > 0 ){
            System.out.println("your number is positive..!");
        }
            else if(usernum < 0){
                System.out.println("your number is negative..!");
            }else{
                    System.out.println("your number is 0..!");
                }
                input.close();
            }
        }
    

