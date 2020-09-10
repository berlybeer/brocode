package codeBro;
import java.util.ArrayList;

public class javaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("BMW");
		cars.add("Porsche");
		cars.add("Corvette");
		
//		System.out.println(cars.get(1));
		
//		cars.set(1, "Tesla");
//		
//		System.out.println(cars.get(1));
//		
//		cars.remove(1);
//		
//		System.out.println(cars.get(1));
		
//		cars.clear();
//		
//		System.out.println(cars.get(1));
//		
//		System.out.println(cars.indexOf("Corvette"));
 		
		
		System.out.println(cars.size());
		
		for(int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}

	}

}
