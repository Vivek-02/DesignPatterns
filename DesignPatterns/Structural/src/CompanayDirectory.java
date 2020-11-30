/*Composite design pattern. It's related to a hierarchical structure.
 * 	Like a tree. 
 * It describes a group of objects that is treated the same as a single instance
 * of the same type of object. 
*/

import java.util.ArrayList;
import java.util.List;

public class CompanayDirectory implements Employee {
	
	List<Employee> list = new ArrayList<>();
	
	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		for(Employee e : list)
			e.showDetails();
	}
	
	public void addEmployee(Employee emp) {
		list.add(emp);
	}
	
	public void deleteEmployee(Employee emp) {
		list.remove(emp);
	}

}
