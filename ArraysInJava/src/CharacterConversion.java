
public class CharacterConversion {
	
	void replaceChar(char ch[]) {
		System.out.print("After Replace Character Array is: ");
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = ((char) (ch[i] - 32));
			} else if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = ((char) (ch[i] + 32));
			}
			System.out.print(ch[i] + " ");
			/*
			 * if(ch[i]=='a') { ch[i]=Character.toUpperCase(ch[i]); }else if(ch[i]=='B') {
			 * ch[i]=Character.toLowerCase(ch[i]); }
			 */
//			System.out.println(ch[i]);
		}

	}

	public static void main(String[] args) {
		
		char ch[] = { 'a', 'B', 'c', 'D', 'e', 'F', 'g', 'H', 'i' };
		System.out.print("Before Replace Character Array is: ");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		System.out.println();
		
		CharacterConversion ch1=new CharacterConversion();
		ch1.replaceChar(ch);

	}

}
