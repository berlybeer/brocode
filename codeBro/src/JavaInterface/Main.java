package JavaInterface;

public class Main {
	
	public static void main(String[] args) {
		Car car1 = new Car();
		Bicycle bike1 = new Bicycle();
		Boat boat1 = new Boat();
		
		drawh('*', 25);
		car1.fillGasTank();
		
		drawh('*', 25);
		bike1.chargeBattery();
		
		drawh('*', 25);
		boat1.fillGasTank();
		boat1.chargeBattery();
		
		
	}
	


	public static void drawh( char x , int y) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < y; i++) {
			
			sb.append(x);
		}
		
		String str = sb.toString();
		System.out.println(str);
		
	}

}
