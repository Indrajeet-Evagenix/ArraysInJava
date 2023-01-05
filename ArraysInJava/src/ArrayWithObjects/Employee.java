package ArrayWithObjects;

public class Employee {

	int id, salary;
	String dept, name;

	Employee(int id, String name, String dept, int sal) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = sal;
	}

	public String toString() {
		return id + " " + name + " " + dept + " " + salary;
	}

}
