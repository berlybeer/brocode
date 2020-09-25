package constructor;

public class Main {
	
	public static void main(String[] args) {
		
		//constructor = especial method that is called when an object is instantiated (created)
		Human human1 = new Human("Berly", 32, 68.7);
		
		System.out.println(human1.name);
		
		Human human2 = new Human("Morty", 16, 67);
		System.out.println(human2.name);
		
		human2.eat();
		human1.drink();
	}

}
