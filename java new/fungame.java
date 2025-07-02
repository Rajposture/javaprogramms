import java.util.Scanner;
import java.util.Random;

public class fungame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random lucifer = new Random();
        String[] objects ={"Stone","Paper","scissor"};
        String player;
        String computer;
        String playagain = "yes";
        do{
            System.out.println("Welcome to the fun Game ");
        System.out.print("Enter your Diva Move( Stone, Paper ,Scissor): ");
       player = input.nextLine().toLowerCase();

       computer = objects[lucifer.nextInt(3)];
       System.out.println("Computer choice: "+computer);

       if(player.equals(computer)){
         System.out.println("Oh its Tie match.. !");

    }else if(player.equals("stone")&& computer.equals("scissor")){
        System.out.println("YOU WON THE GAME..!");
    }
        else if(player.equals("paper")&& computer.equals("stone")){
        System.out.println("YOU WON THE GAME..!");
    }
        else if(player.equals("scissor")&& computer.equals("paper")){
        System.out.println("YOU WON THE GAME..!");

       }else{
        System.out.println("Ohh NO..you Lose..!");
       }

if(!player.equals("stone")&&
 !player.equals("paper")&&
 !player.equals("scissor")){
    System.out.println("ohh..Sorry..! not valid object to play .");
    continue;
}
System.out.print("Want to play again(yes/no): ");
playagain = input.nextLine().toLowerCase();

        }while(playagain.equals("yes"));
        
        System.out.println("good bye..!");
        input.close();
 System.out.println("hello world");
    }
}
