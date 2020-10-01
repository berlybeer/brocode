package JavaAbstract;

public class Bicycle extends Vehicle{
	int wheels;
	
	public void go() {
		System.out.println("This bike is moving.");
	}
	
	public void stop() {
		System.out.println("This bike is stopped.");
	}
}
