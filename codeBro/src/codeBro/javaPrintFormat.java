package codeBro;

public class javaPrintFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String item1 = "soup";
		String item2 = "salad";
		String item3 = "ice cream";
		
		double price1 = 2000.75046;
		double price2 = 4.2523345;
		double price3 = -30000.00012;
		
		System.out.println("name		price");
		System.out.println("---- 		------");
		System.out.println(item1+ "		$"+price1);
		System.out.println(item2+ "		$"+price2);
		System.out.println(item3+ "	$"+price3);
		
		System.out.printf("%-15s %-15s \n", "name", "price");
		System.out.printf("%-15s %-15s \n", "----", "-----");
		System.out.printf("%-15s $%-15.2f \n", item1, price1);
		System.out.printf("%-15s $%-15.2f \n", item2, price2);
		System.out.printf("%-15s $%-15.2f \n", item2, price3);
		System.out.printf("%s \n", item1);
		System.out.printf("%.1f \n", price1);
		System.out.printf("%-15.2f", price1);
		System.out.print("Hello \n");
		System.out.printf("%,5.2f \n",price1);
		System.out.printf("%(-,15.2f %(-,15.2f \n", price3, price1);
		
		
		

	}

}
