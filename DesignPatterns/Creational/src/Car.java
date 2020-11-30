//E.g of a builder design pattern
/* We avoid the use of multiple parameterized constructor */
public class Car {
	
	private String name;
	private double price;
	private String registrationNumber;

	public static class Builder{
		
		private String name;
		private double price;
		private String registrationNumber;
		
		private Builder carName(String name) {
			this.name = name;
			return this;
		}
		
		private Builder carPrice(double price) {
			this.price = price;
			return this;
		}
		
		private Builder carRegistrationNo(String registrationNumber) {
			this.registrationNumber = registrationNumber;
			return this;
		}
		
		public Car build(){
			Car car = new Car();
			car.name = this.name;
			car.price = this.price;
			car.registrationNumber = this.registrationNumber;
			return car;
		}
		
	}
	
	//Private constructor
	private Car() {}
}
