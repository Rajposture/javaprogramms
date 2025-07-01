import java.util.Scanner;

public class tables {
  
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplications world \n");
        System.out.print("PLease enter any Number: ");
       int num = input.nextInt();
      multiplictiontable(num);

    }
    public static void multiplictiontable(int num){
        int i = 1;
        while (i<=10) {
            System.out.println(num +" X " + i + " = " +(num*i));
            i++;
        }
    }
}
