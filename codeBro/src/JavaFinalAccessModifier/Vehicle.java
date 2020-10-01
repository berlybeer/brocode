package JavaFinalAccessModifier;

public class Vehicle {
	
	int speed = 0;
	boolean inMotion=false;
	int year;
	
	final public void go() {
		System.out.println("This vehicle is moving.");
	}

}
