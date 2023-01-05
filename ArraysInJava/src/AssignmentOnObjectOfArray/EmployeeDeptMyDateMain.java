package AssignmentOnObjectOfArray;

//Create class Dept(did, dname), class MyDate(day, month, year) 
//Class Employee(emp_id, emp_name, salary, date(object), dept(object)). Create array 
//of Employee and display the array elements. 
//24. Same as above but print Employees whose dept_name is same.

public class EmployeeDeptMyDateMain {

	public static void main(String[] args) {
		Department dept1[] = new Department[3];
		Department dept2[] = new Department[3];
		Department dept3[] = new Department[3];

		dept1[0] = new Department(101, "Computer");
		dept1[1] = new Department(102, "Civil");
		dept1[2] = new Department(103, "EXTC");

		dept2[0] = new Department(101, "Mechanical");
		dept2[1] = new Department(102, "IT");
		dept2[2] = new Department(103, "EXTC");

		dept3[0] = new Department(101, "Computer");
		dept3[1] = new Department(102, "Electrical");
		dept3[2] = new Department(103, "IT");

		MyDate dt1[] = new MyDate[3];
		MyDate dt2[] = new MyDate[3];
		MyDate dt3[] = new MyDate[3];

		dt1[0] = new MyDate(02, 05, 1996);
		dt1[1] = new MyDate(12, 07, 1998);
		dt1[2] = new MyDate(15, 05, 1997);

		dt2[0] = new MyDate(22, 04, 1995);
		dt2[1] = new MyDate(12, 07, 1999);
		dt2[2] = new MyDate(15, 05, 1991);

		dt3[0] = new MyDate(28, 01, 1995);
		dt3[1] = new MyDate(17, 02, 1998);
		dt3[2] = new MyDate(19, 06, 1999);

		EmployeeDeptMyDate emp[] = new EmployeeDeptMyDate[3];

		emp[0] = new EmployeeDeptMyDate(201, "Indrajeet", 50000, dept1, dt1);
		emp[1] = new EmployeeDeptMyDate(202, "Akash", 60000, dept2, dt2);
		emp[2] = new EmployeeDeptMyDate(203, "Akshay", 70000, dept3, dt3);

		for (EmployeeDeptMyDate emp1 : emp) {
			for (Department dep : emp1.dept) {
				if (dep.deprtmentName.equalsIgnoreCase("computer"))
					System.out.println(emp1);

			}

		}
		System.out.println();
		for (EmployeeDeptMyDate emp1 : emp) {
			for (MyDate dat : emp1.date) {
				if (dat.day==17)
					System.out.println(emp1);

			}

		}

	}

}
