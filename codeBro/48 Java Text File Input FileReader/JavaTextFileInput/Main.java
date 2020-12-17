package JavaTextFileInput;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = null;
		int level = 0;
		int hitpoints = 0;
		
		
		 try {
			Scanner fileIn = new Scanner(new FileReader("C:\\Users\\bpuma\\Desktop\\test.txt"));
			
//			test.txt content
//			
//			makigas
//			99
//			666


			
			while(fileIn.hasNextLine()) {
				
				name = fileIn.nextLine();
				level = Integer.parseInt(fileIn.nextLine());
				hitpoints = Integer.parseInt(fileIn.nextLine());
				
				String line = fileIn.nextLine();
				System.out.println(line);
			}
			
			fileIn.close();
				
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 System.out.println("Name: " + name);
		 System.out.println("Level: " + level);
		 System.out.println("HP: " + hitpoints+"/"+hitpoints);
	}

}
