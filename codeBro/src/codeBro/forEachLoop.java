package codeBro;

import java.util.ArrayList;

public class forEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		int[] numbers = {1,2,3,4,5,6,7,8,9};
//		
//		for(int num : numbers) {
//			System.out.println(num);
//		}
//		
//		char[] vocals = {'a','e','i','o','u'};
//		
//		
//		for(char vocal : vocals){
//			System.out.println(vocal);
//		}
		
		
		ArrayList<String> lyrics = new ArrayList<String>();
		
		lyrics.add("Happy");
		lyrics.add("Birthday");
		lyrics.add("to");
		lyrics.add("you");
		
		for(String num: lyrics) {
			System.out.println(num);
		}

	}

}
