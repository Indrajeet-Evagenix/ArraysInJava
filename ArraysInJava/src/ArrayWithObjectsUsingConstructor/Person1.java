package ArrayWithObjectsUsingConstructor;

import java.util.Arrays;

public class Person1 {

	int id;
	String personName, personAddress;

	IdProof1 idProof[];

	Person1(int id, String name, String address, IdProof1 idProof[]) {
		this.id = id;
		personName = name;
		personAddress = address;
		this.idProof = idProof;

	}

	public String toString() {
		return id + " " + personName + " " + personAddress + " " + Arrays.toString(idProof);
	}

}
