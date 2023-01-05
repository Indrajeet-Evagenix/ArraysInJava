package ArrayWithObjects;
import java.util.Scanner;

public class StudentgetterSetterMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		StudentGetterSetter stud[]=new StudentGetterSetter[10];
		
		for(int i=0;i<2;i++) {
			
			System.out.println("Enter id, Name, Dept, Marks");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			int mark=sc.nextInt();
			
			StudentGetterSetter st=new StudentGetterSetter();
			st.setId(id);
			st.setName(name);
			st.setDept(dept);
			st.setMarks(mark);
			
			stud[i]=st;
//			System.out.println(s);
		}
		
		for(StudentGetterSetter s:stud) {
			if(s.marks>80)
			System.out.println(s);
		}
		
		

	}

}
