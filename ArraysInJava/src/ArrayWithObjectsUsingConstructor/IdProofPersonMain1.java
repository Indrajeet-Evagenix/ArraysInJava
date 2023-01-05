package ArrayWithObjectsUsingConstructor;

import java.util.Scanner;

public class IdProofPersonMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		IdProof1 idProof1[] = new IdProof1[3];
		IdProof1 idProof2[] = new IdProof1[3];
		IdProof1 idProof3[] = new IdProof1[3];

		idProof1[0] = new IdProof1("PAN", "2 Year");
		idProof1[1] = new IdProof1("Aadhar", "3 Year");
		idProof1[2] = new IdProof1("Passport", "4 Year");

		idProof2[0] = new IdProof1("Voter", "5 Year");
		idProof2[1] = new IdProof1("Aadhar", "3 Year");
		idProof2[2] = new IdProof1("Driving", "4 Year");

		idProof3[0] = new IdProof1("PAN", "2 Year");
		idProof3[1] = new IdProof1("Voter", "3 Year");
		idProof3[2] = new IdProof1("Passport", "4 Year");

		Person1 per1[] = new Person1[3];

		per1[0] = new Person1(1, "Indrajeet", "Mumbai", idProof1);
		per1[1] = new Person1(2, "Akash", "Virar", idProof2);
		per1[2] = new Person1(3, "Ankit", "Vasai", idProof3);

		for (Person1 perMain : per1) {
			for (IdProof1 id : perMain.idProof) {
				if (id.name.equalsIgnoreCase("voter")) {
					System.out.println(perMain);
					System.out.println(id.validity);
				}

			}
//			System.out.println(perMain);
		}
	}

}
