package AssignmentOnObjectOfArray;

// Create class Dept(did, dname), class MyDate(day, month, year) 
// Class Employee(emp_id, emp_name, salary, date(object), dept(object)). Create array 
// of Employee and display the array elements. 
// 24. Same as above but print Employees whose dept_name is same.

import java.util.Arrays;

public class EmployeeDeptMyDate {

	int empId, empSalary;
	String empName;

	Department dept[];
	MyDate date[];

	EmployeeDeptMyDate(int id, String name, int salary, Department dept[], MyDate date[]) {
		empId = id;
		empSalary = salary;
		empName = name;
		this.dept = dept;
		this.date = date;
	}

	public String toString() {
		return empId + " " + empName + " " + empSalary + " " + Arrays.toString(dept) + " " + Arrays.toString(date);
	}

}
