package ArrayWithObjects;

import java.util.Arrays;

public class Person {

	int id;
	String personName, personAddress;

	IdProof idProof[];

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonAddress() {
		return personAddress;
	}

	public void setPersonAddress(String peronAddress) {
		this.personAddress = peronAddress;
	}

	public IdProof[] getIdProof() {
		return idProof;
	}

	public void setIdProof(IdProof idProof[]) {
		this.idProof = idProof;
	}

//	public String toString() {
//		return id + " " + personName + " " + personAddress + " " + idProof;
//	}

}
