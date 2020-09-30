package encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car("Mustang", 2021, 9999.99);
		

		car1.setModel("Corvette");
		car1.setYear(2022);
		car1.setPrice(1);
		
		drawhr('*', 10);
		
		System.out.println(car1.getPrice());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		
		drawhr('*', 10);
		
		
		
		

	}
	
	
	public static void drawhr(char x, int y) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < y ; i++) {
			sb.append(x);
		}
		String str = sb.toString();
		
		System.out.println(str);
	}

}
