package codeBro;
import java.util.Scanner;

public class javaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ARRAY SECOND FORM ****//
		
		Scanner scan = new Scanner(System.in);
		
		String[] cars;
		
		System.out.println("How many parking spaces?: ");
		
		int arraySize = scan.nextInt();
		scan.nextLine();
		
		cars = new String[arraySize];
		
		System.out.println("You have this many spaces: " + cars.length);
		
		for(int i = 0; i<cars.length;i++) {
			System.out.println("Enter car # " + (i+1));
			cars[i] = scan.nextLine();
		}
		
		for(int i = 0; i<cars.length; i++) {
			System.out.println("Spot #" + (i+1) + "=" + cars[i]);
		}
		
//ARRAY OTHER FORM***
		
//		String[] cars = {"Corvette", "Porsche", "BMW", "Audi A7", "Tesla"};
//		System.out.println(cars[3]);

		
//ARRAY FIRST FORM******
//		
//		String[] cars = new String[5];
//		
//		cars[0] = "Corvette";
//		cars[1] = "Porsche";
//		cars[2] = "BMW";
//		cars[3] = "Audi A7";
//		cars[4] = "Tesla";
//		
//		System.out.println(cars[2]);
		
//		String car1 = "Corvette";
//		String car2 = "Porsche";
//		String car3 = "BMW";
//		String car4 = "Audi A7";
//		String car5 = "Tesla";
//		
//		System.out.println(car1);
//		System.out.println(car2);
//		System.out.println(car3);
//		System.out.println(car4);
//		System.out.println(car5);
		
		
	}

}
