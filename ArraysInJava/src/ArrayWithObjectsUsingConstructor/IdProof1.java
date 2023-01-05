package ArrayWithObjectsUsingConstructor;

public class IdProof1 {

	String name, validity;

	IdProof1(String name, String val) {
		this.name = name;
		validity = val;
	}

	public String toString() {
		return name + " " + validity;
	}

}
