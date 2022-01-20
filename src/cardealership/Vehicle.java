package cardealership;

public class Vehicle {

	private String make;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	/*
	 * This method provides better output results to the associated class, when it inherit from the object class
	 */
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", color=" + color + ", price=" + price + "]";
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private String model;
	private String color;
	private int price;
	public Vehicle(String make, String model, String color, int price) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
}
