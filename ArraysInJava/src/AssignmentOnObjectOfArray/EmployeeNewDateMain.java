package AssignmentOnObjectOfArray;

public class EmployeeNewDateMain {

	public static void main(String[] args) {
		Date dt[] = new Date[1];

		dt[0] = new Date(01, 02, 1998);
//		dt[1] = new Date(01, 04, 1999);
//		dt[2] = new Date(01, 02, 1998);
//		dt[3] = new Date(05, 06, 1997);

		EmployeeNew emp[] = new EmployeeNew[4];

		emp[0] = new EmployeeNew(101, "Indrajeet", 65000, dt);
		emp[1] = new EmployeeNew(102, "Akash", 75000, dt);
		emp[2] = new EmployeeNew(103, "Ajay", 85000, dt);
		emp[3] = new EmployeeNew(104, "Ankit", 55000, dt);

		for (EmployeeNew emp1 : emp) {
			System.out.println(emp1);
		}

	}

}
