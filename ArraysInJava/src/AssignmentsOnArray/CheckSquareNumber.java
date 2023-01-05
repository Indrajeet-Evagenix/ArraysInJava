package AssignmentsOnArray;

// WAP to display all square number in array. Means e.g. 
// arr[] = [23, 43, 25, 49, 12, 9, 78, 66, 39, 0] so output is 25, 49, 9.

public class CheckSquareNumber {
	
	int findSquare(int arr) {
		
			if(Math.sqrt(arr)==Math.floor(Math.sqrt(arr))) {
				return arr;
			}
			else {
				return 0;
			}
			
		
		
	}

	public static void main(String[] args) {
		int arr[]= {23, 43, 25, 49, 12, 9, 78, 66, 39, 0};
		
		CheckSquareNumber cs=new CheckSquareNumber();
		for(int i=0;i<arr.length;i++) {
			cs.findSquare(arr[i]);
		}
		

	}

}
