import java.util.Scanner;
import java.util.Random;

public class Guess_the_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int user_input;
        int comp_input;
        int count=1;
        int user_wins=0;
        int comp_wins=0;
        
        System.out.println("Enter your name:");
        String name= sc.nextLine();
        System.out.println("Welcome "+name);
        
        System.out.println("------------Rules Of The Game-------------");
        System.out.println("Rule 1: There will be only 5 rounds.");
        System.out.println("Rule 2: Guess the Number from 1 to 100.");
        System.out.println("Rule 3: If User wins 3 rounds then user will win the match.");
        System.out.println("Rule 4: If Computer wins 3 rounds then Computer will win the match.");
        System.out.println("--------------------------------");

        for(int i=1;i<=5;i++){
            System.out.println("Match:"+count);
            System.out.println("Enter Number:");
            user_input=sc.nextInt();
            comp_input=rand.nextInt(100);
            
            if(user_input<comp_input){
            System.out.println("Computer wins!!!!");
            System.out.println("The number you guessed is less than Computer choice");
            System.out.println("Computer choice is: "+comp_input);
            count++;
            comp_wins++;
        }
        else if(user_input==comp_input){
            System.out.println("User wins!!!!");
            System.out.println("The number you guessed is equal to Computer choice");
            count++;
            user_wins++;
        }
        else if (user_input>comp_input){
            System.out.println("Computer wins!!!!");
            System.out.println("The number you guessed is greater than Computer choice");
            System.out.println("Computer choice is: "+comp_input);
            count++;
            comp_wins++;
        }
        else{
            System.out.println("Invalid Choice!!!");
        }
        System.out.println("--------------------------------");
        System.out.println("Computer Wins: "+comp_wins);
        System.out.println("User Wins: "+user_wins);
        System.out.println("--------------------------------");
    }
    if(user_wins<comp_wins){
                System.out.println("Computer Wins The Match");
            }
            else if(user_wins>comp_wins){
                System.out.println("User Wins The Match");
            }
            else{
                System.out.println("Match got Tied");
            }
        System.out.println("--------------------------------");
    
}
}
