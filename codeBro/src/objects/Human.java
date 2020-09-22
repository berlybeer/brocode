package objects;

public class Human {
	
	String name;
	int height;
	double weight;
	int age;
	
	public void eat() {
		System.out.println(this.name +  " is currently eating...");
	}
	
	
	public void drink() {	
		System.out.println(this.name + " is currently drinking...");
		
	}
	
	public void breathe() {
		System.out.println(this.name + " is currently breathing...");
	}
	
	public void sleep() {
		System.out.println(this.name + " is currently sleeping...");
	}

}
