package questions.asked;

import java.util.HashSet;
import java.util.Set;

// write a program to store custom data type Employee where size of set should be always 1 
// still program need correction

public class DemoOperationOnSet {
	public static Set<Employee> s = null;
	public static Employee employee = new Employee();

	public int getSetSize(Employee employee) {

		if (s == null) {
			s = new HashSet<>();
			if (s.size() == 0) {
				s.add(employee);
			} else {
				s.remove(employee);
				s.add(employee);
			}
		}
		return s.size();
	}

	public static void main(String[] args) {
		// System.out.println(s.size());
		DemoOperationOnSet d = new DemoOperationOnSet();

		employee.setId(100);
		employee.setName("Kss Samanta");
		employee.setId(200);
		employee.setName("Rama");
		System.out.println(employee.toString());
		System.out.println(d.getSetSize(employee));

	}
}
