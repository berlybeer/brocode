package JavaPolymorphism;

public class Bicycle extends Vehicle{

	int wheels;
	
	public void go() {
		System.out.println("The cyclist begins pedaling");
	};
	
	public void stop() {
		System.out.println("The cyclist hits the brakes");
	};
	
}
