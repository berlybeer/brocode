package JavaFileClass;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\bpuma\\Desktop\\test.txt");
		
		if(file.exists()) {
			System.out.println(file.getName() + " does exist!");
		}
		else {
			System.out.println(file.getName() + " does not exists!");
		}

	}

}
