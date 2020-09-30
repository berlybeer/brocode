package overloadedMethods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();
		
		car1.set("Corvette", 2020, "blue", "chevy");
		
		System.out.println(car1);
		
		
		Car car2 = new Car();
		car2.set("Mustang");
		System.out.println(car2);

	}

}
