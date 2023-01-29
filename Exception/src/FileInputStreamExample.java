import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

	static void readFileData() {
		FileInputStream file = new FileInputStream("C:\\Users\\Indrajeet Gupta\\Desktop\\NotepadRun\\Test.txt");

		int i;
		while ((i = file.read()) != -1) {
			System.out.println((char) i);
		}
		System.out.println();
	}


	public static void main(String[] args)throws IOException {
//		try
//		{
//			FileInputStream file = new FileInputStream("C:\\Users\\Indrajeet Gupta\\Desktop\\NotepadRun\\Test.txt");
//
//			int i;
//			while ((i = file.read()) != -1) {
//				System.out.println((char) i);
//			}
//			System.out.println();
//		}catch(
//		IOException e)
//		{
//			e.printStackTrace();
//		}
//		System.out.println("Done");
//
	}

}
