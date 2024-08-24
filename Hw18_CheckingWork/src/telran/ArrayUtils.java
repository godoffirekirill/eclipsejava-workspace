package telran;

public class ArrayUtils {
	public static void bubbleSort(int[] ar) {
		if(ar == null) {
			System.out.println("Null reference");
			return;
		}
			
		for( int i = 0; i < ar.length -1; i++) {
			boolean flag = false;
			for(int j = 0; j < ar.length -1 - i; j++) {
				if(ar[j] > ar[j+1]) {
					swap(ar, j, j+1);
					flag = true;
				}
			}
			if(!flag)	break;
		}
	}

	private static void swap(int[] ar, int j, int i) {		
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] =temp;	
	}
	
	public static void printIntArray(int[]arr) {
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
			Math.random(); 
			arr[i] =  min +(int)(Math.random()*(max - min +1));
		}
}

	public static void selectSort(int[] ar) {
		if(ar == null) {
			System.out.println("Null reference");
			return;	
		}
			for(int i  = 0; i < ar.length -1; i++) {
				int minIndex = i;
				for(int j = i + 1; j < ar.length; j++) {
					if(ar[j] < ar[minIndex]) {
						minIndex = j;
					}
					swap(ar, i,minIndex);
			}
	}
}

	public static void firstPosLastNegReverse(int[] ar) {
		if(ar == null) {
			System.out.println("Null reference");
			return;	
		}
		int firstPosIndex = -1;
		int lastNegIndex = -1;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] > 0 && firstPosIndex == -1)
				firstPosIndex = i;
			if(ar[i] <0)
				lastNegIndex =i;
		}
		if(firstPosIndex !=-1 && lastNegIndex != -1)
			swap(ar, firstPosIndex, lastNegIndex);
	}

	public static int[] reverseArray(int[] ar) {
		if(ar == null) {
			System.out.println("Null reference");
			return new int[0];	
		}
		int[] res = new int[ar.length];
		for (int i = 0, j = res.length - 1; i < res.length; i++, j --) {
			res[i] = ar[j];
		}
		return res;
	}
}
