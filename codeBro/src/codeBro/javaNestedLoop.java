package codeBro;
import java.util.Scanner;

public class javaNestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int x = 1;
//		
//			while(x <= 10) {
//				for(int i = 1; i<10;i++) {
//					System.out.print(b);
//				}
//				x++;
//			}	
//	}
		
		Scanner scan = new Scanner(System.in);
		
		
		int height;
		int width;
		char symbol;
		
		System.out.println("Please enter the height: ");
		height = scan.nextInt();
		System.out.println("Please enter the width: ");
		width = scan.nextInt();
		System.out.println("Please enter the sysmbol to use: ");
		symbol = scan.next().charAt(0);
		
		System.out.println();
		
		for(int i=1; i<=height; i++) {
			for (int j = 1; j<=width; j++){
				System.out.print(symbol);
			}
			System.out.println();
		}

	}
	
}
