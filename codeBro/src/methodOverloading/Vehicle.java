package methodOverloading;

public class Vehicle {

	
		int speed = 0;
		boolean inMotion = false;
		
		public void go() {
			System.out.println("This vehicle is in motion");
		}
		
		public void stop() {
			System.out.println("This vehicle is stopped");
		}
}
