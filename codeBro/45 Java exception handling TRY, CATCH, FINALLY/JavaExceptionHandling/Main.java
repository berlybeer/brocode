package JavaExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		boolean valid = false;
		do {
			try {
				System.out.println("Enter a whole number");
				int x = Integer.parseInt(scan.next());
				
				System.out.println("Enter a whole number to divide by");
				int y = Integer.parseInt(scan.next());
				
				
				int z = x/y;
				valid = true;
				
				System.out.println(z);
	
			}
			
			catch(NumberFormatException e) {
				System.out.println("That is not a whole number!");
			}
	//		
	//		catch(InputMismatchException e) {
	//			System.out.println("That is not a whole number!");
	//		}
	//		
			
			catch(ArithmeticException e) {
				System.out.println("You  can't divide by zero! idiot!");
			}
			
			finally {
				System.out.println("-------------------------");
			}
		
		}while(valid==false);
		
		
		
		

	}

}
