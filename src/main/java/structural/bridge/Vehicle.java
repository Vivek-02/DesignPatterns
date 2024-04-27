package structural.bridge;

//Abstraction in bridge pattern
//Contains the implementor Workshop
abstract class Vehicle {
	
	protected Workshop work1;
	protected Workshop work2;
	
	protected Vehicle(Workshop work1, Workshop work2){
		this.work1 = work1;
		this.work2 = work2;
	}
	
	public abstract void manufacture();
}
