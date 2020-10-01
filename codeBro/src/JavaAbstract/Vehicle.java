package JavaAbstract;

abstract class Vehicle {
	
	int speed = 0;
	boolean inMotion=false;
	int year;
	
	
	abstract void go();
	abstract void stop();	
	
	
	public void explode() {
		System.out.println("uh oh");
	}

	
	
}
