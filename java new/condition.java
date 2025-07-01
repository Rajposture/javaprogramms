import java.util.Scanner;

 class condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the grade checker ");
        System.out.println("Please Enter your percentage: ");
        int percentage = input.nextInt();
        char grade;
        if(percentage >= 90)
        System.out.println("you got A+");
        else if (percentage <= 85)
        System.out.println("you got B");
        else {
            // System.out.println("fail");
        }

        
     
input.close();
    }
}
