package telran;

public class ArrayUtils {

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
	
	public static void printArray(int[]arr) {
		if(arr == null)
			return;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}
	public static void bubbleSort(int arr[]) {
		if(arr == null)
			return;
		for (int i = 0; i < arr.length - 1; i++) {
			boolean flag = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j + 1, j);
					flag = false;
				}
			}
			if (flag == true) {
				return;
			}
				
		
	}	
	}
	
	public static void selectSort(int arr[]) {
		int i, j, min, indexMin;
		// 5 7 24 56
		for(i =0; i < arr.length; i++){
			min = arr[i];
			indexMin = i;
			for(j = i +1; j < arr.length; j++){
				if(arr[j] < min){
					min = arr[j];
					indexMin = j;
				}
			}
			if(indexMin != i)
				swap(arr, i, indexMin);
		}
	}
	
	public static void firstPosLastNegReverse(int arr[]) {
	    
        for(int i = 0; i < arr.length - 1; i++){
        	boolean flag = true;
            for(int j = 0; j < arr.length -1 -i; j++){
                if(arr[j] > 0 && arr[j + 1] < 0){
                    swap(arr, j+1, j);
                    flag = false;
                }
            }
            if(flag == true)
                return;
        }
	}
	
	 public static int[] reverseArray(int[] arr) {
	        int[] reversedArr = new int[arr.length]; 
	        int index = 0; 

	        for (int i = arr.length - 1; i >= 0; i--) {
	            reversedArr[index] = arr[i];
	            index++;
	        }

	        return reversedArr; 
	    }
	
	
	
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}

