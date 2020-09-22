package objects;
import java.util.*;


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
		
		
		drawhr('*');
		
		System.out.println("Name: " + Morty.name);
		System.out.println("Height: " + Morty.height);
		System.out.println("Weight: " + Morty.weight);
		System.out.println("Age: " + Morty.age);
		
		drawhr('*');
		
		System.out.println(Rick.weight);
		Rick.eat();
		
		System.out.println(Rick.weight);
		System.out.println(Morty.weight);

		Morty.breathe();
		Rick.drink();
		Morty.drink();
		
		
		drawhr('*');
		
		
		
		Car Aventador = new Car();
		Aventador.name = "Aventador";
		
		System.out.println("Name: " + Aventador.name);
		Aventador.start();
		Aventador.stop();
		
		drawhr('*');
		
		Car Camaro = new Car();
		Camaro.name = "Camaro Bumbleble";
		System.out.println("Name: " + Camaro.name);
		Camaro.start();
		Camaro.stop();
		
		
		
		

	}
	
	
	public static void drawhr(char x) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 40 ; i++) {
			sb.append(x);
		}
		String str = sb.toString();
		
		System.out.println(str);
	}
	

}
