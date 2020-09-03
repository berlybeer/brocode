package codeBro;

public class javaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Bro";
		int result = name.indexOf('o');
		
		System.out.println(result);
		
		int result2 = name.indexOf('B');
		System.out.println(result2);
		
		int result3 = name.indexOf('r');
		System.out.println(result3);
		
		int result4 = name.length();
		System.out.println(result4);
		
		boolean result5 = name.isEmpty();
		System.out.println(result5);
		
		String result6 = name.toUpperCase();
		System.out.println(result6);
		
		String result7 = name.toLowerCase();
		System.out.println(result7);
		
		String name2 = "  Bro  ";
		String result8 = name2.trim();
		System.out.println(name2);
		System.out.println(result8);
		
		String phoneNumber = "1-800-123-4567";
		String result9 = phoneNumber.replaceAll("-", "");
		System.out.println(result9);
		
		String phoneNumber2 = "1,000,000";
		String result10 = phoneNumber2.replaceAll(",", "");
		System.out.println(result10);
		
		int result11 = phoneNumber2.length();
		System.out.println(result11);
		
		char result12 = name.charAt(1);
		System.out.println(result12);
		
		String phoneNumber3 = "Bro";
		boolean result13 = phoneNumber3.equalsIgnoreCase("BRO");
		System.out.println(result13);
		
		
		String email = "bro@bro.com";
		boolean result14 = email.equals("BRO@BRO.COM"); //Case sensibility;
		System.out.println(result14);
		
		
		
		
		
	}

}
