package copyObjects;

public class Car {
	
	private String model;
	private int year;
	private String color;
	
	public void setModel(String x) {
		this.model = x;	
	}
	
	public void setYear(int x) {
		this.year = x;
	}
	
	public void setColor(String x) {
		this.color = x;
	}
	
	
	public String getModel() {
		return this.model;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public String getColor() {
		return this.color;
	}
	
	
	public void copy(Car x) {
		
		this.setModel(x.getModel());
		this.setYear(x.getYear());
		this.setColor(x.getColor());
	}
}
