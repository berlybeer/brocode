package codeBro;

public class javaWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive 	//wrapper class
		//----------	//-------------
		//int			//Integer
		//long			//Long
		//float			//Float
		//double		//Double
		//char			//Character

		
		String number = "100";
		number = number + 10;
		System.out.println(number);
		
		
		
		String Number2 = "100";
		int newNumber = Integer.parseInt(Number2);
		newNumber = newNumber + 10;
		System.out.println(newNumber);
		
		
		int number3 = 100;
		String newNumber3 = Integer.toString(number3);
		newNumber3 = newNumber3 + "Hello";
		System.out.println(newNumber3);
		
		
		

		
		
	}

}
