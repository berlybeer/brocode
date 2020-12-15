package JavaPolymorphism;

public class Car extends Vehicle{
	
	int wheels;
	
	public void go() {
		System.out.println("The driver steps on the gas");
	};
	
	public void stop() {
		System.out.println("The driver slams on the brakes");
	};
	
}
