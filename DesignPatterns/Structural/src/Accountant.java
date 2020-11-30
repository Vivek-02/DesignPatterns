
public class Accountant implements Employee{
	
	private String empId;
	private String name;
	private double salary;
	
	@Override
	public String toString() {
		return "Accountant [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}

}
