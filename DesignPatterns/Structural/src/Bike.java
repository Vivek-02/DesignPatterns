//Refined abstraction 2
public class Bike extends Vehicle{

	protected Bike(Workshop work1, Workshop work2) {
		super(work1, work2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manufacture() {
		// TODO Auto-generated method stub
		System.out.println("Bike is getting ready");
		work1.work();
		work2.work();
	}

}
