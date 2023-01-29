import java.util.Scanner;

public class CustomeExceptionMain {

	public static void ageCheck(int age) throws CustomException{
		if (age < 18) {
			System.out.println("You are Too sorter");
		} else if (age > 36) {
			System.out.println("You are Too Larger");
		} else {
			System.out.println("Your age is Perfect");
		}
	}

	public static void main(String[] args) throws CustomException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		try {
			ageCheck(age);
		} catch (CustomException e) {
			e.printStackTrace();
		}
		System.out.println("Done");

	}

}
