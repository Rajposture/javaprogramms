import java.util.Scanner;
public class prachi{

    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO AGE COUNTER FOR GEN Z's");
        int presentyear = 2025;
        System.out.print("Enter the fucking year you came out: ");
        int useryear = input.nextInt();
        int result = presentyear - useryear;
        System.out.print("WTF..! Your agee is: "+result+"");
        input.close();
    }
}
