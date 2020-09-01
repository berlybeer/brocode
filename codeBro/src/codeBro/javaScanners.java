package codeBro;

import java.util.Scanner;

public class javaScanners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		
		String name = scan.nextLine();
		
		
		System.out.print("Please enter your age: ");
		int age = scan.nextInt();
		
		System.out.print("What is your bank account balance: ");
		double bank = scan.nextDouble();
		
		System.out.print("Are you alive?: ");
		boolean livingStatus = scan.nextBoolean();
		
		
		
		System.out.println("Welcome " + name);
		System.out.println("You are " + age + " years old");
		System.out.println("Your current account balance is: " + bank);
		System.out.println("alive: " + livingStatus);

	}

}
