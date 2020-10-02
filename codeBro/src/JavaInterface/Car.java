package JavaInterface;

public class Car extends Vehicle implements GasEngine{

	int wheels;
	
	public void startGasEngine() {
		System.out.println("Gas engine is started");
	};
	
	public void stopGasEngine() {
		System.out.println("Gas engine is stopped");
	};
	public void fillGasTank() {
		System.out.println("Gas tank is full");
	};
	
}
