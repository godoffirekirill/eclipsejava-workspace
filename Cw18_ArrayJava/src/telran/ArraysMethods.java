package telran;

public class ArraysMethods {

	public static void printIntArray(int[]arr) {
		if(arr == null)
			return;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

	public static void printDoubleArray(double[] arr) {
		if(arr == null)
			return;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

	public static void printBooleanArray(boolean[] arr) {
		if(arr == null)
			return;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();		
	}

	public static void printStringArray(String[] arr) {
		if(arr == null)
			return;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();		
	}
	
	public static void fillArray(int[] arr, int min, int max) 
	{
		if(arr == null || min > max)
			return;
		for (int i = 0; i < arr.length; i++)
		{
			Math.random(); // 0.1; 0,7; 0,55 * 10 => 1.0; 7.0; 5.5 => (int) 1, 7 , 5 => {10, 20} +10
			arr[i] =  min +(int)(Math.random()*(max - min +1));
		}
	}
	
	public static int[] clone(int[] arr) {
		if(arr == null)
			return null;
		int[] res = new int[arr.length];
		for (int i = 0; i < res.length; i++) {
			res[i] = arr[i];
		}
		return res;
	}
	}



