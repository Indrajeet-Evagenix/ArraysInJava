package ArrayWithObjects;

import java.util.Arrays;
import java.util.Scanner;

public class IdProofPersonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Person ps[] = new Person[3];

		for (int i = 0; i < ps.length; i++) {

			System.out.println("Enter id, Name, Address of Person");
			int id = sc.nextInt();
			String name = sc.next();
			String address = sc.next();

			IdProof id1[] = new IdProof[3];
			for (int j = 0; j < id1.length; j++) {
				System.out.println("Enter Id Name And Validity of ID Proof");
				String iName = sc.next();
				String validity = sc.next();

				IdProof id2 = new IdProof();
				id2.setName(iName);
				id2.setValidity(validity);

				id1[j] = id2;

			}

			Person ps1 = new Person();
			ps1.setId(id);
			ps1.setPersonName(name);
			ps1.setPersonAddress(address);
			ps1.setIdProof(id1);

			ps[i] = ps1;
		}

		for (Person per : ps) {
			for (IdProof idproof : per.getIdProof()) {

				if (idproof.getName().equalsIgnoreCase("pan"))
					System.out.println(per.getId() + " " + per.getPersonName() + " " + per.getPersonAddress() + " "
							+ Arrays.toString(per.getIdProof()));
//				System.out.println();
				// System.out.println(idproof.getName() + " " + idproof.getValidity());

			}
		}

	}

}
/*
 * id1[0].setName("PAN"); id1[0].setValidity("2 Year");
 * 
 * id2[1].setName("Aadhar Card"); id2[1].setValidity("Life Time");
 * 
 * id3[2].setName("PAN"); id3[2].setValidity("5 Year");
 * 
 * Person ps[]=new Person[3];
 * 
 * ps[0].setId(1); ps[0].setPersonName("Indrajeet");
 * ps[0].setPersonAddress("Mumbai"); ps[0].setIdProof(id1);
 * 
 * ps[1].setId(2); ps[1].setPersonName("Akash");
 * ps[1].setPersonAddress("Virar"); ps[1].setIdProof(id2);
 * 
 * ps[2].setId(3); ps[2].setPersonName("Ankit");
 * ps[2].setPersonAddress("Vasai"); ps[2].setIdProof(id3);
 */
