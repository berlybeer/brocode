package codeBro;
import java.util.Scanner;

public class java2dArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		char[][] alphabet = new char[4][5];
		
//		char[][] alphabet = {
//				
//				{'a','b','c'},
//				{'d','e','f'},
//				{'g','h','i'},
//		};
		
		
		char[][] alphabet;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter # of rows: ");
		int rows = scan.nextInt();
		
		System.out.print("Enter # of columns: ");
		int columns = scan.nextInt();
		
		scan.nextLine();
		
		alphabet = new char[rows][columns];
		
//		alphabet[0][0] = 'a';
//		alphabet[0][1] = 'b';
//		alphabet[0][2] = 'c';
//		alphabet[1][0] = 'd';
//		
//		System.out.println(alphabet[1][0]);
		
		
		System.out.println(alphabet.length);
		
		for(int i = 0; i<alphabet.length; i++) {
			for(int j = 0; j<alphabet.length; j++) {
				System.out.print("Enter a character at " + "[" + i + "]" + "[" + j + "]: ");
				alphabet[i][j] = scan.nextLine().charAt(0);
			}
		}
		
		
		
		
		for(int i = 0; i<alphabet.length; i++) {
			for(int j = 0; j<alphabet.length; j++) {
				System.out.print(alphabet[i][j] + " ");
				
			}
			System.out.println();
		}
		
		
		
		

	}

}
