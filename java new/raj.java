import java.util.Scanner;
import mypackage.Myclass;
public class raj{
    public static void main(String[]args){
        Scanner intake = new Scanner(System.in);

        System.out.print("Enter the Name: ");
        String name = intake.nextLine();

        System.out.println("Welcome " + name +"..! to virtual world" );
        Myclass obj = new Myclass();
        obj.main(args);

    }
}