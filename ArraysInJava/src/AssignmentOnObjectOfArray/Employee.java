package AssignmentOnObjectOfArray;

// WAP to print the employees from Employee[] array who has same salary (Create 
// Employee class which has 3 attributes id, name, salary and add employee objects to 
// your array)

public class Employee {
	int empId, empSalary;
	String empName;

	Employee(int id, String name, int sal) {
		empId = id;
		empName = name;
		empSalary = sal;
	}

	public String toString() {
		return empId + " " + empName + " " + empSalary;
	}

	public static void main(String[] args) {

		Employee em[] = new Employee[3];

		em[0] = new Employee(101, "Indrajeet", 58000);
		em[1] = new Employee(102, "Mukesh", 68000);
		em[2] = new Employee(103, "Aashish", 68000);

		for (Employee emp : em) {
			if (emp.empSalary >= 68000) {
				System.out.println(emp);
			}
		}

	}

}
