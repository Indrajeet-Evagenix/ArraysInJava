import java.util.Arrays;

public class ArrayExample {

	public void sumOfDigit() {

	}

	public void find(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == 10) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
	}

	void longString(String str[]) {

		int max = str[0].length();
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() > max) {
				max = str[i].length();
				System.out.println(str[i] + "---->" + max);
			}
		}

	}

	void duplicate(int ch[]) {
		System.out.print("Duplicate Numbers: ");
		for (int i = 0; i < ch.length; i++) {
			int cnt = 0;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					cnt++;
					ch[j] = '\0';
				}
			}
			if (cnt == 0 && ch[i] != '\0') {
				System.out.print(ch[i] + " ");
			}
			if (cnt != 0 && ch[i] != '\0') {
				System.out.print(ch[i] + " ");
			}
		}
	}

	public void duplicateWord(String str) {
		String str1[] = str.split(" ");
		System.out.println();
		System.out.println(Arrays.toString(str1));

		for (int i = 0; i < str1.length; i++) {
			int count = 0;
			for (int j = i + 1; j < str1.length; j++) {
				if (str1[i].equalsIgnoreCase(str1[j])) {
					count++;
					str1[j] = "\0";
				}
			}
			if (count != 0 && str1[i] != "\0") {
				System.out.print(str1[i] + " ");
			}
		}
	}

	public void characterCase(String str) {
		System.out.println();
		System.out.println(str);
		char ch[] = str.toCharArray();
		System.out.println(Arrays.toString(ch));
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = ((char) (ch[i] - 32));
			} else if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = ((char) (ch[i] + 32));
			}
//			System.out.println(ch[i] + " ");
		}
		String s = new String(ch);
		System.out.println(s);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 5 };
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 5 };
		int arr2[] = { 10, 20, 30, 40, 50, 10, 20, 10, 10, 20, 60 };

		String str[] = { "Java", "India", "Core", "Advanced" };
		String str1 = "India is my country and India is best country";

		String str2 = "ZenSar";

		ArrayExample ae = new ArrayExample();
		ae.find(arr1);
		ae.longString(str);
		ae.duplicate(arr2);
		ae.duplicateWord(str1);
		ae.characterCase(str2);
		System.out.println();

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 5) {
				if (arr[i] % 2 == 0) {
					sum = sum + 1;
				} else {
					sum = sum + 3;
				}
			} else {
				sum = sum + 5;
			}
		}
		System.out.println(sum);

	}

}
