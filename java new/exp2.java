class pen{
   String color; 
   String type;
   String company;
   int rating;
   public void penwork(){
    System.out.println("pen is writting..");
   }
   pen(String c,String t,String co,int r){
color = c;
type = t;
company = co;
rating = r;
   }
   void display(){
    System.out.println("Pen color: "+color);
 System.out.println("Pen type: "+type);
 System.out.println("Pen company: "+company);
 System.out.println("Pen rating: "+rating);
   }
}

public class exp2 {
    public static void main(String[] args) {
       pen p1 = new pen("blue", "ballpoint", "mortex", 2);
       p1.penwork();
       p1.display();
    }

}
