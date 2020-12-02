/*
 Demo showing the bridge between abstraction and implementation
 The client can change the abstraction part without being concerned about 
 the implementation class.
 Increases loose coupling between the abstraction and implementation class
 */
public class BridgePattern {
	public static void main(String[] args) {
		Vehicle vehicle1 = new Car(new Assemble(),new Produce());
		vehicle1.manufacture();
		
		Vehicle vehicle2 = new Bike(new Assemble(),new Produce());
		vehicle2.manufacture();
	}
}
