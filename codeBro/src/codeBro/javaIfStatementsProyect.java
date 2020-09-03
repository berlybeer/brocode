package codeBro;
import java.util.Random;
import java.util.Scanner;

public class javaIfStatementsProyect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		int guess;
		int answer;
		
		answer = random.nextInt(5)+1;
		
		System.out.println("What is your guess (#1-5): ");
		guess = scan.nextInt();
		
		if(guess>answer) {
			System.out.println("That guess was too high! Answer: " + answer);
		}else if(guess<answer) {
			System.out.println("That guess was too low! Answer: " + answer);
		}else {
			System.out.println("That guess is the correct Answer: " + answer);
		}
		
		scan.close();
			

	}

}
