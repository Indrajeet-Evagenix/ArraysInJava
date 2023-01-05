package AssignmentOnObjectOfArray;

//Create class Dept(did, dname), class MyDate(day, month, year) 
//Class Employee(emp_id, emp_name, salary, date(object), dept(object)). Create array 
//of Employee and display the array elements. 
//24. Same as above but print Employees whose dept_name is same.

public class MyDate {

	int day, month, year;

	MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString() {
		return day + " " + month + " " + year;
	}

}
