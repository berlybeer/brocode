package JavaPolymorphism;

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Car car1 = new Car();
		Bicycle bike1 = new Bicycle();
		Boat boat1 = new Boat();
		Vehicle vehicle = null;
		
		Vehicle[] vehicles = new Vehicle[4];
		
		vehicles[0] = car1;
		vehicles[1] = bike1;
		vehicles[2] = boat1;
		
		System.out.println("Choose your vehicle (1=car 2=bike 3=boat)");
		
		int answer = scan.nextInt();
		if(answer == 1) {
			vehicle = new Car();
		}
		
		if(answer == 2) {
			vehicle = new Bicycle();
		}
		
		if(answer == 3) {
			vehicle = new Boat();
		}
		
		
		vehicles[3] = vehicle;
		
		System.out.println("3...2...1...Go!");
		for(int i = 0; i < vehicles.length; i++) {
			vehicles[i].go();
		}
		
		if(vehicle instanceof Car) {
			System.out.println("you won with your car! CONGRATULATIONS!");
		}
		
		if(vehicle instanceof Bicycle) {
			System.out.println("you won with your bicycle! CONGRATULATIONS!");
		}
		
		if(vehicle instanceof Boat) {
			System.out.println("you won with your boat! CONGRATULATIONS!");
		}
		
		
		
	}

}
