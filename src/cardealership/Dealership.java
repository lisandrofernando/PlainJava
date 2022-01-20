package cardealership;

public class Dealership {

	public static void main(String[] args) {
		
		
		/*
		 * Into this project take in consideration Employees, cars, customers...
		 */

		Customer customer = new Customer("Oliver", "2425 Sage Road, Houston, TX", 25000);
		Vehicle vehicle = new Vehicle("Toyota","Hihglander", "Grey",14000);
		Employee emp = new Employee();
		customer.purchaseCar(vehicle, emp, false);
	}

}
