package JavaFinalAccessModifier;

public class Car extends Vehicle{
	
	int wheels;
	
	
	@Override
	public void go() {
		System.out.println("This vehicle is moving.");
	}

}


//Cannot override the final method from Vehicle