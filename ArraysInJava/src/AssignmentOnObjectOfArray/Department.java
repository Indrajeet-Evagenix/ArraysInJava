package AssignmentOnObjectOfArray;

//Create class Dept(did, dname), class MyDate(day, month, year) 
//Class Employee(emp_id, emp_name, salary, date(object), dept(object)). Create array 
//of Employee and display the array elements. 
//24. Same as above but print Employees whose dept_name is same.

public class Department {

	int departmentId;
	String deprtmentName;

	Department(int id, String name) {
		departmentId = id;
		deprtmentName = name;
	}

	public String toString() {
		return departmentId + " " + deprtmentName;
	}

}
