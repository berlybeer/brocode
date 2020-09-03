package codeBro;

import java.util.Random;

public class javaStringProyect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String allLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int countAll = allLetters.length();
		System.out.println(countAll);
		
		Random random = new Random();
		
		int randomInteger = random.nextInt(26);
		
		char randomLetter = allLetters.charAt(randomInteger);
		
		System.out.println(randomLetter);
	}

}
