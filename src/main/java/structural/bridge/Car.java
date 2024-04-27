package structural.bridge;

//Refined abstraction 1
public class Car extends Vehicle{

	protected Car(Workshop work1, Workshop work2) {
		super(work1, work2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manufacture() {
		// TODO Auto-generated method stub
		System.out.println("Car getting ready");
		work1.work();
		work2.work();
	}

}
