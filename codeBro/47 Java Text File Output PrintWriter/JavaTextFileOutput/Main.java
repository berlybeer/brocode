package JavaTextFileOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "hello";
		try {
			PrintWriter fileOut = new PrintWriter("C:\\\\Users\\\\bpuma\\\\Desktop\\\\test.txt");
			
			fileOut.println(x);
			fileOut.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
