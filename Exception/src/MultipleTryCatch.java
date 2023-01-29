
public class MultipleTryCatch {

	public static void main(String[] args) {
		int a = 200, b = 2;
		int arr[] = { 10, 20, 30, 40, 50 };
		String s = "India";
		String st = null;

		try {
			System.out.println("Division is: " + (a / b));
			System.out.println("Element at index: " + arr[1]);
			System.out.println("Character at: " + s.charAt(2));
			System.out.println(st.length());
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

		// we can write in one catch block multiple exception except 'exception'
//		catch(ArithmeticException | ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e){
//			System.out.println(e);
//		}catch(Exception e){
//			System.out.println(e);
//		}
		System.out.println("Done");

	}

}
