package ArrayWithObjects;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The Size");
//		int size=sc.nextInt();
		
//		Student stud[]=new Student[size];
		Student stud[]=new Student[10];
		
		stud[0]= new Student(101,"Indrajeet","Computer",85);
		stud[1]= new Student(102,"Akash","Extc",95);
		stud[2]= new Student(103,"Sunil","Civil",75);
		stud[3]= new Student(104,"Prashant","Mechanical",65);
		stud[4]= new Student(105,"Amarjeet","Computer",85);
		stud[5]= new Student(106,"Jitendra","Civil",81);
		stud[6]= new Student(107,"Mukesh","Mechanical",78);
		stud[7]= new Student(108,"Pankaj","Computer",91);
		stud[8]= new Student(109,"Pawan","Extc",74);
		stud[9]= new Student(110,"Aashish","Civil",89);
		
		// Take Input From User
//		for(int i=0;i<size;i++) {
//			System.out.println("Enter id, Name, Dept, Marks");
//			int id=sc.nextInt();
//			String name=sc.next();
//			String dept=sc.next();
//			int mark=sc.nextInt();
//			
//			stud[i]=new Student(id,name,dept,mark); 
//		}
		
		for(Student s:stud) {
//			if(s.marks>90)
//			if(s.marks>90 && s.dept.equals("Computer"))
//			if(s.name.equals("Sunil"))
			if(s.marks>80)
			System.out.println(s);
		}

	}

}
