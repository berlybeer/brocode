package overloadedMethods;

public class Car {
	
	String model;
	int year;
	String color;
	String make;
	
	public void set(String a) {
		this.model = a;
	}
	
	public void set(String a, int b) {
		this.model = a;
		this.year = b;
	}
	
	public void set(String a, int b, String c) {
		this.model = a;
		this.year = b;
		this.color = c;
	}
	
	public void set(String a, int b, String c, String d) {
		this.model = a;
		this.year = b;
		this.color = c;
		this.make = d;
	}
	
	public String toString() {
		return this.model + "\n" + this.year + "\n" + this.color + "\n" + this.make;
	}

}
