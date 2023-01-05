
public class RemoveAllDuplicateWordsInString {

	void countWords(String st) {

		String[] words = st.split(" ");

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					if (i != j)
						words[i] = "";

				}
			}
		}

		System.out.println("Removing Duplicate words:\n");
		for (int i = 0; i < words.length; i++) {

			if (words[i] != "") {
				System.out.print(words[i] + " ");

			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Input String");
		String input = "Welcome to java programming programming";
		System.out.println(input);

		RemoveAllDuplicateWordsInString ra = new RemoveAllDuplicateWordsInString();
		ra.countWords(input);
	}

}
