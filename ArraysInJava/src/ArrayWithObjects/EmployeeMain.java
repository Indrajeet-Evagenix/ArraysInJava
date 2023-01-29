package ArrayWithObjects;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);

		Employee emp[] = new Employee[10];

		emp[0] = new Employee(101, "Indrajeet", "Computer", 62000);
		emp[1] = new Employee(102, "Akash", "Extc", 65000);
		emp[2] = new Employee(103, "Sunil", "HR", 55000);
		emp[3] = new Employee(104, "Prashant", "Mechanical", 60000);
		emp[4] = new Employee(105, "Amarjeet", "Computer", 52000);
		emp[5] = new Employee(106, "Jitendra", "HR", 81000);
		emp[6] = new Employee(107, "Mukesh", "Mechanical", 78000);
		emp[7] = new Employee(108, "Pankaj", "Computer", 51000);
		emp[8] = new Employee(109, "Pawan", "Extc", 48000);
		emp[9] = new Employee(110, "Aashish", "HR", 76000);

		for (Employee emp1 : emp) {
			if (emp1.salary > 60000) {
				System.out.println(emp1);

			}

		}

		System.out.println();
		System.out.println("'HR' Slary Hiked By 10%");
		for (Employee emp2 : emp) {
			if (emp2.dept.equalsIgnoreCase("hr")) {
				int sal = (emp2.salary * 10) / 100;
				emp2.salary = emp2.salary + sal;

				System.out.println(emp2);
			}

		}

	}

}
