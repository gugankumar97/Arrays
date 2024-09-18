package ArraysConcept;

import java.util.Arrays;

public class DemoArrays {

	public static void main(String[] args) {
		
		int[] intArr = new int[10];  // (Initialization) [10] is size not a value
		
		System.out.println("length of a array:"+intArr.length); //  it shows a length
	    System.out.println("value of array:"+intArr); // reference data type so it shows a address
		System.out.println("index of int array:"+intArr[9]);  // default value of int 0
	
		double[] doubleArr = new double[10];
		
		System.out.println("value of array:"+doubleArr); // reference data type so it shows a address
		System.out.println("index of double array:"+doubleArr[0]);  // default value of double 0.0
		
		boolean[] boolArr = new boolean[10];
		
		System.out.println("index of boolean array:"+boolArr[0]);  // default value of boolean is false
		
		char[] charArr = new char[10];
		
		System.out.println("index of char array:"+charArr[0]);  // default value of char is null
		
		String[] stringArr = new String[10];
		
		System.out.println("index of String array:"+stringArr[0]);  // default value of string is null
		
		int[] arr1 = new int[] { 3, 5, 8 }; // Array declaration
		System.out.println(arr1[2]);

		int[] arr4 = { 6, 3, 4 };
		System.out.println(arr4[2]);
		
		// since it is reference data type it stores the address only
		System.out.println(arr4); 
		
		// To see a value in reference data types use this method (Arrays.tostring())
		System.out.println("Elements in a array:"+Arrays.toString(arr4)); 
		
		// Two Dimensional Arrays
 
		// 1st[] is outer array and 2nd[] is inner array
		int[][] matrix2 = new int[2][4];  // initialization
		
		// {1, 2, 3, 4} is 0th index and {5, 6, 7, 6} is 1st index
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 6 } }; // declaration
		

		System.out.println("Matrix Array index value of matrix[1][2] = " + matrix[1][2]);

        System.out.println("Matrix Array index value of matrix[0] = " + Arrays.toString(matrix[0]));
		System.out.println("Matrix Array index value of matrix[1] = " + Arrays.toString(matrix[1]));
		System.out.println("Matrix Array index value of matrix2[0][2] = " + matrix2[0][2]);

		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
		System.out.println(matrix[1].length);

	     System.out.println(Arrays.deepToString(matrix)); // to see all values in a single line
		
		// sort an array
		Arrays.sort(arr4);
		System.out.println("After Sorting, Elements in Array arr4 =" + Arrays.toString(arr4));
		
		// Three Dimensional Array
		int [][][] testarray = new int [2][3][4]; // Initialization
		int[][][] testArray = new int[][][] { { { 1, 2, 3, 4 }, { 3, 4, 5, 6 }, { 3, 2, 5, 6 } },
			{ { 3, 4, 5, 6 }, { 6, 7, 8, 3 }, { 6, 1, 3, 9 } } };  // declaration

	     System.out.println(Arrays.deepToString(testArray)); // to see all values in a single line
		

	}

}
