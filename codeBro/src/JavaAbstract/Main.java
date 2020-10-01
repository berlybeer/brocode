package JavaAbstract;

public class Main {
	
	public static void main(String[] args) {
		Car car1 = new Car();
		Bicycle bike1 = new Bicycle();
		Boat boat1 = new Boat();
		
		drawh('*', 25);
		
		car1.go();
		bike1.go();
		boat1.go();
		
		drawh('*', 25);
		
		car1.stop();
		bike1.stop();
		boat1.stop();
		
		
		drawh('*', 25);
		
		car1.explode();
		

		
	}
	
	
	public static void drawh(char x, int y) {
		StringBuilder sb = new StringBuilder();
		
		for(int i= 0; i < y; i++) {
			sb.append(x);
		}
		
		String str = sb.toString();
		System.out.println(str);
		
	}

}
