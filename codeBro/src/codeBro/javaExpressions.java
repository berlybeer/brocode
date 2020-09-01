package codeBro;

public class javaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Expression = Operands(value,integer ,decimal, etc) & operators ( +-*/%)
		//Operand (value, integer, decimal, etx)
		//Operator ( +-*/%)
		
		int money = 10;
		
		money--;
					
		
		System.out.println("You now have $" + money + " U.S. dollars");
		
		
		//Operator precedence
		//Step 1 resolve parenthesis
		//Step 2 resolve multiplication and division
		//Step 3 resolve addition and substraction
		
		double payment = (1.2 * (15 + 66) -10)/5;
		
		System.out.println("The cost per person is: $" + payment);
		

	}

}
