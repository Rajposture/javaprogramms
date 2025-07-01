import java.util.Scanner;
public class areaoftriangle {
public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("calculating the area of triangle");
    System.out.print("Enter the breadth of triangle: ");
    int breadth = input.nextInt();
    System.out.print("Enter the height of triangle: ");
    int height = input.nextInt();
    int Result= breadth*height*1/2;
    System.out.println("Area of triangle is:"+Result+"");
    input.close();
    
}
}
