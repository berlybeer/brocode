package codeBro;

import java.util.Random;

public class javaRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		int x = random.nextInt(6)+1;
		int y = random.nextInt(6)+1;
		int z = random.nextInt(6)+1;
		
		System.out.println(x + " " + y + " " + z);
		
		
		double a = random.nextDouble() * 100;
		
		System.out.println(a);
		
		boolean b = random.nextBoolean();
		System.out.println(b);
		

	}

}
