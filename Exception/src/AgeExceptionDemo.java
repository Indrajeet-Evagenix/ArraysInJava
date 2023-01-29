import java.util.Scanner;

public class AgeExceptionDemo {

	void ageCheck(int age) throws AgeException {
		if (age < 18) {
			System.out.println("Age is less... Sorry Not Allowed");
		} else if (age >= 36) {
			System.out.println("Age is Greater... Sorry Not Allowed");
		} else {
			System.out.println("Enjoy Your day");
		}

	}

	public static void main(String[] args) throws AgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		int age = sc.nextInt();
		AgeExceptionDemo ac = new AgeExceptionDemo();
		try {
			ac.ageCheck(age);
		} catch (AgeException e) {
			e.printStackTrace();
		}
		System.out.println("Done");

	}

}
