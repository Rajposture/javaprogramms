import java.util.Scanner;

public class newcase  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the bar...! ");
        System.out.print("Please Enter your name: ");
        String username = input.next();
        System.out.print("Please Enter your gender: ");
        String gender = input.next();
        switch(gender){
            case"male":
            System.out.println("Mr."+username);
            break;
            case"female":
            System.out.println("Mrs."+username);
            break;
            default:
            System.out.println("Not a valid gender");
        }
         input.close();
    }
}
