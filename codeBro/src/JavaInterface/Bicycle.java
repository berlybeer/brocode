package JavaInterface;

public class Bicycle extends Vehicle implements ElectricEngine{
	
	int wheels;
	
	public void startElectricEngine() {
		System.out.println("Electric engine is started");
	};
	
	public void stopElectricEngine() {
		System.out.println("Electric engine is stopped");
	};
	
	public void chargeBattery() {	
		System.out.println("Battery is charged");
	};

}
