package codeBro;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class JavaSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stuff = {9,1,8,2,7,3};
		
		Arrays.sort(stuff);
		
		System.out.println(Arrays.toString(stuff)+" ");
		
		
		char[] letters = {'v','f','d','a', 'c', 'h'};
		
		Arrays.sort(letters);
		System.out.println(Arrays.toString(letters) + " ");
		
		
		char[] mix = {'v','f','D','a', 'Z', 'j', 'B'};
		
		Arrays.sort(mix);
		
		System.out.println(Arrays.toString(mix) + " ");
		
		
		String[] mandarina = {"f","D", "Z", "a", "Y", "b", "x", "c"};
		Arrays.sort(mandarina, String.CASE_INSENSITIVE_ORDER);
		
		System.out.println(Arrays.toString(mandarina));
		
		int[] numbers = {9,1,8,2,7,3};
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				if(numbers[i]>numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j]= temp;
				}
			}
		}
		
		for(int x : numbers) {
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		ArrayList<String> country = new ArrayList<String>();
		country.add("India");
		country.add("USA");
		country.add("U.K.");
		country.add("Russia");
		country.add("Brazil");
		
		Collections.sort(country);
		
		System.out.println(country.toString());
		
		ArrayList<String> nations = country;
		
		Collections.reverse(nations);
		
		System.out.println(nations.toString());
		
		
		
	}

}
