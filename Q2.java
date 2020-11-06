
import java.util.Scanner;
public class Q2
{ 
public static void main(String[] args) 
{ 
	
	 Scanner sc = new Scanner(System.in); 
	 int cases=1;
	 int user=0,comp=0;
	 
	 while(cases<4) {
    String personPlay;  
    String computerPlay = ""; 
    int computerInt; 
    String response; 
  

    System.out.println("Hey, let's play Rock, Paper, Scissors!\n" + 
                       "Please enter a move.\n" + "Rock = R, Paper" + 
                       "= P, and Scissors = S.");

    System.out.println();

    computerInt = (int)(Math.random()*3)+1;

    if (computerInt == 1) 
       computerPlay = "R"; 
    else if (computerInt == 2) 
       computerPlay = "P"; 
    else if (computerInt == 3) 
       computerPlay = "S"; 

    System.out.println("Enter your play: "); 
    personPlay = sc.next();
    personPlay = personPlay.toUpperCase(); 

    System.out.println("Computer play is: " + computerPlay); 

    if (personPlay.equals(computerPlay)) 
       System.out.println("It's a tie!"); 
    else if (personPlay.equals("R")) {   
       if (computerPlay.equals("S")) {
          System.out.println("Rock crushes scissors. You win!!");
    		user++;}
    else if (computerPlay.equals("P")) {
            System.out.println("Paper eats rock. You lose!!"); 
            comp++;}}
    else if (personPlay.equals("P")) {
       if (computerPlay.equals("S")) {
       System.out.println("Scissor cuts paper. You lose!!"); 
       comp++;}
    else if (computerPlay.equals("R")) {
            System.out.println("Paper eats rock. You win!!"); 
            user++;}}
    else if (personPlay.equals("S")) {
         if (computerPlay.equals("P")) { 
         System.out.println("Scissor cuts paper. You win!!"); 
         user++;}
    else if (computerPlay.equals("R")) {
            System.out.println("Rock breaks scissors. You lose!!"); 
            comp++;}}
    else 
         System.out.println("Invalid user input."); 
    cases++;
    }
	 if (user==comp) {
		 System.out.println("The game has tied.");
	 }
	 else {
		 if(user>comp) {
			 System.out.println("Round 3 is over. User won "+user+"game, You have won!!");
		 }
		 else {
			 System.out.println("Round 3 is over. User won "+user+"game, You lost!!");
		 }
		 
	 }
}
}