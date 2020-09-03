package codeBro;
import java.util.Scanner;

public class javaIfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your age: ");
		
		int age = scan.nextInt();
		
		if(age > 18) {
			int ActualYear = 2020;
			int result = age - 18;
			System.out.println("You have been an adult! since:" + (ActualYear-result));
		}else if(age == 18){
			System.out.println("Your are an adult now");
		}else {
			System.out.println("You are not an adult!");
		}
		
		

	}

}
