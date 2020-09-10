package codeBro;
import java.util.Scanner;

public class javaLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
		
		
//		char response = ' ';
		
		//**********WHILE LOOP*****/
		
//		while((response != 'q') && (response != 'Q')) {
//			System.out.println("You are still playing the game... pow boom pew pew");
//			System.out.println("Press 'q' or 'Q' TO EXIT: ");
//			response = scan.nextLine().charAt(0);
//		}
//		
//		System.out.println("You are finish the game");
		
		
		//**********DO LOOP*****/
//		int drinkNum = 0;
//		
//		
//		do {
//			System.out.println("Bartender: Here have a beer");
//			drinkNum++;
//			System.out.println("You have had " + drinkNum + " drink/s. Would you like another? (Y/y):");
//			response = scan.nextLine().charAt(0);
//		}while(response == 'Y' || response == 'y');
//		
//		System.out.println("Bartender: Thank you come again!");
		
		//******FOR LOOP*******/
		
//		for(int i = 10; i != 0 ; i--) {
//			System.out.println(i);
//		}
//		
//		System.out.print("Lift off!");
		
		Scanner scan = new Scanner(System.in);
		
		int response;
		
		System.out.println("What number do you want to count down by?: ");
		response = scan.nextInt();
		
		for(int i = response; i!=0; i-- ) {
			System.out.println(i);
		
		}
		
		System.out.println("Lift off!");
		
		
		
		
		

	}

}
