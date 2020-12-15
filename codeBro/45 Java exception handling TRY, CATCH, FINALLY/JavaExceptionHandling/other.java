package JavaExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class other {
	
	public static void main(String[] args) {
		char[] alphabet = {'a', 'b', 'c'};
		
		try {
			System.out.println(alphabet[4]);
		}
		
		catch(NullPointerException e) {
			System.out.println("That object is null!");
		}
		
		catch(IndexOutOfBoundsException e) {
			System.out.println("That index does not exist!");
		}
	}

}
