package objects;

public class Main {

	public static void main(String[] args) {
		
		Human Rick = new Human();
		Human Morty = new Human();
		
		Rick.name = "Rick";
		Rick.height = 72;
		Rick.weight = 160;
		Rick.age = 65;
		
		Morty.name = "Morty";
		Morty.height = 64;
		Morty.weight = 120;
		Morty.age = 16;
		
		System.out.println("Name: " + Rick.name);
		System.out.println("Height: " + Rick.height);
		System.out.println("Weight: " + Rick.weight);
		System.out.println("Age: " + Rick.age);
		
		System.out.println("Name: " + Morty.name);
		System.out.println("Height: " + Morty.height);
		System.out.println("Weight: " + Morty.weight);
		System.out.println("Age: " + Morty.age);
		
		Rick.eat();
		Morty.breathe();
		
		

	}

}
