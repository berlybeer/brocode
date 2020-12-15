package JavaPolymorphism;

public class Boat extends Vehicle{
	int propellers;
	
	public void go() {
		System.out.println("The sailor begins sailing");
	};
	public void stop() {
		System.out.println("The sailor anchors the boat");
	};
}
