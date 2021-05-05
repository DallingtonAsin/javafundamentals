package arrays;

public class Example {
	
	
	private static int sumofArrayItems(int []num) {
		int sum = 0;
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		return sum;
	}
	
	private static void printArrayItems(int []num) {
	
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+",");
		}
	}
	
	// multidimensional array
	
	public static void printMultidimensionalArray() {
		
		int arr[][] = {{1,2,3},{2,4,5},{4,4,5}};
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		
	int arr[] = {89, 90, 12, 45, 90};
	
	// Print array items
	printArrayItems(arr);
	
	// Print sum of the array
	System.out.println("\nThe sum of elements in this array is "+sumofArrayItems(arr));
	
	// print multidimensional array
	 printMultidimensionalArray();
		
	}

}
