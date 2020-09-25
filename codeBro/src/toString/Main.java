package toString;

public class Main {
	
	public static void main(String[] args) {
		//toString() == special method that all objects inherit,
		//				that return a string that "textually represents" an object.
		//				can be used both implicitly and explicitly
		
		Car car = new Car();
		
		System.out.println(car.make);
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.year);
		
		drawhr('*', 20);
		
		System.out.println(car);
		
		drawhr('*', 20);
		
		car.toString();
		System.out.println(car);
		
		drawhr('*', 20);
		
		System.out.println(car.toString());
		
		
 	}
	
	public static void drawhr(char x, int y) {
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<y; i++) {
			sb.append(x);
		}
		
		String str = sb.toString();
		System.out.println(str);
	}

}
