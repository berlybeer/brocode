package JavaExceptionHandling;

import java.util.Scanner;

public class exception {
	
	public static void main(String[] args) {

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
				
				catch(Exception e) {
					System.out.println("Error!");
				}

				
				finally {
					System.out.println("-------------------------");
				}
			
			}while(valid==false);
}
	
}
