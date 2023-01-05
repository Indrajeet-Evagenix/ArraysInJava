package ArrayWithObjects;

public class Student {

	int id, marks;
	String dept, name;

	Student(int id, String name, String dept, int mark) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.marks = mark;
	}

	public String toString() {
		return id + " " + name + " " + dept + " " + marks;
	}

}
