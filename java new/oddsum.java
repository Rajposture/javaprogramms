import java.util.Scanner;

public class oddsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the sum of odd numbers");
        System.out.print("PLEASE ENTER YOUR NUMBER: ");
        int num = input.nextInt();
       int sum = oddsum(num);
       System.out.println("oddsum till"+ num + " is: "+sum);

    };
public static int oddsum (int num){
    int i = 1;
    int sum = 0;
     
while(i<=num){
 sum = sum +i ;
i +=2;
}
return sum;
}

}

