package methodOverloading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car(2020, 4);
		Bicycle bike1 = new Bicycle(2021,2);
		Boat boat1 = new Boat(2022,1);

		
		System.out.println(car1.getYear());
		System.out.println(car1.wheels);
		
		
		System.out.println(bike1.getYear());
		System.out.println(bike1.wheels);
		

	}

}
