package objectOrientedProgramming;

//create instances
public class Vehicle {
	
	private String make;
	private String model;
	private int year;
	private double price;
	private Motor motor;
	
	
	//create constructors
	public Vehicle(String make, String model, int year, double price, Motor motor) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.motor = motor;
	}


//Create getters
	public int getCyclinders() {
		return getCyclinders();
	}

	public int getHp() {
		return getHp();
	}

	public String getType() {
		return getType();
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle make = " + make + ", model = " + model + ", year = " + year + ", price = " + price;
	}
	

	
	

}
