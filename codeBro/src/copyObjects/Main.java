package copyObjects;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.setModel("Mustang");
		car1.setYear(2020);
		car1.setColor("blue");
		
		car2.copy(car1);
		
		
		
		
		drawh('*', 15);
		System.out.println("Car1");
		System.out.println(car1);
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println(car1.getColor());
		
		
		System.out.println();
		
		drawh('*', 15);
		System.out.println("Car2");
		System.out.println(car2);
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		System.out.println(car2.getColor());
		
		
		

	}
	
	
	
	public static void drawh(char x, int y) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<y; i++){
			sb.append(x);
		}
		
		String str = sb.toString();
		System.out.println(str);
	}

}
