package ArrayWithObjects;
import java.util.Arrays;

public class Company {

	int companyId;
	String companyName;

	Department dept[];

	Company(int id, String name, Department dept[]) {
		companyId = id;
		companyName = name;
		this.dept = dept;

	}

	public String toString() {
		return companyId + " " + companyName + " " + Arrays.toString(dept);
	}

}
