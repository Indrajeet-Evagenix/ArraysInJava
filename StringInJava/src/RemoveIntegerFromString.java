import java.util.Arrays;

public class RemoveIntegerFromString {

	public static void main(String[] args) {
		String s = "Java5Core6Language4";
		int sum = 0;
//		String str[]=s.split(" ");

//		System.out.println(Arrays.toString(str));

		// Using charAt function

//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
//				sum=sum+((s.charAt(i)-'0'));
//				System.out.println(s.charAt(i));
//			}
//		}
//		System.out.println("Sum of Numeric Value is: "+sum);

		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= '0' && ch[i] <= '9') {
				sum = sum + (ch[i] - 48);
				System.out.println(ch[i]);
			}
		}
		System.out.println("Sum of Numeric Value is: " + sum);

	}

}
