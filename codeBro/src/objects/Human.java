package objects;

public class Human {
	
	String name;
	int height;
	double weight;
	int age;
	
	public void eat() {
		if(this.name == "Rick") {
			System.out.println("Rick is currently eating...");
			this.weight = this.weight + 0.1;
		}if(this.name == "Morty") {
			System.out.println("Morty is currently eating...");
			this.weight = this.weight + 0.1;
		}
	}
	
	
	public void drink() {
		if(this.name == "Rick") {
			System.out.println("Rick is currently drinking...");
		}if(this.name == "Morty") {
			System.out.println("Morty is currently drinking...");
		}
		
		
	}
	
	public void breathe() {
		System.out.println("This Human is currently breathing...");
	}
	
	public void sleep() {
		System.out.println("This Human is currently sleeping...");
	}

}
