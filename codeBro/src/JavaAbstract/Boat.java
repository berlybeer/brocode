package JavaAbstract;

public class Boat extends Vehicle{
	int propellers;
	
	public void go() {
		System.out.println("This boat is sailing.");
	}
	
	public void stop() {
		System.out.println("This boat is anchored.");
	}
}
