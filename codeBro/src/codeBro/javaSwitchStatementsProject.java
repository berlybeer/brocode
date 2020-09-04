package codeBro;

import java.util.Scanner;
import java.util.Random;


public class javaSwitchStatementsProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		String playerGuess = null;
		String computerGuess = null;
		
		int randomNumber = random.nextInt(3)+1;
		
		switch(randomNumber) {
		
			case 1: {computerGuess = "ROCK";}
			break;
			
			case 2: {computerGuess = "PAPER";}
			break;
			
			case 3: {computerGuess = "SCISSORS";}
			break;
			
			default: {System.out.println("You broke the game...:(");}
		
		}
		
		System.out.println("Choose (rock, paper, or scissors):");
		playerGuess = scan.nextLine();
		
		switch(playerGuess.toUpperCase()) {
				case "ROCK":{ 
							if(computerGuess == "ROCK") {
								System.out.println("Computer: " + computerGuess);
								System.out.println("It was a draw! No winner...");
							}
							else if(computerGuess == "PAPER") {
								System.out.println("Computer: " + computerGuess);
								System.out.println("You lose!");
							}
							else if(computerGuess == "SCISSORS") {
								System.out.println("Computer: " + computerGuess);
								System.out.println("You win!");
							}else {
								System.out.println("You did not type in (rock, paper, scissors)");
							}
							
						}
				break;
				case "PAPER":{ 
					if(computerGuess == "ROCK") {
						
						System.out.println("Computer: " + computerGuess);
						System.out.println("You win!");
						
					}
					else if(computerGuess == "PAPER") {
						
						System.out.println("Computer: " + computerGuess);
						System.out.println("It was a draw! No winner...");
					}
					else if(computerGuess == "SCISSORS") {
						System.out.println("Computer: " + computerGuess);
						System.out.println("You lose!");
					}else {
						System.out.println("You did not type in (rock, paper, scissors)");
					}
					
				}
				break;
				
				case "SCISSORS":{ 
					if(computerGuess == "ROCK") {
						System.out.println("Computer: " + computerGuess);
						System.out.println("You lose!");
					}
					else if(computerGuess == "PAPER") {
						System.out.println("Computer: " + computerGuess);
						System.out.println("You win!");
					}
					else if(computerGuess == "SCISSORS") {
						System.out.println("Computer: " + computerGuess);
						System.out.println("It was a draw! No winner...");
					}else {
						System.out.println("You did not type in (rock, paper, scissors)");
					}
					
				}
				break;
				
				default: System.out.println("You did not type in (rock, paper, scissors)");
				
			}

		}

}
