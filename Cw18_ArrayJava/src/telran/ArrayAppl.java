package telran;

public class ArrayAppl {

	public static void main(String[] args) {
//=============Option 1===========
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] arr1 = { 3, 4, 6, 7, 8 };
		System.out.println(arr[5]);
	//	System.out.println(arr1[10]);  => ArrayIndexOutOfBoundsException
	//	int arr [2120];
		System.out.println(arr1.length);
		
		int[] arr2 = null;
		int x;
	//==========Option 2=============	
		arr2 = new int[20];
		
		System.out.println(arr2);
		System.out.println(arr2.length);
		ArraysMethods.printIntArray(arr2);
		
		double[] arr4 = new double[10];
		ArraysMethods.printDoubleArray(arr4);
		
		boolean[] arr5 = new boolean[5];
		ArraysMethods.printBooleanArray(arr5);
		
		String[] strs = new String[3];
		ArraysMethods.printStringArray(strs);
		
		strs[0] = "Hello";
		ArraysMethods.printStringArray(strs);
		
		String[] atrs2 = strs;
		atrs2[1] = "World";
		ArraysMethods.printStringArray(strs);
		
		ArraysMethods.fillArray(arr2, -10, 10);
		ArraysMethods.printIntArray(arr2);
		
		int[] arr6 = ArraysMethods.clone(arr2);
		System.out.println(arr6 == arr2);
		System.out.println(arr6[9] == arr2[9]);
		
		System.out.println("End of programm");
	}

}
