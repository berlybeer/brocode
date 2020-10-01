package methodOverloading;

public class Vehicle {

	
		int speed = 0;
		boolean inMotion = false;
		int year;
		
		public Vehicle(int a) {
			this.year = a;
		}
		
		public int getYear() {
			return this.year;
		}
}
