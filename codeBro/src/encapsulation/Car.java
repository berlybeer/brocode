package encapsulation;

public class Car {
	
	private String model;
	private int year;
	private double price;
	
	Car(String model, int year, double price){
		setModel(model);
		setYear(year);
		setPrice(price);
		
	}
	
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	

	public String getModel() {
		return model;
	}
	
	
	public int getYear() {
		return year;
	}
	
	public double getPrice() {
		return price;
	}
}
