package ArrayWithObjects;

import java.util.Scanner;

public class CompanyDepartmentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Company cmp[] = new Company[2];

		// Using Constructor
		Department dept[] = new Department[2];

		dept[0] = new Department(101, "HR", 50);
		dept[1] = new Department(102, "Sales", 60);

		Company c1 = new Company(2001, "TCS", dept);
		System.out.println(c1);

		// Taking Input From The User
//		for (int i = 0; i < cmp.length; i++) {
//			System.out.println("Enter Company Id And Name: ");
//			int cid = sc.nextInt();
//			String cName = sc.next();
//
//			Department dept[] = new Department[2];
//			System.out.println("Enter Department Details");
//			for (int j = 0; j < dept.length; j++) {
//				System.out.println("Enter Department Id, Name And Number: ");
//				int did = sc.nextInt();
//				String dName = sc.next();
//				int number = sc.nextInt();
//
//				dept[j] = new Department(did, dName, number);
//			}
//			cmp[i] = new Company(cid, cName, dept);
//		}

		for (Company cm : cmp) {
			System.out.println(cm);
		}
		sc.close();

	}

}
