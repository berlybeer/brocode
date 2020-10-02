package JavaInterface;

public class Boat extends Vehicle implements GasEngine, ElectricEngine{
	
	
	int propellers;
	
	public void startGasEngine() {
		System.out.println("Gas engine is started");
	};
	
	public void stopGasEngine() {
		System.out.println("Gas engine is stopped");
	};
	public void fillGasTank() {
		System.out.println("Gas tank is full");
	};

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
