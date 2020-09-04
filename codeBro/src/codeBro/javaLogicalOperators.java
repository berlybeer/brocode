package codeBro;
import java.util.Scanner;

public class javaLogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// &AND logical operator
		// OR logical operator
		
		// if((x>=36) && (x<=38)){}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Give me your temperature: ");
		
		int bodyTemp = scan.nextInt();
		
		if(bodyTemp>38) {
			System.out.println("You are in trouble!");
		}
		else if((bodyTemp>=36) && (bodyTemp<=38)) {
			System.out.println("Everything is a-okay!");
			
		}
		else {
			System.out.println("You are probably dying!");
		}
		
		
		String response;
		
		System.out.println("Press 'Q' or 'q to exit the game:");

		
		response = scan.next();
		
		if((response.equals("q"))||(response.equals("Q"))) {
			System.out.println("You have left the game.");
		}
		else {
			System.out.println("You are still playing the game! pew pew!");
		}
		
		
		
		

	}

}
