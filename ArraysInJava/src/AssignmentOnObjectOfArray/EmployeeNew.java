package AssignmentOnObjectOfArray;

import java.util.Arrays;

// WAP to print the employees from Employee[] array who has same joining date. You 
// have Employee class which has 4 attributes id, name, salary, date (date is another 
// object which has 3 attributes day, month, year) and add employee objects to your array 

public class EmployeeNew {

	int empId, empSalary;
	String empName;

	Date date[];

	EmployeeNew(int id, String name, int sal, Date date[]) {
		empId = id;
		empName = name;
		empSalary = sal;
		this.date = date;
	}

	public String toString() {
		return empId + " " + empName + " " + empSalary + " " + Arrays.toString(date);
	}

}
