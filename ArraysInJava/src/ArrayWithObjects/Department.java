package ArrayWithObjects;

public class Department {

	int departmentId, departmentNumber;
	String departmentName;

	Department(int id, String name, int number) {
		departmentId = id;
		departmentNumber = number;
		departmentName = name;

	}

	public String toString() {
		return departmentId + " " + departmentName + " " + departmentNumber;
	}

}
